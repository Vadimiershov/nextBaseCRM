package UserStory4.Random;

import org.openqa.selenium.json.JsonOutput;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

       int [] arr1 =  {2,1,4};

  Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

    }

public static int[] sortArray (int [] num){
        int temp =0; // temp container

        for (int i = 0; i<num.length; i++){  //   2 -> 1 - 4

            for (int j = i+1; j<num.length; j++){  //1 ,2, 4

                if (num[j]<num[i]){

                        temp = num[j];

                        num[j] =num[i];

                        num[i] = temp;
                }

            }
        }

    return num;



}


}
