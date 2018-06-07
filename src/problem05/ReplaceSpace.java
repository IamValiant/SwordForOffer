package problem05;


/**
 * Created by Xueyong on 2018/6/6.
 */
public class ReplaceSpace {
    /**
     * 从后往前替换
     * 注意先计算出现在的长度和空格替换后的长度，得到新的长度后再从后往前替换
     * 时间复杂度为 O(n)
     * 注：LeetCode 暂无
     * 解题思路：如何解-->返回值&函数名&参数输入-->边界条件-->循环（终止条件+循环体）
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        //当前字符串的长度
        int originLength = str.length();

        //统计字符串中的空格个数
        int numOfBlank = 0;
        for(int i=0;i<originLength;i++){
            if(str.charAt(i)==' '){
                numOfBlank++;
            }
        }

        //计算替换后的字符串总长度，增加所需内存空间
        int newLength = originLength + 2*numOfBlank;
        //设置新的字符串长度
        str.setLength(newLength);

        //从尾-->头遍历并替换字符串
        int indexOfOriginal = originLength-1;  //指针1指向原先字符串的末尾
        int indexOfNew = newLength-1;  //指针2指向新字符串的末尾
        while (indexOfOriginal>=0 && indexOfNew>indexOfOriginal){
            if(str.charAt(indexOfOriginal)==' '){
                //在指针2前插入“%20”，并将其向前移动3格
                str.setCharAt(indexOfNew--,'0');
                str.setCharAt(indexOfNew--,'2');
                str.setCharAt(indexOfNew--,'%');

                indexOfOriginal--; //指针1向前移动1格
            }else{
                //复制原先字符串的字符到新字符串，并移动
                str.setCharAt(indexOfNew--,str.charAt(indexOfOriginal--));
            }
        }
    return str.toString();
    }
}




