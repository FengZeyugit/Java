package Demo;

class OuterClass3 {
    public int data1 = 1;

    public void test() {
        //局部内部类   局部内部类只能在当前方法中使用
        class InnerClass {
            public int data1 = 100;
            public static int data2 = 2;

            public void test() {
                System.out.println("Inn::test()");
            }
        }
        //局部内部类   局部内部类只能在当前方法中使用
        InnerClass innerClass = new InnerClass();
        innerClass.test();



    }





}

public class Test3 {


    public static void main(String[] args) {

    }
}
