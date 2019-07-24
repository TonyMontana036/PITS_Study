import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Ляськи-масяськи");

    Date date = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
    System.out.println(format1.format(date));
  }
}