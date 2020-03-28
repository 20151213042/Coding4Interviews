
/*
面试题06. 从尾到头打印链表
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */

import java.util.ArrayList;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
 }

public class Interview_06 {
  //使用list
  public int[] reversePrint(ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();
    while(head != null){
      list.add(head.val);
      head = head.next;
    }
    int[] res = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
      res[i] = list.get(list.size() - i - 1);
    }
    return res;
  }

}
