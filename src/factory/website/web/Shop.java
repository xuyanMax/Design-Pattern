package factory.website.web;

import factory.website.CartPage;
import factory.website.ItemPage;

public class Shop extends Website{

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
