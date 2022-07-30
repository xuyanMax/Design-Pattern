package factory.website;

import factory.website.web.Website;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");
//        Website site = WebsiteFactory.getWebsiteByEnum(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("shop");
        System.out.println(site.getPages());
    }
}
