package Exam2;

import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;

  public BookList() {
    books = new ArrayList<Book>();
  }

  public int getNumberOfBooks() {
    return books.size();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public Book getBook(int index) {
    return books.get(index);
  }

  public Book getBook(String isbn) {
    for (Book book : books)
    {
      if (book.getIsbn().equals(isbn))
      {
        return book;
      }
    }
    return null;
  }

  public void removeBook(int index) {
    books.remove(index);
  }

  public int getIndexOfFirstPrintedBook() {
    int index = -1;
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getBookType().equals("Hard cover") || books.get(i).getBookType().equals("Paperback")) {
        index = i;
      }
    }
    return index;
  }

  public int getNumberOfBooksByType(String bookType) {
    int numberOfBooks = 0;
    for (Book book : books)
    {
      if (book.getBookType().equals(bookType))
      {
        numberOfBooks += 1;
      }
    }
    return numberOfBooks;
  }

  public Book[] getBooksByType(String bookType) {
    Book[] booksByType = new Book[books.size()];
    int index = 0;

    for (Book book: books) {
      if (book.getBookType().equals(bookType)) {
        booksByType[index] = book;
        index += 1;
      }
    }
    return booksByType;
  }

  public EBook[] getAllEBooks() {
    EBook[] ebooks = new EBook[books.size()];
    int index = 0;
    for (Book book: books) {
      if (book.getBookType().equals("E-book")) {
        ebooks[index] = (EBook) book;
        index += 1;
      }
    }
    return ebooks;
  }

  public String toString() {
    String str = "";
    for (Book book: books) {
      str += book + "\n";
    }
    return str;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof BookList)) {
      return false;
    }
    BookList other = (BookList) obj;
    return books == other.books;
  }
}
