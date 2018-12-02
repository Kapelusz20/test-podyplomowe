import javax.sound.midi.Soundbank;

public class Sample2 {
    public static void main(String[] args) {

    int[] arr = {3,7,6,3,6,5};

    for (int i = 0; i < arr.length ; i++){
        if (arr[i] == 5){
            continue;
        }
        System.out.println(i + ": " + arr[i]);
    }


    }
}