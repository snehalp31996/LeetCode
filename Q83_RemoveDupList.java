/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.LinkedList;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode currentnode = head;

        while(currentnode != null && currentnode.next != null)
        {
            if(currentnode.val == currentnode.next.val)
            {
                currentnode.next = currentnode.next.next;
            }
            else{
                currentnode = currentnode.next;
            }
        }
        
        return head;
    }
}
public class Q83_RemoveDupList {
    public static void main(String[] args){
  
        // create linkedlist
        LinkedList<String> list1 = new LinkedList<>();
  
        LinkedList<String> list2 = new LinkedList<>();
        
  
    
        // Add elements to LinkedList
        list1.add("1");
        list1.add("1");
        list1.add("2");
  
    
        
      Solution sol12 = new Solution();
      list2 = sol12.deleteDuplicates(list1);
      System.out.println("Updated LinkedList: " + list2);
      }
    
}
