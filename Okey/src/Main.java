import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] color = new String[]{"siyah", "kirmizi", "yesil", "sari"};
        int[] okey = new int[104];
        for (int i=0 ; i<okey.length ;i++ ){
            okey[i] = i + 1;
        }
        Random random = new Random();
        for (int i=0 ; i<okey.length ; i++){
            int rand = random.nextInt(104);
            int temp = okey[rand];
            okey[rand] = okey[i];
            okey[i] = temp;

        }
        for (int i = 0 ; i<15 ; i++){
            int tas = okey[i];
            String colors = color[tas / 26];
            int number = (tas % 13) + 1 ;
            System.out.println(colors +" " + number);

        }





    }
}