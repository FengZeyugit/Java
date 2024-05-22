package Demo;



class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     * 实例内部类：定义在类的内部   方法的外部！！  可以当作外部类的实例成员
     *1.这个实例内部类 到底怎么使用？
     *2.如何访问和外部类一样的成员属性？
     */
    class InnerClass {
        public int data1 = 100;
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test() {
            System.out.println("InnerClass::test()");
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println("=================");
            System.out.println(data1);
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);
        }


    }

    public void testA() {
        System.out.println("OuterClass::testA()");
    }






}





public class Test {


    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass innerClass = out.new InnerClass();
        //InnerClass innerClass = new InnerClass();
        innerClass.test();


    }





}
