package arrays;

import javax.sound.midi.SysexMessage;

public class CreatingArray {

    public static void main(String[] args) {

        int[] nums = new int[4];

        int[] nums2 = {1, 2, 3, 4, 5};

        System.out.println(nums2[3]);

        for(int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        for(int i : nums2){
            System.out.println(i);
        }
    }

}
