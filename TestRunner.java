public class TestRunner {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a){
    Library l=new Library(); Book b=new Book(1,"Java","Author"); User u=new User(1,"Alice");
    l.addBook(b); l.addUser(u); l.issueBook(1,1); check(b.isIssued(),"issued");
    l.issueBook(1,1); check(b.isIssued(),"duplicate issue");
    l.returnBook(1,1); check(!b.isIssued(),"returned");
    l.returnBook(1,1); check(!b.isIssued(),"duplicate return");
    System.out.println("Library tests passed");
  }
}