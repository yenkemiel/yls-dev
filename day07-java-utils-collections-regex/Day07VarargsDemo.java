/*
 * Day06 - 基本型別與可變參數
 * 
 * 學習重點：
 * 1. char 與 int 轉換
 * 2. Character.getNumericValue()
 * 3. 可變參數 (Varargs)
 */

public class Day07VarargsDemo {

    public static void main(String[] args) {

        // 1. char 與 int 轉換

        // char 轉 int (會轉成 ASCII / Unicode 數值)
        char c = '1';
        int i = c;

        System.out.println(i); // 輸出 49


        // 1.1 Character.getNumericValue()

        // 取得真正數字
        char c1 = '1';
        int i1 = Character.getNumericValue(c1);

        System.out.println(i1); // 輸出 1


        // 2. 可變參數 (Varargs)

        int sum1 = sum(1, 2, 3);
        int sum2 = sum(10, 20);
        int sum3 = sum();   // 可以不傳參數

        System.out.println("Sum1: " + sum1); // 6
        System.out.println("Sum2: " + sum2); // 30
        System.out.println("Sum3: " + sum3); // 0

    }


    // 可變參數方法

    public static int sum(int... numbers) {

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

}