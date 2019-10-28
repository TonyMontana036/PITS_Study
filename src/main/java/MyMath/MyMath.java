package MyMath;

public class MyMath {

    public String setLength(int a, String b){
        if (a > 0){
            b = "b" + a;
        } else if (a < 0) {
            b = "b" + a;
        } else {
            b = "0";
        }
        if (b.length() <= 10) {
            return b;
        }
        return b.substring(0, 10);
    }

    public boolean thouthand (int x){
        x = x - 1;
        if (x > 100 || x < 30){
                x = x + 1000;
        } else if(x > 0 && (x%2==0) ){
            x = x - 1000;
        }
        if (x < 0){
            return false;
        }
        return true;
    }

}