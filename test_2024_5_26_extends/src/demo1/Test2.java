package demo1;




class Animal {
    public static String name;
    public int age;
    public String color;

    static {
        System.out.println("Animal::static{}");
    }

    {
        System.out.println("Animal::{}");
    }


    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

        System.out.println("Animal(String name, int age, String color)");
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭！");
    }




}

class Dog extends Animal {

    static {
        System.out.println("Dog::static{}");
    }

    {
        System.out.println("Dog::{}");
    }


    public Dog() {
        super("haha", 10, "黄色");
        System.out.println("Dog()");
    }

    public void bark() {
        System.out.println(this.name + "正在汪汪汪！");
    }
}


class Cat extends Animal {

    static {
        System.out.println("Cat::static{}");
    }

    {
        System.out.println("Cat::{}");
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);  //虽然调用了父类的构造方法，但是并没有产生父类对象   此时只是帮你进行初始化父类的成员
        System.out.println("Cat(String name, int age, String color)");
    }

    public void miaomiao() {
        System.out.println(this.name + "正在喵喵喵！");
    }
}







public class Test2 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("===============================");
        Dog dog2 = new Dog();
        System.out.println("===============================");
        Cat cat = new Cat("小花", 2, "白色");

    }


    public static void main1(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        System.out.println("===============================");
        Cat cat = new Cat("小花", 2, "白色");
        cat.eat();
        cat.miaomiao();


    }
}
