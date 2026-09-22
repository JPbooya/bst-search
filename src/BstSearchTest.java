import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
  @Test
  void dataEqual(){
    BinaryTreeNode root = new BinaryTreeNode<Integer>(5);
    root.left = new BinaryTreeNode<Integer>(5);
    root.left.left = new BinaryTreeNode<Integer>(3);
    root.left.left.left = new BinaryTreeNode<Integer>(2);;

    root.right = new BinaryTreeNode<Integer>(8);
    root.right.right  =  new BinaryTreeNode<Integer>(10);
    root.right.right.right =  new BinaryTreeNode<Integer>(15);

    boolean result = BstSearch.contains(root, 5);
    assertTrue(result);
    
  }

  @Test
  void dataNotEqual(){ // Johns
    BinaryTreeNode root = new BinaryTreeNode<Integer>(7);
    root.left = new BinaryTreeNode<Integer>(4);
    root.left.left = new BinaryTreeNode<Integer>(3);
    root.left.left.left = new BinaryTreeNode<Integer>(2);;

    root.right = new BinaryTreeNode<Integer>(8);
    root.right.right  =  new BinaryTreeNode<Integer>(10);
    root.right.right.right =  new BinaryTreeNode<Integer>(15);

    boolean result = BstSearch.contains(root, 5);
    assertFalse(result);
    
  }


  @Test
  void dataEqualNull(){
    BinaryTreeNode root = new BinaryTreeNode<Integer>(null);
    root.left = new BinaryTreeNode<Integer>(5);
    root.left.left = new BinaryTreeNode<Integer>(3);
    root.left.left.left = new BinaryTreeNode<Integer>(2);;

    root.right = new BinaryTreeNode<Integer>(8);
    root.right.right  =  new BinaryTreeNode<Integer>(10);
    root.right.right.right =  new BinaryTreeNode<Integer>(15);

    boolean result = BstSearch.contains(root, 5);
    assertFalse(result);
    
  }


}
