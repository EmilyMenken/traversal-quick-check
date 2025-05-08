/**
 * A utility class for performing operations on a binary tree of Strings.
 */
public class QuickCheck {

  /**
   * Prints all strings longer than 7 characters in a tree.
   * The strings should be printed in pre-order.
   * Each qualifying string should appear on its own line.
   * 
   * If the node itself is null, the method should print nothing.
   * 
   * You can assume that there are no null Strings stored in the tree nodes.
   *
   * @param node the root node of the binary tree
   */
  public static void printLongerThan7(TreeNode<String> node) {

  if(node == null){

    return;

  }//end if

  String value = node.value;

  if(value.length() > 7){

    System.out.println(value);

  }//end if

  printLongerThan7(node.left);
  printLongerThan7(node.right);

  }//end printLongerThan7

  /**
   * Returns the sum of all nodes holding odd numbers.
   * 
   * If the node itself is null, return 0.
   * 
   * You can assume there are no null Integers held in the values.
   *
   * @param node the root node of the binary tree
   * @return the sum of all odd-valued nodes
   */
  public static int oddSum(TreeNode<Integer> node) {
    
    int sum = 0;

  if (node == null) {

    return 0;

  }//end if

  return -1;

  }//end oddSum

  
}//end file
