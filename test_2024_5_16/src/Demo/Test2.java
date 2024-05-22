package Demo;

class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /*
        静态内部类：
        1. 如何生成静态内部类对象？
        2. 不能直接调用外部类的 非静态成员变量(实例成员变量)
     */
    static class InnerClass {
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test() {
            System.out.println("InnerClass：：test()");
            OuterClass2 outerClass2 = new OuterClass2();
            System.out.println(outerClass2.data1);
            System.out.println(outerClass2.data2);
            System.out.println("========");
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }

    public void testA(){
        System.out.println("OuterClass2::testA()");
    }
}
public class Test2 {
    public static void main(String[] args) {
        //OuterClass2 outerClass2 = new OuterClass2();
        ///System.out.println(outerClass2.data1);
        //System.out.println(outerClass2.data2);



        OuterClass2.InnerClass innerClass =
                new OuterClass2.InnerClass();
        innerClass.test();
    }
}