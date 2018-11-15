package BookFactory;

public class Biography implements Book {
    private String description;

    public Biography() {
        description = "Grizzly Man";
    }

    @Override
    public void displayBook() {
        System.out.println(description);
    }
}
