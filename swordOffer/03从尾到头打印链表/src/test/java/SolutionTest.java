import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    ListNode list1 = new ListNode(1);
//    ListNode list2 = new ListNode(2);
//    ListNode list3 = new ListNode(3);
//    list1.next = list2;
//    list2.next = list3;
//    ListNode listNode = new ListNode();
    static ArrayList<Integer> shouldList = new ArrayList<Integer>();
    shouldList.add(1);
    static Solution underTestSolution = new Solution();
    @Test public void printRetailListNodes(){
        assertEquals(underTestSolution.printListFromTailToHead(list1), shouldList);
    }
}