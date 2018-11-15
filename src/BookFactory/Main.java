package BookFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        ArrayList<Book> books = new ArrayList<>();

        books.add(bookFactory.getMeal(BookType.FICTION));
        books.add(bookFactory.getMeal(BookType.BIOGRAPHY));
        books.add(bookFactory.getMeal(BookType.GRAPHIC_NOVEL));
        books.add(bookFactory.getMeal(BookType.FICTION));

        for (Book m: books) {
            m.displayBook();
        }
    }
}
