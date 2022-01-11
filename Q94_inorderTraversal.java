import java.util.ArrayList;
import java.util.List;

class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
    // Root of Binary Tree
    Node root;
 
    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }
 
    BinaryTree()
    {
        root = null;
    }

    public List<Integer> inorderTraversal(Node root) {
        
        return inorder(root, new ArrayList());
    }
    
    private List<Integer> inorder(Node root, List<Integer> list)
    {
        
        if( root == null)
        {
            return list;
        }
        
        list = inorder(root.left, list);
        list.add(root.key);
        
        return inorder(root.right,list);
        
    }
 
}
class Q94_inorderTraversal
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        List<Integer> list1 = new ArrayList<>();
       
        tree.root = new Node(1);
 
        // tree.root.left = new Node(2);
        tree.root.right = new Node(2);
 
        tree.root.right.left = new Node(3);

        list1 = tree.inorderTraversal(tree.root);

        System.out.println(list1);

       
    }
}

