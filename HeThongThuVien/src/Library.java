import java.util.ArrayList;
//import java.util.Iterator;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
    }
    public void addMember(Member member){
        members.add(member);

    }
    public void showBooks(){
        for (Book b: books){
            b.display();
        }
    }
    public Book findBook(String id)
    {
        for(Book b: books){
            if(b.getBookId().equals(id)){
                return b;
            }
        }
        return null;
    }
    public Book findBookByTitle(String title)
    {
        for(Book b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }
    public Member findMember (String id){
        for (Member m : members){
            if (m.getmemberId().equals(id)){
                return m;
            }
        }
        return null;
    }
    public void borrowBook(String memberId, String bookId){
        Member member = findMember(memberId);
        Book book = findBook(bookId);
        if (member == null || book == null){
            System.out.println("Member/ book is not found!");
            return;
        }
        else if (book.getQuantity()==0){
            System.out.println("Book is out of stock!");
            return;
        }
        else{
        book.borrowBook();
        loans.add(new Loan(book, member));
        System.out.println("Borrow successfully!");}
    }
    public void returnBook(String memberId, String bookId){
        for (int i = 0; i < loans.size(); i++) {
            Loan loan = loans.get(i);
            // Kiểm tra đúng member và book
            boolean isSameMember = loan.getMember().getmemberId().equals(memberId);
            boolean isSameBook = loan.getBook().getBookId().equals(bookId);
            if (isSameMember && isSameBook) {

                // Trả sách (tăng quantity)
                loan.getBook().returnBook();

                // Xóa loan khỏi danh sách
                loans.remove(i);

                System.out.println("Return Successfully!");
                return; // dừng ngay khi xong
            }
        }
        System.out.println("Loan not found!");
    }

}

