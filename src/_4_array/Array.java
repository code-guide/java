
/**
 * 数组
 */
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 声明1 type[] name = {value} 推断大小
        Person[] students = { new Person("张三"), new Person("李四") };

        // 声明2 name = new type[size] 指定大小
        teacher = new Person(1);
        teacher[0] = new Person("张老师");

        // 遍历
        for (Person p : students) {
            p.sayName();
        }
    }
}

class Person {
    private String _name;

    public Person(String name) {
        this._name = name;
    }

    public void sayName() {
        System.out.println(this._name);
    }
}