/*
 * Day07 - StringBuilder 示範
 * 
 * 學習重點：
 * 1. StringBuilder 建立字串
 * 2. StringBuilder 效能測試
 * 3. String 效能比較
 */

public class Day07StringBuilderDemo {

    public static void main(String[] args) {

        // 1. 使用 StringBuilder 建立字串
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");

        String str = sb.toString();

        System.out.println("結果: " + str);


        // 2. StringBuilder 效能測試

        long start = System.currentTimeMillis();
        System.out.println("開始時間: " + start);

        StringBuilder sb2 = new StringBuilder();

        for (int i = 1; i <= 1000; i++) {
            sb2.append(i);
        }

        String result = sb2.toString();

        long end = System.currentTimeMillis();

        System.out.println("結束時間: " + end);
        System.out.println("字串長度: " + result.length());
        System.out.println("StringBuilder 花費時間: " + (end - start) + " ms");


        // 3. String 效能比較

        long start2 = System.currentTimeMillis();
        System.out.println("開始時間: " + start2);

        String result2 = "";

        for (int i = 1; i <= 1000; i++) {
            result2 = result2 + i;
        }

        long end2 = System.currentTimeMillis();

        System.out.println("結束時間: " + end2);
        System.out.println("字串長度: " + result2.length());
        System.out.println("String 花費時間: " + (end2 - start2) + " ms");


    }
}