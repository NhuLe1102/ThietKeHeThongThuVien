public class Book {
    private String id;
    private String title;
    private String author;
    private int quantity;

    public Book (String bookid, String title, String author, int quantity){
    this.id = bookid;
    this.title = title;
    this.author = author;
    this.quantity = quantity;
}
public String getBookId(){
    return id;
}
public String getTitle(){
    return title;
}
public int getQuantity(){
    return quantity;
}
public String getAuthor(){
        return author;
}
public void borrowBook(){
    if(quantity > 0){
        quantity--;
    }
}
public void returnBook(){
    quantity ++;
}
public void display(){
    System.out.println("Book_id: " + id + "."+ " Tên sách: " + title +"."+ " Tên tác giả: " +author+"."+ " Số lượng: " + quantity);
    }
}


