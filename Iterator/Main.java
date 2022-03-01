import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("book1"));
    bookShelf.appendBook(new Book("book2"));
    bookShelf.appendBook(new Book("book3"));
    bookShelf.appendBook(new Book("book4"));
    Iterator<Book> itr = (Iterator<Book>) bookShelf.iterator();
    while(itr.hasNext()) {
      Book book = (Book) itr.next();
      System.out.println(book.getName());
    }
  }
}
