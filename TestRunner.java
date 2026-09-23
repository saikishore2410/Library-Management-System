public class TestRunner {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a){
    Library l=new Library();
    Book b=new Book(1,"Java","Author");
    User u=new User(1,"Alice");
    l.addBook(b); l.addUser(u);
    check(l.issueBook(1,1),"issue");
    check(b.isIssued(),"issued state");
    check(!l.issueBook(1,1),"duplicate issue");
    check(l.returnBook(1,1),"return");
    check(!b.isIssued(),"returned state");
    check(!l.returnBook(1,1),"duplicate return");
    System.out.println("Library tests passed");
  }
}