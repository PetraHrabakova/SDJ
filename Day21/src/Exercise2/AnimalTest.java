package Exercise2;

public class AnimalTest
{
  public static void main(String[] args)
  {
    Frog frog = new Frog(10, "green");
    Bee bee = new Bee(5, true);
    Dog dog = new Dog(10, "Cookie", "Pug");
    Cat cat = new Cat(5, "Cutiepie");

    Animal[] animals = {frog, bee, dog, cat};

    for (int i = 0; i < animals.length; i++) {
      System.out.println(animals[i].speak());
    }

  }
}
