
class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



public class Test {




    public static void main(String[] args) {

        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(5);
        bt.insert(19);
        bt.insert(6);
        System.out.println(bt.search(5));


    }
}
