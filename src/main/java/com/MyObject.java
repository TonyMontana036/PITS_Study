package com;

public class MyObject {
  public String address;
  public int countOfFloors;
  public int apartmentsCount;
  public String owner;
  // Это поле инициализировать в методе `createObject()` не надо.
  // Это поле автоматически будет инициализированно, при запуске программы.
  public OtherObject2 objectInObject = new OtherObject2();
}

class OtherObject2 {
  Object nameObject = new Object();
}

class TestMyObject{
  public static void main(String[] args) {

    MyObject myObject = new MyObject();

    myObject.address = "nonameStreet";
    myObject.countOfFloors = 5;
    myObject.apartmentsCount = 4;
    myObject.owner = "nonameHum";

//    MyObject myObject1 = null;
//    System.out.println(myObject1.owner);

    MyObject returnObject = myObject;
    System.out.println(returnObject.address);
  }

}

