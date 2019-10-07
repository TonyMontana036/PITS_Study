package transport;

public class CarHacker {

  static public void mixer(){
    Car c = new Car();
    Plane p = new Plane();

    c.fuel = "gas";
    c.capacity = 1;
    c.maxSpeed = 100;
    c.vendor = "tony";
    c.speed = 10;

    p.fuel = "disel";
    p.capacity = 2;
    p.maxSpeed = 200;
    p.vendor = "roma";
    p.speed = 20;

    c.capacity = c.capacity + p.capacity;
    p.capacity = c.capacity - p.capacity;
    c.capacity = c.capacity - p.capacity;

    c.maxSpeed = c.maxSpeed + p.maxSpeed;
    p.maxSpeed = c.maxSpeed - p.maxSpeed;
    c.maxSpeed = c.maxSpeed - p.maxSpeed;

    c.speed = c.speed + p.speed;
    p.speed = c.speed - p.speed;
    c.speed = c.speed - p.speed;

    String s;
    s = p.fuel;
    p.fuel = c.fuel;
    c.fuel = s;

    s = p.vendor;
    p.vendor = c.vendor;
    c.vendor = s;

  }
  public static void main(String[] args) {
    mixer();
  }
}
