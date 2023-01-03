package JavaInterviewCodingQuestions;

import java.util.Arrays;

public class Syf26_1 {
    public static void main(String[] args) {

        //Find first two max number in Array

        int [] arr ={1,2,3,4,5,56,57,5,8};

        getTwoMaxValues(arr);

    }

    public static void getTwoMaxValues (int[] nums) {

        int maxOne= 0;
        int maxTwo= 0;

        Arrays.sort(nums);
        System.out.println("Max1 = " +(nums[nums.length-1]));
        System.out.println("Max2 = " +(nums[nums.length-2]));

    }
}


