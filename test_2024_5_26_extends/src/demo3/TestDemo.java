package demo3;

import demo2.Test;

public class TestDemo extends Test {

    public void test() {
        //不同包中的子类可以访问父类protected修饰的成员
        System.out.println(super.c);
    }
    public static void main(String[] args) {
        Test test = new Test();
        //不同包中的子类
        System.out.println(test.a);
        //System.out.println(test.c);
    }
}
