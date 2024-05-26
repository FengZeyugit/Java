/*
有关类和对象的示例代码
static不能修饰局部变量，static修饰的是类变量不是方法的变量
 */

class Person {
    private String name;  //封装
    private int age;
    //通过静态代码块初始化静态成员变量
    static {
        //1     静态的只执行一次
    }
    //通过实例代码块初始化非静态成员变量
    {
        //2
    }

    public Person() {
        //3
    }
    //通过构造方法初始化成员变量
    public Person(String name, int age) {
        this();
        //this.name = name;
        //this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name);

    }
    public static void func() {


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



public class Test {
    public static void main(String[] args) {
        Person person = new Person("fzy",20);
        System.out.println(person.getName()); //null

    }



}
