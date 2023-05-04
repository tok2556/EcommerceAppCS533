package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.model.Category;
import com.quintus.labs.grocerystore.model.Offer;
import com.quintus.labs.grocerystore.model.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Action", "https://image.flaticon.com/icons/png/512/262/262344.png");
        categoryList.add(category);
        category = new Category("3", "Strategy", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "2", "Cult of the Lamb", "Start your own cult in a land of false prophets, venturing out into diverse and mysterious regions to build a loyal community of woodland Followers and spread your Word to become the one true cult.", "USD", "16.24", "35% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1313140/header_alt_assets_1.jpg?t=1682355454");
        productList.add(product);

        product = new Product("2", "1", "STAR WARS Jedi: Survivor™", "The story of Cal Kestis continues in STAR WARS Jedi: Survivor™, a galaxy-spanning, third-person, action-adventure game. ", "USD", "$69.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        productList.add(product);

        product = new Product("3", "1", "Marvel’s Spider-Man Remastered", "In Marvel’s Spider-Man Remastered, the worlds of Peter Parker and Spider-Man collide in an original action-packed story. Play as an experienced Peter Parker, fighting big crime and iconic villains in Marvel’s New York. Web-swing through vibrant neighborhoods and defeat villains with epic takedowns.", "USD", "$59.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/1817070/header.jpg?t=1673999865");
        productList.add(product);

        product = new Product("4", "1", "Stick Fight: The Game", "Stick Fight is a physics-based couch/online fighting game where you battle it out as the iconic stick figures from the golden age of the internet. ", "USD", "$4.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/674940/header.jpg?t=1667202217");
        productList.add(product);

        product = new Product("5", "2", "Portal 2", "The \"Perpetual Testing Initiative\" has been expanded to allow you to design co-op puzzles for you and your friends!", "USD", "9.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/620/header.jpg?t=1683129624");
        productList.add(product);

        product = new Product("6", "1", "DRAGON BALL Z: KAKAROT", "Relive the story of Goku and other Z Fighters in DRAGON BALL Z: KAKAROT! Beyond the epic battles, experience life in the DRAGON BALL Z world as you fight, fish, eat, and train with Goku, Gohan, Vegeta and others. ", "USD", "$21.24", "75% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/851850/header.jpg?t=1674590851");
        productList.add(product);

        product = new Product("7", "1", "God of War", "His vengeance against the Gods of Olympus years behind him, Kratos now lives as a man in the realm of Norse Gods and monsters. It is in this harsh, unforgiving world that he must fight to survive… and teach his son to do the same.", "USD", "$49.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/1593500/header.jpg?t=1650554420");
        productList.add(product);

        product = new Product("8", "2", "Sid Meier’s Civilization® VI", "Civilization VI is the newest installment in the award winning Civilization Franchise. Expand your empire, advance your culture and go head-to-head against history’s greatest leaders. Will your civilization stand the test of time? ", "USD", "$59.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/289070/header.jpg?t=1680898825");
        productList.add(product);

        product = new Product("9", "2", "Stellaris", "Explore a galaxy full of wonders in this sci-fi grand strategy game from Paradox Development Studios. Interact with diverse alien races, discover strange new worlds with unexpected events and expand the reach of your empire. Each new adventure holds almost limitless possibilities.", "USD", "$39.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/281990/header.jpg?t=1682438796");
        productList.add(product);

        product = new Product("10", "2", "Cities: Skylines", "Cities: Skylines is a modern take on the classic city simulation. The game introduces new game play elements to realize the thrill and hardships of creating and maintaining a real city whilst expanding on some well-established tropes of the city building experience. ", "USD", "$29.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/255710/header.jpg?t=1682582521");
        productList.add(product);

        product = new Product("11", "2", "Crusader Kings III", "Love, fight, scheme, and claim greatness. Determine your noble house’s legacy in the sprawling grand strategy of Crusader Kings III. Death is only the beginning as you guide your dynasty’s bloodline in the rich and larger-than-life simulation of the Middle Ages.", "USD", "$49.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/1158310/header.jpg?t=1683128207");
        productList.add(product);

        product = new Product("12", "2", "Inscryption", "Inscryption is an inky black card-based odyssey that blends the deckbuilding roguelike, escape-room style puzzles, and psychological horror into a blood-laced smoothie. Darker still are the secrets inscrybed upon the cards...", "USD", "$11.99", "40% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1092790/header.jpg?t=1660265312");
        productList.add(product);

        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "STAR WARS Jedi: Survivor™", "The story of Cal Kestis continues in STAR WARS Jedi: Survivor™, a galaxy-spanning, third-person, action-adventure game. ", "USD", "$69.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        newList.add(product);

        product = new Product("2", "1", "DRAGON BALL Z: KAKAROT", "Relive the story of Goku and other Z Fighters in DRAGON BALL Z: KAKAROT! Beyond the epic battles, experience life in the DRAGON BALL Z world as you fight, fish, eat, and train with Goku, Gohan, Vegeta and others. ", "USD", "$21.24", "75% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/851850/header.jpg?t=1674590851");
        newList.add(product);
        product = new Product("12", "2", "Inscryption", "Inscryption is an inky black card-based odyssey that blends the deckbuilding roguelike, escape-room style puzzles, and psychological horror into a blood-laced smoothie. Darker still are the secrets inscrybed upon the cards...", "USD", "$11.99", "40% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1092790/header.jpg?t=1660265312");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("1", "1", "STAR WARS Jedi: Survivor™", "The story of Cal Kestis continues in STAR WARS Jedi: Survivor™, a galaxy-spanning, third-person, action-adventure game. ", "USD", "$69.99", "", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        productList.add(product);

        product = new Product("2", "1", "DRAGON BALL Z: KAKAROT", "Relive the story of Goku and other Z Fighters in DRAGON BALL Z: KAKAROT! Beyond the epic battles, experience life in the DRAGON BALL Z world as you fight, fish, eat, and train with Goku, Gohan, Vegeta and others. ", "USD", "$21.24", "75% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/851850/header.jpg?t=1674590851");
        popularList.add(product);

        product = new Product("3", "1", "God of War", "His vengeance against the Gods of Olympus years behind him, Kratos now lives as a man in the realm of Norse Gods and monsters. It is in this harsh, unforgiving world that he must fight to survive… and teach his son to do the same.", "USD", "$49.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/1593500/header.jpg?t=1650554420");
        popularList.add(product);

        new Product("4", "2", "Cities: Skylines", "Cities: Skylines is a modern take on the classic city simulation. The game introduces new game play elements to realize the thrill and hardships of creating and maintaining a real city whilst expanding on some well-established tropes of the city building experience. ", "USD", "$29.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/255710/header.jpg?t=1682582521");
        productList.add(product);

        product = new Product("5", "2", "Crusader Kings III", "Love, fight, scheme, and claim greatness. Determine your noble house’s legacy in the sprawling grand strategy of Crusader Kings III. Death is only the beginning as you guide your dynasty’s bloodline in the rich and larger-than-life simulation of the Middle Ages.", "USD", "$49.99 ", "", "https://cdn.akamai.steamstatic.com/steam/apps/1158310/header.jpg?t=1683128207");
        productList.add(product);

        product = new Product("6", "2", "Inscryption", "Inscryption is an inky black card-based odyssey that blends the deckbuilding roguelike, escape-room style puzzles, and psychological horror into a blood-laced smoothie. Darker still are the secrets inscrybed upon the cards...", "USD", "$11.99", "40% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1092790/header.jpg?t=1660265312");
        productList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://gamepreorders.com/wp-content/uploads/2010/12/amazon-sale-75-off1.gif");
        offerList.add(offer);
        offer = new Offer("https://assets-prd.ignimgs.com/2022/06/10/amazing-best-buy-sale-this-weekend-three-day-fathers-day-ign-1654858826850.png");
        offerList.add(offer);
        offer = new Offer("https://www.filmfad.com/wp-content/uploads/2017/02/Weekly-Gaming-Deals.jpg");
        offerList.add(offer);
        offer = new Offer("https://gameranx.com/wp-content/uploads/2020/03/20200329_03al_yQQDC.jpg");
        offerList.add(offer);
        offer = new Offer("https://www.shutterstock.com/image-illustration/shopping-cart-hovering-joystick-bank-260nw-2218733015.jpg");
        offerList.add(offer);
        offer = new Offer("https://www.kotaku.com.au/wp-content/uploads/sites/3/2014/04/08/tz3cr6hr0kx1elbssrwe.png");
        offerList.add(offer);


        return offerList;
    }

    public static void generateJsonFileFromGameData(List<Product> productList, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(productList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

