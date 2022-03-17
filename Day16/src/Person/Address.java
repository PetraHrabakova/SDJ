package Person;

public class Address
{
  String street;
  String number;
  String postalCode;
  String city;
  String country;

  public Address(String street, String number, String postalCode, String city, String country) {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }
   public void setAddress(String street, String number, String postalCode, String city, String country) {
     this.street = street;
     this.number = number;
     this.postalCode = postalCode;
     this.city = city;
     this.country = country;
   }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString() {
    return "Street and number: " + street + " " + number +
        "\nPostal code: " + postalCode +
        "\nCity: " + city +
        "\nCountry: " + country;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Address)) {
      return false;
    }
    Address other = (Address)obj;
    return street.equals(other.street) && number.equals(other.number) && postalCode.equals(other.postalCode) &&
        city.equals(other.city) && country.equals(other.country);
  }
}
