import com.sun.tools.javac.util.Assert;

/**
 * 7. 颠倒整数
 * <p>
 * 给定一个范围为 32 位 int 的整数，将其颠倒。
 * <p>
 * 例 1:
 * <p>
 * 输入: 123
 * 输出:  321
 * <p>
 * 例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * <p>
 * 例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */
public class A02ReverseNumber {

    public static void main(String[] args) {
        int a1 = reverse(123);
        System.out.println("a1 =" + a1);
        Assert.check(a1 == 321);

        int a2 = reverse(-123);
        System.out.println("a2 =" + a2);
        Assert.check(a2 == -321);

        int a3 = reverse(120);
        System.out.println("a3 =" + a3);
        Assert.check(a3 == 21);
    }

    private static int reverse(int x) {
        int y;
        int _x = 0;

        //感觉这道题，最难是对边界条件的处理

        while (x != 0) {
            y = x % 10;
            //这个地方，哪怕多加一个=也会出现问题...
            //f (_x >= Integer.MAX_VALUE / 10 || _x <= Integer.MIN_VALUE / 10)  //测试失败！
            if (_x > Integer.MAX_VALUE / 10 || _x < Integer.MIN_VALUE / 10)
                return 0;
            _x = _x * 10 + y;
            x /= 10;
        }
        return _x;
    }
}
