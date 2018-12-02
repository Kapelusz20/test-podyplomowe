import java.util.StringTokenizer;

public class lab3_2 {
    public static void main(String[] args) {
        //1.
        /*System.out.println("data 02,12,2018r.");

        StringTokenizer st1, st2;

        String quotel = "02, 12, 2018r";
        st1 = new StringTokenizer(quotel);

        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());*/

        //2.

        Specyfication a = new Specyfication();
        a.height = 25;
        a.weight = 10;
        a.depth = 40;
        System.out.println("height " + a.height + "\nweight " + a.weight +"\ndepth " + a.depth);
    }
}
class Specyfication{
        //2. cd

        int height;
        int weight;
        int depth;

    }


