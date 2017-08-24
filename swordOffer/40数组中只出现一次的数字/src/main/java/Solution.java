public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        num1[0]=0;
        num2[0]=0;
        if (array == null || array.length == 0) {
            return;
        }
        int tmp = 0, index;
        for (int i = 0; i < array.length; i++) {
            tmp ^= array[i];
        }
        for (index = 0; index < 32; index++) {
            if ((tmp & (1 << index)) != 0) {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & (1 << index)) != 0) {
                num2[0] ^= array[i];
            } else {
                num1[0] ^= array[i];
            }
        }
        return;
    }
}