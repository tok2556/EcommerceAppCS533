package com.quintus.labs.grocerystore.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

import com.quintus.labs.grocerystore.data.DatabaseDescription.UserInfo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GameStoreDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "GameStoreapp.db";
    private static final int DATABASE_VERSION = 1;

    private static GameStoreDatabaseHelper sInstance;
    // constructor
    public GameStoreDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized GameStoreDatabaseHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new GameStoreDatabaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    // creates the contacts table when the database is created
    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL for creating the contacts table
        final String CREATE_USERS_TABLE =
                "CREATE TABLE " + UserInfo.TABLE_NAME + "(" +
                        UserInfo._ID + " integer primary key, " +
                        UserInfo.COLUMN_NAME + " TEXT, " +
                        UserInfo.COLUMN_EMAIL + " TEXT, " +
                        UserInfo.COLUMN_MOBILE + " TEXT, " +
                        UserInfo.COLUMN_PASSWORD + " TEXT);";
        db.execSQL(CREATE_USERS_TABLE); // create the contacts table

    }

    public Cursor getUserByEmailAndPassword(EditText email, String password) {
        SQLiteDatabase db = getReadableDatabase();
        String[] projection = {
                DatabaseDescription.UserInfo._ID,
                DatabaseDescription.UserInfo.COLUMN_NAME,
                DatabaseDescription.UserInfo.COLUMN_EMAIL,
                DatabaseDescription.UserInfo.COLUMN_MOBILE
        };
        String selection = DatabaseDescription.UserInfo.COLUMN_EMAIL + " = ? AND "
                + DatabaseDescription.UserInfo.COLUMN_PASSWORD + " = ?";
        String[] selectionArgs = {email.getText().toString(), password};
        return db.query(
                DatabaseDescription.UserInfo.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );
    }

    public static String hashPassword(String password) {
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }

    // normally defines how to upgrade the database when the schema changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // drop the existing table
        db.execSQL("DROP TABLE IF EXISTS " + UserInfo.TABLE_NAME);

        // call onCreate to create a new table with updated schema
        onCreate(db);

    }
}
