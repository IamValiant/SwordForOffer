package problem26;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class DoesTree1HaveTree2 {
    public boolean hasSubTree(TreeNode root1,TreeNode root2){
        boolean result =false;
        if(root1 != null && root2 != null){
            if(root1.val==root2.val){
                result = ifTree1HasTree2(root1,root2);
            }
            if(!result){
                return ifTree1HasTree2(root1.left,root2);
            }
            if(!result){
                return ifTree1HasTree2(root1.right,root2);
            }
        }
        return result;
    }

    private boolean ifTree1HasTree2(TreeNode node1, TreeNode node2) {
        if(node2==null){
            return true;
        }
        // 如果node2没有到叶子结点的左右子结点，而node1先到了说明树2比树1还大，返回false
        //注意和上面的if语句不可颠倒
        if(node1==null){
            return false;
        }
        if(node1.val != node2.val){
            return false;
        }
        return ifTree1HasTree2(node1.left,node2.left) && ifTree1HasTree2(node1.right,node2.right);
    }
}
