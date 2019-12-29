package sevenPractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
public class seven_31 {
    public static void main(String[] agse) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 5, 1, 5, 16, 61, 111);
        List<Integer> list2 = new LinkedList<Integer>();
        Collections.addAll(list2, 4, 2, 4, 5, 6);
        test1(list1, list2);
    }
 
    public static void test1(List<Integer> list1, List<Integer> list2) {
        list1.removeAll(list2);// list1中删除和list2中交集的元素
        list2.addAll(list1);// 合并
        Collections.sort(list2);
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
}
