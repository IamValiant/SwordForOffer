package problem05;

import org.junit.Test;
import problem04.FindIn2DArray;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class test05 {
    ReplaceSpace rs = new ReplaceSpace();

    @Test
    public void test() {
        // 功能测试1：字符串中含空格
        StringBuffer string1 =new StringBuffer("We are happy");
        System.out.println(rs.replaceSpace(string1));

        // 功能测试2：字符串中不含空格
        StringBuffer string2 =new StringBuffer("Wearehappy");
        System.out.println(rs.replaceSpace(string2));

        // 特殊输入测试：为空指针、为空字符串、只有1个空格字符
        System.out.println(rs.replaceSpace(null));

        StringBuffer string3 =new StringBuffer("");
        System.out.println(rs.replaceSpace(string3));

        StringBuffer string4 =new StringBuffer(" ");
        System.out.println(rs.replaceSpace(string4));
    }

}


