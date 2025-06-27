package DesafiosCodeBat.Classes;

import java.util.Arrays;
import java.util.List;

public class ArraysDesafios {
    public static boolean numero6 (int[] nums){
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }

    public static boolean numerosIguais (int[] nums){
        return (nums.length >= 1 && nums[0] == nums[nums.length-1]);
    }

//    public static int[] numeroMaior (int[] nums){
//        int numeroMaior = 0;
//        if(nums[0] > nums[2]){
//           numeroMaior = nums[0];
//        } else {
//            numeroMaior = nums[2];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = numeroMaior;
//        }
//        Arrays.fill(nums,);
//        return nums;
//    }

    public static List<Integer> dobrando (List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            nums.set(i,x);
        }
        return nums;
    }
}
