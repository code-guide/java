/**
 * 类
 */
public class Class {
    public static void main(String[] args) {
        // 访问控制符 default public private protected
    }
}

class Person {
    private String _name; // private 私有，不继承，外部不可调用

    public String getName() { // public 公共，可继承，外部可调用
        return this._name;
    }

    protected int age; // protected 保护，可继承，外部不可调用

    String level; // default 默认，同一个包内可调用

}