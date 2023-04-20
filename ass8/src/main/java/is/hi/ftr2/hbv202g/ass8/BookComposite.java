package is.hi.ftr2.hbv202g.ass8;

import java.util.ArrayList;
import java.util.List;

public class BookComposite implements BookComponent {
    private String title;
    private List<BookComponent> children;

    public BookComposite(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    public void add(BookComponent bookComponent) {
        children.add(bookComponent);
    }

    public void remove(BookComponent bookComponent) {
        children.remove(bookComponent);
    }

    public List<BookComponent> getChildren() {
        return children;
    }

    @Override
    public void displayInfo() {
        System.out.println("Omnibus: " + title);
        for (BookComponent bookComponent : children) {
            bookComponent.displayInfo();
        }
    }
}
