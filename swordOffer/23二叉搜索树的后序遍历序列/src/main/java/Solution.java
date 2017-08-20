public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length <= 0) {
            return false;
        } else {
            return VerifySquenceOfCore(sequence, 0, sequence.length - 1);
        }
    }

    private boolean VerifySquenceOfCore(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int root = sequence[end];
        int leftEnd = start;
        int rightStart = start;
        while (sequence[leftEnd] < root) {
            leftEnd++;
        }
        rightStart = leftEnd;
        for (int i = leftEnd; i < end; i++) {
            if (sequence[i] <= root) {
                return false;
            }
        }
        return VerifySquenceOfCore(sequence, start, leftEnd - 1) && VerifySquenceOfCore(sequence, rightStart, end - 1);
    }
}