public class Book
{
  String author;
  String title;
  double price;
  int pages;

  public Book(String author, String title, double price, int pages) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public int getPages() {
    return pages;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String toString() {
    return "Author: " + author +
        "\nTitle: " + title +
        "\nPrice: " + price +
        "\nPages: " + pages;
  }


}
