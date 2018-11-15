package BookFactory;

public class Fiction implements Book {
    String description;
    int pages;

    public Fiction() {
        description = "To Kill a Mockingbird";
        pages = 355;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + pages + " pages.");
    }
}
