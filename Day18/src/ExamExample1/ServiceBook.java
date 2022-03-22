package ExamExample1;

import java.util.ArrayList;
import java.util.Arrays;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    Service[] newServices = new Service[services.size()];
    return services.toArray(newServices);
  }

  public int[] getAllServiceMileages()
  {
    int[] mileage = new int[services.size()];

    for (int i = 0; i < services.size(); i++)
    {
      mileage[i] = services.get(i).getMileage();
    }

    return mileage;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
    {
      if ((services.get(i).getDate()).equals(date))
      {
        return true;
      }
    }
    return false;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;
    return services.equals(other.services);
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < services.size(); i++) {
      str += services.get(i);
    }
    return str;
  }
}
