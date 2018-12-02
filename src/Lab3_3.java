public class Lab3_3 {


    public static void main(String[] args) {

        //1.
        /*for (int i =1; i < 13; i++){
            int year = 2018;
            for (int j = 1; j < DayCounter.countDays(i, year) + 1; j++){
                System.out.print(j + "/" + i + "/" + "2018" + "\n");
            }
        }*/


        //3.
        /*int i = 99999999;
        long[][][] arr = new long[i][i][i];*/

        //2.
        String word = "";
        long result;

        if (args.length > 0){
            word = args[0];
        }

        switch(word) {
            case "jeden":
                result = 1;
                break;
            case "dwa":
                result = 2;
                break;
            case "trzy":
                result = 3;
                break;
            case "cztery":
                result = 4;
                break;
        }






    }

}