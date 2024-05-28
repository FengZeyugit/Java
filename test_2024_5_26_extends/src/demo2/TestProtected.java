package demo2;

public class TestProtected {
    public static void main(String[] args) {
        Test test = new Test();
        //同一个包的不同类
        System.out.println(test.c);
    }
}
