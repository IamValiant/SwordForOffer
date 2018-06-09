package problem26;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class test26 {
    DoesTree1HaveTree2 dtht =new DoesTree1HaveTree2();

    @Test
    public void test(){
        // 树结构定义
        // 树A
        TreeNode root1 = new TreeNode (8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.right = new TreeNode(7);

        // 树B
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);

        // 树C
        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(4);
        root3.right = new TreeNode(3);

        // 功能测试：树B是树A的子结构、树C是树A的子结构
        System.out.println(dtht.hasSubTree(root1,root2));
        System.out.println(dtht.hasSubTree(root1,root3));

        // 异常测试：树A、树B 任一为空 / 均为空时
        System.out.println(dtht.hasSubTree(null,root3));
        System.out.println(dtht.hasSubTree(root1,null));
        System.out.println(dtht.hasSubTree(null,null));
    }
}
