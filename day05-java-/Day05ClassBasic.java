/**
 * Day05 Java 筆記
 *
 * 主題：
 * 1. Class 與 Object
 * 2. 成員變數與方法
 * 3. 物件建立
 * 4. 參數傳遞
 * 5. Constructor 建構子
 * 6. Constructor Overload
 * 7. Inheritance 繼承
 */

public class Day05ClassBasic {

    public static void main(String[] args) {

        // 1. 建立物件

        People people = new People();

        people.eat();
        people.work();

        System.out.println(people.age);


        // 2. 物件參數傳遞

        people.change(people);

        System.out.println("after change = " + people.age);


        // 3. 繼承

        Apple apple = new Apple();

        System.out.println(apple.name);

    }

}

/**
 * Class 範例
 */
class People {

    String name;
    int age = 20;
    int height;
    double weight;

    void eat(){
        System.out.println("Eat spaghetti");
    }

    void work(){
        System.out.println("go to school");
    }

    public void change(People people){
        people.age = 30;
    }

}

/**
 * 父類
 */
class Fruit{

    String name = "Fruit";

}

/**
 * 子類
 */
class Apple extends Fruit{

}