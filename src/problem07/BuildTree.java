package problem07;


/**
 * Created by Xueyong on 2018/6/6.
 */
public class BuildTree {
    /**
     * 解题算法
     * 详见《剑指offer》
     * 解题思路：如何解-->返回值&函数名&参数输入-->边界条件-->循环（终止条件+循环体）
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder==null || inorder==null || preorder.length==0
                || inorder.length==0 || preorder.length != inorder.length){
            return null;
        }
        // 执行递归辅助算法
        TreeNode root = buildTreeCore(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }

    /**
     * 递归辅助算法
     * [preStart + 1, preStart+(i-inStart)]是前序序列中左子树封闭区间
     * [(preStart+1)+(i-inStart), preEnd]是前序序列中右子树封闭区间
     *
     * [inStart, i - 1]是中序序列中左子树封闭区间
     * [i + 1, inEnd]是中序序列中右子树封闭区间
     * @param pre 前序序列
     * @param preStart 前序序列封闭区间的左指针
     * @param preEnd   前序序列封闭区间的右指针
     * @param in  中序序列
     * @param inStart 中序序列封闭区间的左指针
     * @param inEnd   中序序列封闭区间的右指针
     * @return  树的根结点
     */
    private TreeNode buildTreeCore(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd) {
        //列出首尾的值，方便递归（后续递归需要写入长度）
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }

        // 1. 重建二叉树的根节点 = 前序遍历序列的第1个结点
        TreeNode root = new TreeNode(pre[preStart]);
        // 2. 通过数组遍历，在中序遍历中找出根节点
        for(int i=inStart;i<=inEnd;i++){
            // 3.根据在上1步找出的根节点，找出前序遍历 & 中序遍历中的左、右子树，并作为递归输入，重复上述步骤进行递归
            // 最终找出重建二叉树的左、右子树
            if(in[i]==pre[preStart]){
                // a. 前序遍历的左子树 = 第1位（根节点）的下1位 到 x 这一串，
                // 其中，x = 根节点 + 中序遍历中左子树的数量，中序遍历左子树的数量 = 中序遍历根节点位置的前部分
                // b. 中序遍历的左子树 = 第1位~ 根节点前1位（i-inStart表示中序遍历中根节点前的左子树的个数）
                root.left = buildTreeCore(pre,preStart+1,preStart+(i-inStart), in,inStart,i-1);

                // a. 前序遍历的右子树 = 左子树最后1位的后1位 ~ 最后1位
                // b. 中序遍历的右子树 = 根节点前1位 ~ 最后1位
                root.right = buildTreeCore(pre,(preStart+1)+(i-inStart),preEnd, in,i+1,inEnd);
            }
        }
        return root;
    }
}




