/**
 * 继承
 */
public class Extends {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 1);
        System.out.println(s1.getInfo());
    }
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int _grade;

    public Student(String name, int grade) {
        super(name);
        // this.name = name;    //err
        this._grade = grade;
    }

    public String getInfo() {
        // return super.name + ":" + this._grade;
        return this.name + ":" + this._grade;
    }

    // 重写
    @Override
    public void setName(String name) {
        this.name = "student:" + name;
    }

    // 重载
    public void setName(String firstName, String lastName) {
        this.name = "student: " + firstName + " " + lastName;
    }

}