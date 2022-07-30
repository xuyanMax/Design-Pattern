package prototype.ex2;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadHistory();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadHistory() {
        Movie movie = new Movie();
        Book book = new Book();

        movie.setMovieName("Four Seasons");
        movie.setPrice(50.55);
        movie.setUrl("https://movie.com");

        items.put("Book", book);
        items.put("Movie", movie);
    }
}
