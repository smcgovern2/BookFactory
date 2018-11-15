package BookFactory;

public class BookFactory {

    public Book getMeal(BookType bookType){
        switch (bookType){
            case FICTION: return new Fiction();
            case BIOGRAPHY: return new Biography();
            case GRAPHIC_NOVEL: return new GraphicNovel();
            default: return null;
        }


    }
}
