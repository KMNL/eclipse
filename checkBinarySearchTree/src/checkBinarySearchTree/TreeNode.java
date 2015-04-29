package checkBinarySearchTree;

public class TreeNode {

	private TreeNode right;
	private TreeNode left;
	private int value;
	
	public TreeNode(int value, TreeNode left, TreeNode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public int getValue(){
		return value;
	}
	
	public TreeNode getLeft(){
		return left;
	}
	public TreeNode getRight(){
		return right;
	}
}
