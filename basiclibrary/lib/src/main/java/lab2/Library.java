/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int [] roll(int num){
        Random diceValue = new Random();
        int [] arr = new int[num];
        for(int i = 0 ; i < num ; i++){
            int randomValue = diceValue.nextInt(6-1+1)+1;
            arr[i] = randomValue;
        }
        return arr;

    }

}
