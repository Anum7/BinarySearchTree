public class TestBST
{
private static int A[];
private static int B[];
public static void main(String args[])
{
A=new int[50];
B=new int[3000];

BinarySearchTree bst=new BinarySearchTree();
bst.take(A,50);
System.out.println("\n Displaying Unsorted numbers Array:");
bst.display(A,50);
B=bst.bstSort(A);
System.out.println("\n Displaying Binary Search Tree numbers Array:");
bst.display(B,120);
}
}