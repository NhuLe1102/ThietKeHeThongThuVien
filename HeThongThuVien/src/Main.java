import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        //Tao thu vien
        Library library = new Library();

        //Tạo sách
        Book b1 = new Book("B1","A","Nho ",1);
        Book b2 = new Book("B2","B","Nho ",2);

        //Tạo member
        Member m1 = new Member("M1", "Nhu", 1,"");
        Member m2 = new Member("M2","Nhi",2,"");

        //Add sách vào thư viện
        library.addBook(b1);
        library.addBook(b2);

        //Add member
        library.addMember(m1);
        library.addMember(m2);

        library.showBooks();

        //Search and Borrow book
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên memberID");
        String memberID = scanner.nextLine();

        System.out.println("Nhập vào tên sách cần mượn: ");
        String bookTitle = scanner.nextLine();

        Book book = library.findBookByTitle(bookTitle);
        Member member = library.findMember(memberID);

        if (member == null){
            System.out.println("Member not found!");
        }
        else if (book == null)
        {
            System.out.println("Book not found!!");
        } else if (book.getQuantity() == 0)
        {
            System.out.println("Book is out of stock!");
        } else
        {
            library.borrowBook(memberID, book.getBookId());
        }

        //Return book
        System.out.print("Enter book ID to return: ");
        String returnBookId = scanner.nextLine();

        System.out.print("Enter member ID: ");
        String returnMemberId = scanner.nextLine();

        //check member tồn tại
        Member returnMember = library.findMember(returnMemberId);

        if (returnMember == null){
            System.out.println("Member not found!");
        } else {
            library.returnBook(returnMemberId, returnBookId);
        }

        scanner.close();
    }

        //Show list final books
        //System.out.println("Danh sách sách còn lại trong kho");
       // library.showBooks();

    }
