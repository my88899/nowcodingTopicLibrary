public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length ==0) {
            return 0;
        }
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length ; i++) {
            if (times == 0) {
                result = array[i];
                times++;
            } else if (result == array[i]) {
                times++;
            } else {
                times--;
            }
        }
        if(CheckMorThanHalfNum(array, result)) {
            return result;
        } else {
            return 0;
        }
    }

    private boolean CheckMorThanHalfNum(int[] array, int result) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result) {
                num++;
            }
        }
        if(num * 2 <= array.length) {
            return false;
        }else {
            return true;
        }
    }
}