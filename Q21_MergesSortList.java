import java.util.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(-1);
        ListNode head = temp ;

        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null ){
            temp.next = l1;
        }
        else{
            temp.next = l2;
        }

        return head.next;
        

    }
}

class Q21_MergeSortList {
    public static void main(String[] args){
  
      // create linkedlist
      LinkedList<String> list1 = new LinkedList<>();

      LinkedList<String> list3 = new LinkedList<>();
      

  
      // Add elements to LinkedList
      list1.add("1");
      list1.add("2");
      list1.add("4");

    // create linkedlist
        LinkedList<String> list2 = new LinkedList<>();  
            // Add elements to LinkedList
            list1.add("1");
            list1.add("3");
            list1.add("4");
      
    Solution sol3 = new Solution();
    list3 = sol3.mergeTwoLists(list1,list2);
    System.out.println("Updated LinkedList: " + list3);
    }
  }
  