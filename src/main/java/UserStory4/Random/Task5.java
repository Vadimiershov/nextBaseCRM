package UserStory4.Random;

public class Task5 {

    public static void main(String[] args) {


        String str = "@aaabbcceew"; // === > 3a2b2c2e1w

        for (int j =0; j<=str.length()-1; j++){

        char c =    str.charAt(j);

            int count=0;

           for (int i =0; i<=str.length()-1; i++){
               char ch = str.charAt(i);

               if (ch==c){
                   count++;

                   if (count>0){
               }


           }



      }
            System.out.println("The character " + c + " will appear " + count);

        }

    }
}