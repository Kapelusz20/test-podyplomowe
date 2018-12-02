public class InstanceCounter {
    public static void main(String[] args) {

        // Cwiczenie 3 lab.3


        Calculations c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
        c1 = new Calculations();
        c1.showCounter();
        c2 = new Calculations();
        c2.showCounter();
        c3 = new Calculations();
        c3.showCounter();
        c4 = new Calculations();
        c4.showCounter();
        c5 = new Calculations();
        c5.showCounter();
        c6 = new Calculations();
        c6.showCounter();
        c7 = new Calculations();
        c7.showCounter();
        c8 = new Calculations();
        c8.showCounter();
        c9 = new Calculations();
        c9.showCounter();
        c10 = new Calculations();
        c10.showCounter();
    }
}
class Calculations{
    static  int counter;

    public Calculations(){
        counter++;
    }

    void showCounter(){
        System.out.println(counter);
    }
}
