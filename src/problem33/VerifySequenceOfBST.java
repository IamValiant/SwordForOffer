package problem33;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class VerifySequenceOfBST {
    public boolean verifySequenceOfBST(int[] sequence,int length){
        if(sequence==null || length<=0){
            return false;
        }
        //后序遍历，数列最后一个就是根节点
        int root = sequence[length-1];

        //二叉搜索树的左子树(小于根节点的部分)
        int i=0; //这里的顺序很重要，所以需要保留下数字
        for(;i<length-1;i++){
            if(sequence[i]>root){
                break;
            }
        }
        //找到了左右子树的分界，[0, i-1]为左子树，[i, length -1]是右子树
        //二叉搜索树的右子树(大于根节点的部分)
        int j=i;
        for(;j<length-1;j++){
            if(sequence[j]<root){
                return false;
                //后面的都需要大于根节点
            }
        }

        //判断左子树是不是二叉搜索树
        boolean left = true;
        if(i>0){
            left = verifySequenceOfBST(sequence,i);
        }

        //判断右子树是不是二叉搜索树
        boolean right = true;
        if(i<length-1){
            right = verifySequenceOfBST(sequence,length-i-1);
        }
        return (left&&right);
    }
}
