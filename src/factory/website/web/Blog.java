package factory.website.web;

import factory.website.AboutPage;
import factory.website.CommentPage;
import factory.website.ContactPage;
import factory.website.PostPage;

public class Blog extends Website{

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
