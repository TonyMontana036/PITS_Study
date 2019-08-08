class Operators {

    boolean a = true;
    boolean b = true;

    boolean c = a && (b == true);
    boolean d = (a == true) || b;
    boolean e = a != true && b;
    boolean f = a || (b == true);
    boolean g = a != b;
    int x, y;
    boolean h = x >=  y;
  }


class Numbers {
  public static void main(String[] args) {
    int a = 2;
    int b = 2;

    a = a*3;
    b--;

    boolean x1 = (a & b) <= 7;
    System.out.println(x1);

    boolean x2 = ((a % 2 == 0) | (b % 3 == 0)) ? false : true;
    System.out.println(x2);

    a++;
    a = a % 2 == 0 ? a*3 : a+6;
    System.out.println(a);

    String answer = (a % 2 == 0) & (b % 2 == 0) ? "Ура, оба числа четные" : String.valueOf((b + 4));
    System.out.println(answer);

    boolean x3 = ((a % 2) == 0) & ((b % 2) == 0) ? true : false;
    System.out.println(x3);

  }
}