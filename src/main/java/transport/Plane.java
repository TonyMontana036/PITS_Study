package transport;

public class Plane {

  int maxSpeed;
  int speed;
  String vendor;
  String fuel;
  int capacity;

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public int getSpeed() {
    return speed;
  }

  public String getVendor() {
    return vendor;
  }

  public String getFuel() {
    return fuel;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int addSpeed(int newSpeed) {
    speed = newSpeed * 3;
    return newSpeed;
  }

  public int engineOff() {
    speed = 0;
    System.out.println("Скорость сейчас" + speed);
    return speed;
  }

  public int addPass() {
    capacity++;
    return capacity;
  }
}
