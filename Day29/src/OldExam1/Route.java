package OldExam1;

public class Route extends Trip
{
  private Harbor from;
  private Harbor to;

  public Route(Harbor from, Harbor to) {
    this.from = from;
    this.to = to;
  }

  public Harbor getFrom() {
    Harbor newHarbor = new Harbor(from.getName(), from.getTown());
    return newHarbor;
  }

  public Harbor getTo() {
    Harbor newHarbor = new Harbor(to.getName(), to.getTown());
    return newHarbor;
  }
}
