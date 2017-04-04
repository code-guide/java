/**
 * 运算符
 */
public class Operator {
    public static void main(String[] args) {

        // 算术运算符 +, -, *, /, %, ++, --
        System.out.println(5 % 2); // 1
        System.out.println(5 / 2); // 2

        // 关系运算符 ==, !=, >, <, >=, <=
        System.out.println("a" == "a"); // true

        // 位运算符 |, &, ^, ~, <<, >>, >>>
        System.out.println(3 >> 1); // 11 => 1
        System.out.println(3 >>> 1); // 11 => 0000 1111

        // 逻辑运算符 ||, &&, !  ==> 都是短路的
        int num = 1;
        boolean result = true || (num++ > 1);
        System.out.println(num); // 1

        // 赋值运算符 +=, -+, *=, /=, %=, <<=, >>=, >>>=, &=, |=, ^=

        // 三元运算符
        num = result ? num + 1 : num - 1;

        // 类型检测
        boolean b = new OperatorTest() instanceof OperatorTest;
        System.out.println(b); // true

    }
}

class OperatorTest {
}