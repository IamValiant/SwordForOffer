package problem27;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root){
        //根节点为空，返回空
        if(root==null){
            return null;
        }
        //只有根节点，直接返回根节点即可
        if(root.left==null && root.right==null){
            return root;
        }
        //交换左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //递归交换
        if(root.left != null){
            invertTree(root.left);
        }
        if(root.right != null){
            invertTree(root.right);
        }
        return root;
    }
}
