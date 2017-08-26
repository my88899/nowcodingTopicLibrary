public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        int[] tmp = new int[length];
        int min = length;
        for (int i = 0; i < length; i++) {
            if (tmp[numbers[i]] != 0) {
                length = numbers < length ? numbers : length;
            }
            tmp[numbers[i]]++;
        }
        duplication[0] = min;
        return true;

    }
}