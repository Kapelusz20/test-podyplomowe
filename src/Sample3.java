public class Sample3 {
    public static void main(String[] args) {

        //Wyświetl wszystkie elementy tablicy wraz z indeksami
        //np. [0] [0] [0] -> 1 itd

        int[][][] array = {{{1}, {1,2,3}}, {{1,2}, {2}}};

        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j < array[i].length ; j++){
                for (int k = 0; k < array[i][j].length ; k++){
                    System.out.print("[" + i +"]");
                    System.out.print("[" + j +"]");
                    System.out.print("[" + k +"]");
                    System.out.print("-> ");
                    System.out.println(array[i][j][k]);
                }
            }
        }





    }
}
