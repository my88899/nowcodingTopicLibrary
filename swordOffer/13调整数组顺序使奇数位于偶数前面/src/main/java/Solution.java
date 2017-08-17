public class Solution {
    public int[] reOrderArray(int [] array) {
        int[] tempArray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                tempArray[index++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                tempArray[index++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
//        array = tempArray;
        return array;
    }
}