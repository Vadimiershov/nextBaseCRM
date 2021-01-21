package UserStory4.Random;

public class PracticeVesa {

    public static void main(String[] args) {


        //6 Sum of the digits in the String


        String str = "112abw5@#"; // === 9

   int sum = 0;


        for (int i = 0; i < str.length() ; i++) { // 1 1 2a b  w

            if (Character.isDigit(str.charAt(i))){
                sum+=Integer.valueOf(i);
            }

        }
        System.out.println(sum);

    }
}
