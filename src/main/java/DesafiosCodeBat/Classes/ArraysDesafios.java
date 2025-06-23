package DesafiosCodeBat.Classes;

public class ArraysDesafios {
    public static boolean numero6 (int[] nums){
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }

    public static boolean numerosIguais (int[] nums){
        return (nums.length >= 1 && nums[0] == nums[nums.length-1]);
    }

    public static int[] numeroMaior (int[] nums){
        int numeroMaior = 0;
        if(nums[0] > nums[2]){
           numeroMaior = nums[0];
        } else {
            numeroMaior = nums[2];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numeroMaior;
        }
        return nums;
    }
}
