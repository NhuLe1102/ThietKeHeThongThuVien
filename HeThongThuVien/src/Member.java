public class Member {
    private String memberId;
    private String name;
    private int phone;
    private String borrowedBooks;

    public Member(String memberId, String name, int phone, String borrowBooks){
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.borrowedBooks = borrowBooks;
    }
    public String getmemberId(){
        return memberId;
    }
    public String getname(){
        return name;
    }
    public int getphone (){
        return phone;
    }
    public String getborrowBooks(){
        return borrowedBooks;
    }
    public void display(){
        System.out.println(memberId +" "+name +" "+borrowedBooks);
    }

}
