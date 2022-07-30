package factory.website;

import factory.website.web.Blog;
import factory.website.web.Shop;
import factory.website.web.Website;

public class WebsiteFactory {
    public static Website getWebsite(String type) {
        switch (type) {
            case "blog":
                return new Blog();
            case "shop":
                return new Shop();
            default:
                return null;
        }
    }

    public static Website getWebsiteByEnum(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
