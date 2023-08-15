package SecondMaximumInArray;

import java.util.Arrays;

public class SecondMaximumInArray {
    public int findSecondMaximumInArray(int[] array) {
        int i = 0;
        int max = array[i];
        int secondmax = array[i];
        for (i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondmax = max;
                max = array[i];

            } else if (array[i] > secondmax && array[i] != max) {
                secondmax = array[i];
            }
        }
        System.out.println("The array inputted is"+ Arrays.toString(array) +"\n The second maximum digit in the array" +
                " is " + secondmax);
        return  secondmax;
    }

    public static void main(String[] args) {
        SecondMinimumInArray smia=new SecondMinimumInArray();
        smia.findSecondMaximumInArray(new int []{13,34,2,34,33,1});
    }
}
