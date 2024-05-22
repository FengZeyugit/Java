package Demo;


interface ITestable {
    void test();




}




public class Test4 {
    public static void main(String[] args) {

        //不能实例化接口对象
        //ITestable iTestable = new ITestable();
        //只能通过一个类实现该接口重写test方法，来实例化那个类的对象！
        /*
        1.并没有实例化接口对象
        2.匿名内部类



         */
        ITestable it = new ITestable(){

            @Override
            public void test() {
                System.out.println("test()......");
            }
        };
        it.test();
    }






}
