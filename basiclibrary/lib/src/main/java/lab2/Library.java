/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import java.util.HashSet;
import java.util.Random;
import java.util.*;

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

    public static boolean containsDuplicates(int [] arr){
        int value ;
        for(int i = 0 ; i < arr.length ; i++){
            value = arr[i];
            for(int j = i +1 ; i < arr.length ; i++){
                if(arr[j] == value){
                    return true;
                }
            }
        }
        return  false;
    }

    public static double calculateAverage(double [] arr){
        double sum =0;
        int count=0;
        double avg;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
            count ++;
        }
        avg = sum/count;
        return avg;
    }

    public static int[] lowestAverage(int[][] arr) {
        double average = 0 , lowestAverage = Double.MAX_VALUE;

        int lowestAverageArr[] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            average = 0;
            for (int j = 0 ; j < arr[i].length ; j++){
                average+=arr[i][j];
            }
            average /= arr[i].length;
            if(average < lowestAverage) {
                lowestAverage = average;
                lowestAverageArr = arr[i];
            }

        }
        return lowestAverageArr;
    }

    public int weatherData(int [][] arr){
        Set<Integer> degrees = new HashSet<>();
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <arr[i].length ; j++){
                degrees.add(arr[i][j]);
                if(arr[i][j] < minValue){
                    minValue = arr[i][j];
                }else if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }

        System.out.println(" High : " + maxValue);
        System.out.println(" Low : " + minValue);

        for(int i = minValue ; i < maxValue ; i++){
            if(!degrees.contains(i)){
                System.out.println("Never saw temperature:" + i);
            }
        }

        return maxValue;

    }
    public static String tally(List<String> votes){
        Map<String,Integer> votesNum = new HashMap<>();
        for(String winerWord: votes){
            if(!votesNum.containsKey(winerWord)){
                votesNum.put(winerWord,1);
            } else {
                int votesValue = votesNum.get(winerWord);
                votesValue++;
                votesNum.put(winerWord,votesValue);
            }
        }

        String winner = "";
        for(Map.Entry<String,Integer>element :votesNum.entrySet()){
            if(element.getValue() == Collections.max(votesNum.values())){
                winner = element.getKey();
            }
        }
        return winner;
    }


}



