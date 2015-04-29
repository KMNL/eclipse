package checkBinarySearchTree;

public class CheckBinarySearchTree {

	public static void main (String arg[]){
		//             20
		//            /  \
		//          10   30
		//         /  \
		//        5    15
		//       / \     \
		//      3   7     17
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node7 = new TreeNode(7, null, null);
		TreeNode node5 = new TreeNode(5, node3, node7);
		TreeNode node17 = new TreeNode(17, null, null);
		TreeNode node15 = new TreeNode(15, null, node17);
		TreeNode node10 = new TreeNode(10, node5, node15);
		TreeNode node30 = new TreeNode(30, null, null);
		TreeNode node20 = new TreeNode(20, node10, node30);
		boolean ret = isBST(node20, null, null);
		if (ret){
			System.out.println("binary search tree");
		}
		
		//             20
		//            /  \
		//          10   30
		//         /  \
		//        5    17
		//       / \     \
		//      3   7     15
		TreeNode node15_1 = new TreeNode(15, null, null);
		TreeNode node17_1 = new TreeNode(17, null, node15_1);
		TreeNode node10_1 = new TreeNode(10, node5, node17_1);
		TreeNode node20_1 = new TreeNode(20, node10_1, node30);
		 ret = isBST(node20_1, null, null);
		if (ret){
			System.out.println("binary search tree");
		}
		
	}
	
	public static boolean isBST(TreeNode root, Integer min, Integer max){
		if (root == null)
			return true;

		System.out.println("checking node " + root.getValue() + " min = " + min + " max = " + max);
		if(root.getLeft() != null){
			if(min != null && root.getLeft().getValue() > min)
				return false;
			boolean ret = isBST(root.getLeft(), root.getLeft().getValue(), max);
			if(ret == false)
				return false;
		}
		// check right child tree
		if(root.getRight() != null){
			// no right child
			if(max != null){
				if(root.getRight().getValue() < max){
					return false;
				}
			}
			return  isBST(root.getRight(), min, root.getRight().getValue());
		}
		return true;
	}
}
