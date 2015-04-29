
public class FindCommonAncestor {

	public static void main(String [] args){
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
		TreeNode ret = findCommonAncestor(node20, node7, node15);
		if (ret != null){
			System.out.println("Commona Ancestor : " + ret.value);
		}
		
	}
	
	static TreeNode findCommonAncestor(TreeNode node, TreeNode p, TreeNode q){
		if(node  == null){
			return null;
		}
		else if(node == p || node == q){
			return node;
		}
		TreeNode resultLeft = findCommonAncestor(node.left, p, q);
		TreeNode resultRight = findCommonAncestor(node.right, p, q);
		
		if(resultLeft != null && resultRight != null ){
			// p and q are in different branches of node, so node is CA
			return node;
		}
		else {
			return resultLeft != null ? resultLeft : resultRight;
		}
	}
}
