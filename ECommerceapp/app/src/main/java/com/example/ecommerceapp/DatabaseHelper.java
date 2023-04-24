package com.example.ecommerceapp;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "ecommerce.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "shopping_cart";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_PRODUCT_ID = "product_id";
    public static final String COLUMN_PRODUCT_NAME = "product_name";
    public static final String COLUMN_QUANTITY = "quantity";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "

    }

}
