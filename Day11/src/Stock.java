public class Stock
{
  String symbol;
  String price;

  public Stock(String symbol, String price) {
    this.symbol = symbol;
    this.price = price;
  }
  public Stock copy() {
    // Create a new Stock object and initialize it
    // with the same data held by the calling object.
    Stock copyObject = new Stock(symbol, price);
    // Return a reference to the new object.
    return copyObject;
  }

  public Stock(Stock object2) {
    symbol = object2.symbol;
    price = object2.price;
  }
}
