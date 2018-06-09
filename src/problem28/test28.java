package problem28;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class test28 {
    IsSymmetric is = new IsSymmetric();
    @Test
    public void test(){
// 构造测试二叉树1
        //            8
        //       6         6
        //    5     7    7     5
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(6);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(7);
        root1.right.left = new TreeNode(7);
        root1.right.right = new TreeNode(5);
        System.out.println(is.isSymmetric(root1));

        // 构造测试二叉树2
        //            8
        //       6         9
        //    5     7    7     5
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(9);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(7);
        root2.right.right = new TreeNode(5);

        System.out.println(is.isSymmetric(root2));
    }
}
