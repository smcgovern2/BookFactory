package BookFactory;

public class GraphicNovel implements Book {
    private String description;
    private boolean isInStock;

    public GraphicNovel() {
        description = "Maus";
        isInStock = true;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + (isInStock?"in stock":"out of stock"));
    }
}
