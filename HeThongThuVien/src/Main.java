import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        //Tao thu vien
        Library library = new Library();

        //Tạo sách
        Book b1 = new Book("B1", "A", 200);
        Book b2 = new Book("B2", "B", 100);

        //Add sách vào thư viện
        library.addBook(b1);
        library.addBook(b2);

        //Search and Borrow book
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên sách");
        String title = scanner.nextLine();

        System.out.println("Nhập vào tên tác giả: ");
        String author = scanner.nextLine();

        System.out.println("Nhập vào số trang: ");
        int numberOfPages = scanner.nextInt();

        Book book = new Book(title, author,numberOfPages);
        library.addBook(book);

        System.out.println("Tất cả sách trong kho gồm:");
        library.showBooks();
        scanner.close();

    }
}