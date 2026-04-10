import java.util.ArrayList;
//import java.util.Iterator;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        if (books.isEmpty()){
            System.out.println("Library is empty!");
        }
        for (Book b : books) {
            b.display();
        }
    }
}

