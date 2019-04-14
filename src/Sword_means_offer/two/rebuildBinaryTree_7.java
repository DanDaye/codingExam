package Sword_means_offer.two;

/**
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结构中都不含重复的数组。
 * 例如，输入前序遍历{1,2,4,7,3,5,6,8}和中序遍历{4,7,2,1,5,3,8,6},则重建二叉树并输出它的头结点，二叉树结点的定义如下
 */

public class rebuildBinaryTree_7 {

    public  static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }
    public BinaryTreeNode rebuildBinaryTree(int[] preorder,int[] inorder){
        if (preorder == null || inorder ==null || preorder.length!=inorder.length){
            return  null;
        }
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    /**
     *
     * @param preorder 前序遍历
     * @param ps 前序遍历开始位置
     * @param pe 前序遍历结束位置
     * @param inorder 中序遍历
     * @param is 中序遍历开始位置
     * @param ie 中序遍历结束位置
     * @return 构建的树的根节点
     */
    public static BinaryTreeNode construct(int[] preorder,int ps,int pe,int[] inorder,int is,int ie){
        if (ps>pe)return null;
        int value = preorder[ps];
        int index = is;
        while (index<=ie && inorder[index] != value){
            index++;
        }
        if (index>ie){
            throw new RuntimeException("invalid input"+index);
        }
        BinaryTreeNode node = new BinaryTreeNode();
        node.value = value;
        node.left=construct(preorder,ps+1,ps+index-is,inorder,is,index-1);
        node.right = construct(preorder,ps+index-is+1,pe,inorder,index+1,ie);
        return node;
    }
}
