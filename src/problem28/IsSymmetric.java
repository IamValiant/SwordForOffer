package problem28;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {

        return isSymmetricTree(root, root);
    }

    private boolean isSymmetricTree(TreeNode root1, TreeNode root2) {
        //此处注意不能只考虑跟节点是否为空，要考虑之后递归过来的情况
        //一直比较到空节点才算结束（前序遍历到空节点）
        if(root1==null && root2==null){
            return true;
        }
        //有一个为空、一个不为空时，不对称
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isSymmetricTree(root1.left,root2.right) && isSymmetricTree(root1.right,root2.left);
    }
}
