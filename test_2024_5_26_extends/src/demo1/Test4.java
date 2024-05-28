package demo1;


class Base2 {
    public void testA() {
        System.out.println("testA()");
    }

}




class Derived2 extends Base2 {

    public void testA() {
        System.out.println("Derived::testA()");
    }
    public void testB() {
        System.out.println("testB()");
    }

    public void testC() {
        this.testA();
        //super关键字的作用：在子类方法中访问父类的成员
        super.testA();
        this.testB();
    }

    /*public static void testC() {  静态方法testC是不依赖于对象的
        this.testA();
        super.testA();
        this.testB();
    }*/

}





public class Test4 {


    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        derived2.testC();


    }
}
