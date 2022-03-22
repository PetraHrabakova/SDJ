public class Apartment
{
  Tenant tenant;
  String address;
  double rent;

  public Apartment(String address, double rent) {
    this.address = address;
    this.rent = rent;
    tenant = null;
  }

  public double getRent()
  {
    return rent;
  }

  public String getAddress()
  {
    return address;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public void rentTo(String name, String phone) {
    Tenant newTenant = new Tenant(name, phone);
    if (!(tenant.getName().equals(name)) && !(tenant.getPhone().equals(phone))) {
      tenant = newTenant;
    }
  }

  public void evict() {
    tenant = null;
  }

  public boolean isOccupied() {
    return tenant != null;
}

  public Tenant getTenant() {
    if (tenant != null) {
      Tenant newTenant = new Tenant(tenant.getName(), tenant.getPhone());
      return newTenant;
    }
    else {
      Tenant newTenant = null;
      return newTenant;
    }
  }

  public double getRentDue() {
    if (tenant.rentDue != 0) {
      return tenant.rentDue;
    }
    else
      return 0;
  }

  public void chargeRent() {
    if (tenant != null) {
      tenant.rentDue += rent;
    }
  }

  public void collectRent() {
    if (tenant != null) {
      tenant.rentDue -= rent;
    }
  }

  public String toString() {
    if (tenant == null) {
      return "No tenant";
    }
    else {
      return tenant + "Address: " + address +
          "\nRent: " + rent;
    }
  }




}
