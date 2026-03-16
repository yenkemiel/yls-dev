// 1. 遞迴 (Recursion)

// 1.1 遞迴是指「方法自己呼叫自己」

// 1.2 遞迴必須包含兩個重要部分
// (1) 終止條件 (Base Case)
// (2) 遞迴呼叫 (Recursive Call)

// 1.3 如果沒有終止條件
// 程式會一直呼叫自己
// 最後會發生 StackOverflowError


public class Day04RecursionDemo {

    public static void main(String[] args) {

        // 2. 階乘 (Factorial)

        // 2.1 階乘公式
        // N! = N × (N-1)!

        // 2.2 例如
        // 5! = 5 × 4 × 3 × 2 × 1 = 120

        int n = 5;

        System.out.println(n + "! = " + factorial(n));


        // 3. 加總 (sum)

        // 3.1 計算 1 + 2 + ... + n

        int num = 5;

        System.out.println("sum(" + num + ") = " + sum(num));
    }

    // 4. 階乘遞迴

    public static int factorial(int n) {

        // 4.1 終止條件

        if (n == 0 || n == 1) { // if (n <= 1) { 更簡潔
            return 1;
        }

        // 4.2 遞迴公式
        // n! = n × (n-1)!
        return n * factorial(n - 1);
    }

    // 5. 遞迴加總

    public static int sum(int n) {

        // 5.1 終止條件
        if (n == 1) {
            return 1;
        }

        // 5.2 遞迴公式
        return n + sum(n - 1);
    }

}