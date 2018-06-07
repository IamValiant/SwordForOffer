package problem07;

import org.junit.Test;

import java.util.LinkedList;


/**
 * Created by Xueyong on 2018/6/7.
 */
public class test07 {
    BuildTree bd = new BuildTree();

    @Test
    public void test() {

        //前序遍历{1,2,4,7,3,5,6,8} & 中序遍历序列{4,7,2,1,5,3,8,6}
        int[] preorder = {1,2,4,7,3,5,6,8};
        int[] inorder = {4,7,2,1,5,3,8,6};
        // 重建二叉树后，使用宽度遍历进行输出测试
        levelTraversal(bd.buildTree(preorder,inorder));
        }

        /**
         * 测试辅助算法：分层遍历二叉树，使用一个队列，也就是层序遍历
         * @param root
         */
        public static void levelTraversal(TreeNode root){
            if(root==null)
                return;
            //层序遍历
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            while(!queue.isEmpty()){
                TreeNode cur = queue.poll();
                System.out.print(cur.val+" ");
                if(cur.left!=null) {
                    queue.offer(cur.left);
                }
                if(cur.right!=null) {
                    queue.offer(cur.right);
                }
            }
        }
}



