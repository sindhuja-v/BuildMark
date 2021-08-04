package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.R;
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
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "ULTRA TECH", "https://i.ibb.co/sHVXZDm/Screenshot-2021-05-10-07-59-18-44.jpg");
        categoryList.add(category);
        category = new Category("2", "ACC", "https://i.ibb.co/q5Jty8j/Screenshot-2021-05-17-12-51-18-71.jpg");
        categoryList.add(category);

        category = new Category("3", "RAMCO", "https://i.ibb.co/NTxWqwW/Screenshot-2021-05-17-12-51-45-24.jpg");
                categoryList.add(category);
        category = new Category("4", "SHREE CEMENT LIMITED", "https://i.ibb.co/5RPzYfc/Screenshot-2021-05-17-12-52-21-80.jpg");
        categoryList.add(category);
        category = new Category("5", "JSW", "https://i.ibb.co/M7YBjMx/Screenshot-2021-05-10-08-01-40-68.jpg");
        categoryList.add(category);
        category = new Category("6", "FIXIT", "https://i.ibb.co/0nFVmd9/Screenshot-2021-05-17-12-52-48-90.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Cement", "", "1 Kg", "Rs.", "200", "10% OFF", "https://i.ibb.co/DW4gd1P/IMG-20210502-WA0004.jpg");
        productList.add(product);
        product = new Product("2", "1", "Hollow Bricks", "", "1 Kg", "Rs.", "100", "20% OFF", "https://i.ibb.co/s9rG557/IMG-20210502-WA0014.jpg");
        productList.add(product);
        product = new Product("3", "2", "Glass", "", "1 Lit.", "Rs.", "255", "", "https://i.ibb.co/R6qd8wy/IMG-20210502-WA0037.jpg");
        productList.add(product);
        product = new Product("4", "2", "Aggregate", "", "1 Piece", "Rs.", "180", "", "https://i.ibb.co/F3sQpVp/IMG-20210502-WA0028.jpg");
        productList.add(product);
        product = new Product("5", "3", "Burnt Clay Bricks", "", "300 Pieces", "Rs.200", "20", "10% OFF", "https://i.ibb.co/3f4Fmsw/Screenshot-2021-05-17-12-22-40-52.jpg");
        productList.add(product);
        product = new Product("6", "3", "Stone", "", "500M", "Rs.", "310", "", "https://i.ibb.co/VS7NzBz/Screenshot-2021-05-17-12-23-26-46.jpg");
        productList.add(product);
        product = new Product("7", "4", "Clay", "", "1 Kg", "Rs.", "200", "", "https://i.ibb.co/s5NNLdS/IMG-20210502-WA0048.jpg");
        productList.add(product);
        product = new Product("8", "4", "Perforated brick", "", "1 Kg", "Rs.", "250", "", "https://i.ibb.co/s5NNLdS/IMG-20210502-WA0048.jpg");
        productList.add(product);
        product = new Product("9", "5", "Rubble", "", "1 ton", "Rs.", "300", "", "https://i.ibb.co/s5NNLdS/IMG-20210502-WA0048.jpg");
        productList.add(product);
        product = new Product("10", "5", "Concrete", "", "1 Kg", "Rs.", "100", "", "https://i.ibb.co/gzLH8bm/IMG-20210502-WA0023.jpg");
        productList.add(product);
        product = new Product("11", "6", "Tiles", "", "40 Pieces", "Rs.", "199", "", "https://i.ibb.co/RD851TT/IMG-20210502-WA0018.jpg");
        productList.add(product);
        product = new Product("12", "6", "Bricks", "", "1 Kg", "Rs.", "400", "", "https://i.ibb.co/Qd6MPr6/IMG-20210502-WA0046.jpg");
        productList.add(product);
        product = new Product("13", "1", "M Sand", "", "1 Kg", "Rs.", "300  ", "30%OFF", "https://i.ibb.co/K5z8Bwv/Screenshot-2021-05-17-12-24-50-39.jpg");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Bricks", "", "1 Kg", "Rs.", "200", "10% OFF", "https://i.ibb.co/ZBJrqKW/IMG-20210502-WA0013.jpg");
        newList.add(product);
        product = new Product("2", "1", "Cement", "", "1 kg", "Rs.", "100", "20% OFF", "https://i.ibb.co/NVKnjRJ/IMG-20210502-WA0003.jpg");
        newList.add(product);
        product = new Product("3", "2", "Glass", "", "1 Kg", "Rs.", "300", "", "https://i.ibb.co/XSG63F0/IMG-20210502-WA0037.jpg");
        newList.add(product);
        product = new Product("4", "2", "Sand", "", "2 Kg", "Rs.", "100", "", "https://i.ibb.co/6ms3Hy5/IMG-20210502-WA0007.jpg");
        newList.add(product);
        product = new Product("5", "3", "Aggregate", "", "1 Kg", "Rs", "400", "10% OFF", "https://i.ibb.co/ydXvD5f/IMG-20210502-WA0029.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Bricks", "", "1 Kg", "Rs.", "200", "","https://i.ibb.co/ZBJrqKW/IMG-20210502-WA0013.jpg");
        popularList.add(product);
        product = new Product("7", "4", "Cement", "", "1 Kg", "Rs.", "100", "", "https://i.ibb.co/NVKnjRJ/IMG-20210502-WA0003.jpg");
        popularList.add(product);
        product = new Product("8", "4", "Concrete", "", "1 Kg", "Rs.", "200", "", "https://i.ibb.co/QXKNBMy/IMG-20210502-WA0028.jpg");
        popularList.add(product);
        product = new Product("9", "5", "Sand", "", "1 Kg", "Rs.", "100", "", "https://i.ibb.co/6ms3Hy5/IMG-20210502-WA0007.jpg");
        popularList.add(product);
        product = new Product("10", "5", "Aggregate", "", "1 Kg", "Rs.", "300", "", "https://i.ibb.co/ydXvD5f/IMG-20210502-WA0029.jpg");
        popularList.add(product);
        product = new Product("11", "6", "Tiles", "", "1 Kg", "Rs.", "200", "", "https://i.ibb.co/C53z046/IMG-20210502-WA0019.jpg");
        popularList.add(product);
        product = new Product("12", "6", "Glasses", "", "1 Kg", "Rs.", "200", "", "https://i.ibb.co/XSG63F0/IMG-20210502-WA0037.jpg");
        popularList.add(product);
        product = new Product("13", "1", "Hollow Bricks", "", "1 Kg", "Rs.", "100", "30%OFF","https://i.ibb.co/rM02CKk/IMG-20210502-WA0047.jpg");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://i.ibb.co/sHVXZDm/Screenshot-2021-05-10-07-59-18-44.jpg");
        offerList.add(offer);
        offer = new Offer("https://i.ibb.co/q5Jty8j/Screenshot-2021-05-17-12-51-18-71.jpg");
        offerList.add(offer);
        offer = new Offer("https://i.ibb.co/NTxWqwW/Screenshot-2021-05-17-12-51-45-24.jpg");
        offerList.add(offer);
        offer = new Offer("https://i.ibb.co/5RPzYfc/Screenshot-2021-05-17-12-52-21-80.jpg");
        offerList.add(offer);
        offer = new Offer("https://i.ibb.co/M7YBjMx/Screenshot-2021-05-10-08-01-40-68.jpg");
        offerList.add(offer);
        offer = new Offer("https://i.ibb.co/0nFVmd9/Screenshot-2021-05-17-12-52-48-90.jpg");
        offerList.add(offer);



        return offerList;
    }
}
