package problem27;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class test27 {
    InvertTree it = new InvertTree();

    @Test
    public void test(){
// 构造二叉树
        //            8
        //       6         10
        //    5     7    9     11
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        // 通过层序遍历输出二叉树结构
        System.out.print("初始二叉树结构:");
        levelTravel(root);
        System.out.println();

        // 测试
        System.out.print("交换后：");
        it.invertTree(root);
        levelTravel(root);

    }

    /**
     * 内容：层序遍历
     * 方式：非递归（采用队列）
     * 作用：本方法只用于测试时输出数组，与本解题算法无关
     */
    public void levelTravel(TreeNode root){
        // 创建队列
        Queue<TreeNode> q=new LinkedList<TreeNode>();

        // 步骤1：判断当前结点是否为空；若是，则返回空操作
        if(root==null)
            return;
        // 步骤2：入队当前结点
        q.add(root);

        // 步骤3：判断当前队列是否为空，若为空则跳出循环
        while(!q.isEmpty()){

            // 步骤4：出队队首元素
            root =  q.poll();

            // 步骤5：输出 出队元素
            printNode(root);

            // 步骤5：若出队元素有左孩子，则入队其左孩子
            if(root.left!=null) q.add(root.left);

            // 步骤6：若出队元素有右孩子，则入队其右孩子
            if(root.right!=null) q.add(root.right);
        }
    }

    /**
     * 输出结点值
     * 作用：本方法只用于测试时输出数组，与本解题算法无关
     */
    public static void printNode(TreeNode node){
        System.out.print(node.val+" ");
    }
}
