package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.model.Category;
import com.quintus.labs.grocerystore.model.Offer;
import com.quintus.labs.grocerystore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */
public class Data {
    // Declaring all the lists for products
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> ActionList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    // Declaring Categories
    public List<Category> getCategoryList() {
        Category category = new Category("1", "Action", "");
        categoryList.add(category);
        category = new Category("2", "Strategy", "");
        categoryList.add(category);
        category = new Category("3", "RPG", "");
        categoryList.add(category);
        category = new Category("4", "Sports", "");
        categoryList.add(category);
        return categoryList;
    }

    // Data on product list for All
    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Star Wars: Jedi Survivor", "", "500g", "$", "70", "10% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        productList.add(product);
        product = new Product("2", "1", "God of War", "", "500g", "$", "50", "20% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1593500/header.jpg?t=1650554420");
        productList.add(product);
        product = new Product("3", "2", "Stellaris", "", "500g", "$", "50", "", "https://cdn.akamai.steamstatic.com/steam/apps/281990/header.jpg?t=1682438796");
        productList.add(product);
        product = new Product("4", "2", "Crusader Kings III", "", "500g", "$", "50", "", "https://cdn.akamai.steamstatic.com/steam/apps/1158310/header.jpg?t=1683128207");
        productList.add(product);
        product = new Product("5", "3", "Cult of the Lamb", "", "500g", "$", "25", "10% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1313140/header_alt_assets_1.jpg?t=1682355454");
        productList.add(product);
        product = new Product("6", "3", "Cities: Skylines", "", "500g", "$", "20", "", "https://cdn.akamai.steamstatic.com/steam/apps/255710/header.jpg?t=1682582521");
        productList.add(product);
        return productList;
    }

    // data on 'new' list
    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Star Wars: Jedi Survivor", "", "500g", "$", "70", "10% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        newList.add(product);
        product = new Product("2", "3", "Cities: Skylines", "", "500g", "$", "25", "", "https://cdn.akamai.steamstatic.com/steam/apps/255710/header.jpg?t=1682582521");
        ActionList.add(product);
        product = new Product("2", "1", "God of War", "", "500g", "$", "50", "20% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1593500/header.jpg?t=1650554420");
        newList.add(product);
        product = new Product("3", "2", "Stellaris", "", "500g", "$", "50", "", "https://cdn.akamai.steamstatic.com/steam/apps/281990/header.jpg?t=1682438796");
        newList.add(product);
        product = new Product("5", "3", "Cult of the Lamb", "", "500g", "$", "25", "10% OFF", "https://cdn.akamai.steamstatic.com/steam/apps/1313140/header_alt_assets_1.jpg?t=1682355454");
        newList.add(product);
        return newList;
    }

    // data on popular list
    public List<Product> getPopularList() {
        Product product = new Product("9", "2", "Stellaris", "", "500 g", "$", "50", "", "https://cdn.akamai.steamstatic.com/steam/apps/281990/header.jpg?t=1682438796");
        popularList.add(product);
        product = new Product("11", "3", "Cities: Skylines", "", "500g", "$", "25", "", "https://cdn.akamai.steamstatic.com/steam/apps/255710/header.jpg?t=1682582521");
        popularList.add(product);
        product = new Product("8", "1", "God of War", "", "500 g", "$", "50", "", "https://cdn.akamai.steamstatic.com/steam/apps/1593500/header.jpg?t=1650554420");
        popularList.add(product);
        product = new Product("10", "2", "Star Wars: Jedi Survivor", "", "500 g", "$", "70", "", "https://cdn.akamai.steamstatic.com/steam/apps/1774580/header.jpg?t=1682692236");
        popularList.add(product);
        return popularList;
    }

    // data on offers list
    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://img.freepik.com/free-photo/close-up-spoon-with-roasted-coffee-beans_23-2148251635.jpg?w=740&t=st=1681442397~exp=1681442997~hmac=609227639e674120c412c8dc6535e0526d2afba80b225d95b874d8b6b8440fc8");
        offerList.add(offer);
        offer = new Offer("https://img.freepik.com/free-photo/close-up-spoon-with-roasted-coffee-beans_23-2148251635.jpg?w=740&t=st=1681442397~exp=1681442997~hmac=609227639e674120c412c8dc6535e0526d2afba80b225d95b874d8b6b8440fc8");
        offerList.add(offer);
        offer = new Offer("https://img.freepik.com/free-photo/close-up-spoon-with-roasted-coffee-beans_23-2148251635.jpg?w=740&t=st=1681442397~exp=1681442997~hmac=609227639e674120c412c8dc6535e0526d2afba80b225d95b874d8b6b8440fc8");
        offerList.add(offer);
        return offerList;
    }
}
