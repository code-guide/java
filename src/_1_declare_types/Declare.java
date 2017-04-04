/**
 * 声明
 */
public class Declare {
    public static void main(String[] args) {

        // ===== 声明 =====
        // 前置声明: [type] [name] = [value]
        String name = "honpery";

        // 常量声明
        final int MAX_LENGTH = 100;

        // test: 实例变量调用
        System.out.println(new Declare()._name); // honpery

        // test: 类变量
        System.out.println(Declare.max); // 100
    }

    // 实例变量：类的内部属性
    String _name = "honpery";

    public String getName() {
        // 局部变量：方法内部的变量
        String name = "honpery";
        return name;
    }

    // 类变量：静态变量
    public static int max = 100;
}