import java.util.Scanner;

public class Day05StringDemo {
    public static void main(String[] args) {

        // 1. String 方法

        String str = " Hello Java ";
        String str1 = "1234567890";

        System.out.println("原始字串: [" + str + "]");

        // 1.1 length() → 長度
        System.out.println("字串長度: " + str.length());

        // 1.2 toLowerCase() → 轉小寫
        System.out.println("轉小寫: " + str.toLowerCase());

        // 1.3 toUpperCase() → 轉大寫
        System.out.println("轉大寫: " + str.toUpperCase());

        // 1.4 trim() → 去除前後空白
        System.out.println("去除前後空白: [" + str.trim() + "]"); // [Hello Java]

        // 1.5 substring(begin, end) → 擷取字串
        System.out.println("擷取字串(2~7): " + str1.substring(2, 8)); // 345678(index不包含第8個)
        
        // 1.6 indexOf() → 找位置
        System.out.println("字元 'J' 的位置: " + str.indexOf("J")); // 6

        // 1.7 charAt() → 取單一字元
        System.out.println("index 1 的字元: " + str.charAt(1)); // H

        // 1.8 replace() → 取代字元
        System.out.println("將 a 改成 X: " + str.replace('a', 'X')); //  Hello JXvX

        // 1.9 concat() → 字串相加
        System.out.println("字串串接: " + str.concat("!!!")); // Hello Java !!!



        // 2. String 比較

        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1 == s2); // true

        String s3 = new String("ABC"); // 強制開一個新的空間

        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true -> 比內容

        
        String s = "63";
        System.out.println("please input the number:63");

        // 建立 Scanner 物件來接收輸入
        Scanner sc = new Scanner(System.in);

        // 讀取使用者輸入（字串）
        String input = sc.next();

        // 關閉 Scanner
        sc.close();

        // == 比地址
        // equals() 比內容

        // 3. 例子: 字串比較
        boolean b = (s.equals(input)); 
        System.out.println("s.equals(input) (內容): " + b);

        // 錯誤用法
        boolean b1 = (s == input); 
        System.out.println(b1); // false
        // == 比的是記憶體地址, input是使用者, 輸入一定是新的物件


        // 3.2 字串比較 + if
        boolean b2 = (s.equals(input));
        System.out.println("s.equals(input) (內容): " + b2);

        if (s.equals(input)) {
            System.out.println("equals 判斷: true");
        }

        // 錯誤用法（比較字串內容卻用 ==）
        if (input == "63") {
            System.out.println("input == \"63\" : true");
        } else {
            System.out.println("input == \"63\" : false");
        }
        // 幾乎一定是 false（因為不是同一個地址）


        // 3.3 特殊情況（容易誤會）

        // 這裡兩個都是字串常量
        boolean b3 = (s == "63");

        System.out.println("s == \"63\" (常量池): " + b3); // true
        // 因為 Java 會共用同一個 "63"（字串池）

        if (s == "63") {
            System.out.println("s == \"63\" : true");
        }

        
        // 4. 例子:
        String strA = "ABC"; // 進常量池
        String strB = "ABC"; // 進常量池用同一個ABC -> 省記憶體

        System.out.println(strA == strB); // true
        String strNewA = new String("ABC"); // 會在 Heap 開新空間
        String strNewB = new String("ABC");

        System.out.println(strNewA == strNewB); // false

        // 5. 例子:
        String s4 = "ABC";

        // 常量拼接
        String literalStr = "A" + "B" + "C"; // 編譯時直接變成ABC
        System.out.println(s4 == literalStr); // true

        String a4 = "A"; // 進常量池 A
        String b4 = "B"; // 進常量池 B
        String c4 = "C"; // 進常量池 C

        // 變數拼接
        String variableStr = a4 + b4 + c4; // 執行時在 Heap 建立一個新的 String 物件 ABC
        System.out.println(s4 == variableStr); // false


        
    }

}
