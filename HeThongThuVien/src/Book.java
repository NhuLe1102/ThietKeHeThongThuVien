public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public Book (String title, String author, int numberOfPages){
    this.title = title;
    this.author = author;
    this.numberOfPages = numberOfPages;
}

    public String getTitle(){
    return title;
}
    public String getAuthor(){ return author;}
    public int getNumberOfPages(){return numberOfPages;}

    public void display(){
    System.out.println( "Tên sách: " + title +"."+ " Tên tác giả: " +author+"."+ " Số trang: " + numberOfPages);
    }
}


