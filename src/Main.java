import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> h=new Tree23<>();
        for (int i = 1; i <14; i++) {
            h.put(i,"je");
        }
        for (int i = 1; i < 14; i++) {
            System.out.println(h.get(i));
        }
        h.remove(10);
        ((Tree23)h).print();

    }
}
