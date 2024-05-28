package demo1;




/*
分两个方向讨论：
1.子类怎么访问父类的成员变量
    a.不同名的怎么访问
    b.同名的怎么访问
2.子类怎么访问父类的成员方法
    a.不同名的怎么访问
    b.同名的怎么访问
 */

/*
面试题：this和super的区别
this.data 访问当前类中的成员变量
this.func 访问当前类中其它的成员方法
this()    调用当前类的其它构造方法

super.data
super.func()
super()  调用父类的构造方法

 */

class Base {
    public int a = 1;
    public int b = 2;
}

class Derived extends Base {
    public int a = 100;
    public int c = 3;
    public void test() {
        System.out.println(super.a);  //super代表父类对象的引用
        System.out.println(this.a);   //如果子类有，优先访问子类的。
        System.out.println(this.b);   //子类没有然后才去看父类有没有  父类也没有那就会报错
        System.out.println(super.b);
        System.out.println(this.c);
    }
}


public class Test3 {

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
