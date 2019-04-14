package Sword_means_offer.two;


/**
 * 题目：给定一颗二叉树和其中一个节点，如果找出中序遍历序列的下一个节点？
 * 树种的节点处理有两个分别指向左、右子结点的指针，还有一个指向父结点的指针
 */
public class findBinaryTreeNextNode_8 {

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
    }

    public TreeNode find(TreeNode root){
        if (root == null){
            return  null;
        }else{
            TreeNode parent = root.parent;
            if (parent==null){
                if (root.right==null){
                    return null;
                }else {
                    return root.right;
                }
            }else {
                if (root == parent.left){
                    return parent;
                }else {
                    while (parent!=null && root!=parent.left){
                        root = parent;
                        parent=root.parent;
                    }
                    return parent;
                }
            }
        }
    }
}
