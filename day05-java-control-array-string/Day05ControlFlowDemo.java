/**
 * Day05 Java 筆記
 *
 * 主題：
 * 1. if 條件判斷
 * 2. switch 選擇敘述
 * 3. while 迴圈
 * 4. do while 迴圈
 * 5. for 迴圈
 * 6. 加強型 for (for-each)
 * 7. break 與 continue
 */

public class Day05ControlFlowDemo {

    public static void main(String[] args) {

        // 1. if 條件判斷

        int score = 85;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // if 也可以巢狀 (nested if)

        int age = 20;
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Senior");
            } else {
                System.out.println("Adult");
            }
        }

        // 練習：找出四個數字中的最大值(使用if平層)
        int a1 = 3, b2 = 6, c = 2, d = 9;
        int max = a1; // 假設第一個數最大

        if (b2 > max) max = b2;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Max value is: " + max);


        // 2. switch 選擇敘述

        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println("This is an apple.");
                break;

            case "banana":
                System.out.println("This is a banana.");
                break;

            case "orange":
                System.out.println("This is an orange.");
                break;

            default:
                System.out.println("Unknown fruit.");
        }

        // break 若不寫可能會造成 case 穿透


        // 3. while 迴圈

        int i = 1;

        while (i <= 5) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        // 練習: 1 + 2 + 3 + ... + 5

        int sum1 = 0;
        int j = 1;

        while (j <= 5) {
            sum1 += j;
            j++;
        }

        System.out.println("1~5總和 = " + sum1);


        // 練習: 1 ~ 100 偶數總和

        int sum2 = 0;
        int k = 2;

        while (k <= 100) {
            sum2 += k;
            k += 2;
        }

        System.out.println("1~100偶數總和 = " + sum2);


        // 4. do while 迴圈

        int a = 1;
        int sum3 = 0;

        do {
            sum3 += a;
            a++;
        } while (a <= 100);

        System.out.println("1~100總和 = " + sum3);


        // do while 特性：
        // 條件不成立時，仍然會執行一次


        // 5. for 迴圈

        int sum4 = 0;

        for (int n = 1; n <= 100; n++) {
            sum4 += n;
        }

        System.out.println("1~100總和 = " + sum4);


        // 練習: 1~100 偶數總和

        int sum5 = 0;

        for (int n = 2; n <= 100; n += 2) {
            sum5 += n;
        }
        // for (int n = 1; n <= 50; n++) {
        // sum5 += (n * 2); 
        // }

        System.out.println("1~100偶數總和 = " + sum5);

        // 練習：找出四個數字中的最大值(使用for)

        int[] arr = {3, 6, 2, 9};
        int max2 = arr[0];

         for(int n = 1; n < arr.length; n++){
            if(arr[n] > max2){
                max2 = arr[n];
            }
         }
         System.out.println("max is " + max2);


        // 5.1 反向迴圈

        for (int n = 10; n >= 1; n--) {
            System.out.print(n);
        }
        System.out.println();

        // 6. 加強型 for (for-each)

        int[] numbers = {1, 2, 3, 4, 5};
        // var numbers = new int[]{1, 2, 3, 4, 5};

        for (int number : numbers) { // for (var number : numbers) { 
            System.out.print(number);
        }
        System.out.println();

        // 7. break

        for (int x = 1; x <= 10; x++) {

            if (x == 5) {
                break;   // 跳出整個迴圈
            }

            System.out.print(x);
        } // break 會跳出整個迴圈到這裡
        System.out.println();

        // 8. continue

        for (int x = 1; x <= 10; x++) {

            if (x == 5) {
                continue; // 跳過本次迴圈
            }

            System.out.print(x);
        } // continue 是跳到這裡(迴圈收尾處)
          // 然後立刻執行上面的 x++
          
        System.out.println();

        // 9. 綜合練習

        for (int p = 0; p < 3; p++) {

            if (p == 2) { // 只要 p 等於 2，後面的內層和列印直接被消失
                break;
            }

            // 內層迴圈 (小齒輪)
            for (int q = 0; q <= 2; q++) {

                if (q == 1) {
                    continue;
                    // break;
                }

                System.out.println("q = " + q); // 這是內層的一部分，會跑多次
            }

            System.out.println("p = " + p); // 內層跑完才會輪到這行
        }
        // p==1 -> 輸出 p = 0; q = 0; p = 0;
        // p==2 -> 輸出 q = 0; q = 2; p = 0; q = 0; q = 2; p = 1
        // p==2, break; -> 輸出 q = 0; ; p = 0; q = 0; p = 1

    }
}