import java.util.ArrayList;

public class Day07ArrayListDemo {

    public static void main(String[] args) {

        // 1. 建立 ArrayList
        // ArrayList 是可動態調整大小的陣列
        ArrayList<String> fruits = new ArrayList<>();


        // 1.1 新增元素 add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Applepie");


        // 1.2 插入元素 add(index, element)
        // 在索引 1 的位置插入 "Orange"
        fruits.add(1, "Orange");


        // 1.3 取得元素 get(index)
        String fruit = fruits.get(2);
        System.out.println("取得元素: " + fruit);


        // 1.4 更新元素 set(index, element)
        fruits.set(2, "Mango");
        System.out.println("更新後: " + fruits);


        // 1.5 刪除元素 remove(index)
        fruits.remove(3);
        System.out.println("刪除後: " + fruits);


        // 1.6 迴圈遍歷 ArrayList
        for (var item : fruits) {
            System.out.println(item);
        }


        // 1.7 取得大小 size()
        int size = fruits.size();
        System.out.println("ArrayList 大小: " + size);


        // 1.8 清空 clear()
        fruits.clear();
        System.out.println("清空後: " + fruits);


        // 1.9 判斷是否為空 isEmpty()
        boolean isEmpty = fruits.isEmpty();
        System.out.println("是否為空: " + isEmpty);

    }
}