package lab2;

import java.util.Arrays;
import java.util.*;

import static lab2.Library.tally;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word Test");

        Library demo = new Library();
        System.out.println(Arrays.toString(demo.roll(6)));

        int [] arr = new int[]{1,2,3,4};
        double [] arr2 = new double[]{1,2,3,4.4};
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };;
        System.out.println(demo.containsDuplicates(arr));
        System.out.println(demo.calculateAverage(arr2));
        System.out.println(Arrays.toString(demo.lowestAverage(weeklyMonthTemperatures)));
        demo.weatherData(weeklyMonthTemperatures);
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

    }


}
