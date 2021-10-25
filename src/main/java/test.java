import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Project name(项目名称)：作业_多种排序方式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/25
 * Time(创建时间)： 21:46
 * Version(版本): 1.0
 * Description(描述)： 3种以上
 */

public class test
{
    public static void main(String[] args)
    {   //1.经典排序，这里只写冒泡，其它的不想写已忽略
        int[] a = {1, 2, 3, 6, 5, 4};
        int s;
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    s = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = s;
                }
            }
        }
        for (int ss : a)
        {
            System.out.print(ss + " ");
        }
        System.out.println();
        //2.集合类排序
        int[] a1 = {1, 2, 3, 6, 5, 4};
        ArrayList<Integer> p = new ArrayList<>();
        for (int ss : a1)
        {
            p.add(ss);
        }
        Collections.sort(p);
        for (int ss : p)
        {
            System.out.print(ss + " ");
        }
        //3.arrays类排序
        int[] a2 = {1, 2, 3, 6, 5, 4};
        System.out.println();
        Arrays.sort(a2);
        for (int ss : p)
        {
            System.out.print(ss + " ");
        }
        System.out.println();
    }
}
