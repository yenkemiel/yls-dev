/*
 * Day08RegexDemo
 * 正規表達式 Regex 筆記
 * 
 * 學習重點：
 * 1. matches()
 * 2. 數字匹配 \d
 * 3. 分組 ()
 * 4. OR 條件 |
 * 5. replaceAll()
 * 6. 特殊字元
 */

public class Day07RegexDemo {

    public static void main(String[] args) {

        /*
         * 1. 基本 Regex
         */

        // 1.1 matches() 基本使用
        String pattern = "a*";
        String test = "aaa";
        String test1 = "bbb";

        System.out.println(test.matches(pattern));   // true
        System.out.println(test1.matches(pattern));  // false


        // 1.2 * 0 次或以上
        System.out.println("aaa".matches("a*")); // true


        // 1.3 + 1 次或以上
        System.out.println("aaa".matches("a+")); // true


        // 1.4 ? 0 次或 1 次
        System.out.println("a".matches("a?")); // true


        // 1.5 {n} 指定次數
        System.out.println("aaa".matches("a{3}")); // true


        // 1.6 {n,} 至少 n 次
        System.out.println("aaaa".matches("a{2,}")); // true


        // 1.7 {n,m} 次數範圍
        System.out.println("aaa".matches("a{2,4}")); // true



        /*
         * 2. 數字匹配 \d
         */

        String str1 = "0988-888-999";
        String pattern7 = "\\d{4}-\\d{3}-\\d{3}";

        System.out.println(str1.matches(pattern7));



        /*
         * 3. 手機號碼範例
         */

        String phone = "02-12345678";
        String phonePattern = "\\d{2}-\\d{8}";

        System.out.println(phone.matches(phonePattern));



        /*
         * 4. 分組 ()
         */

        String phone2 = "0935-123-456";
        String pattern8 = "\\d{4}(-\\d{3}){2}";

        System.out.println(phone2.matches(pattern8));



        /*
         * 5. OR 條件 |
         */

        String phone3 = "02-12345678";
        String pattern9 = "(\\d{2}-\\d{8})|(\\d{4}-\\d{3}-\\d{3})";

        System.out.println(phone3.matches(pattern9));



        /*
         * 6. replaceAll()
         */

        String str = "Hello Java! I love Java.";
        String newStr = str.replaceAll("Java", "Python");

        System.out.println(newStr);



        /*
         * 7. 特殊字元
         */

        // . 任意字元
        System.out.println("abc".matches("...")); // true

        // 任意單一字元
        System.out.println("abc".matches("a.c")); // true

        // a 開頭 任意三個字元
        System.out.println("abcd".matches("a...")); // true

        // 任意字元 0 次以上
        System.out.println("abcdef".matches("a.*f")); // true

        // 不符合範例
        System.out.println("ac".matches("a.c")); // false



        /*
         * 8. 開頭與結尾
         */

        // ^ 開頭
        System.out.println("Java".matches("^Java")); // true

        // $ 結尾
        System.out.println("HelloJava".matches(".*Java$")); // true



        /*
         * 9. 反向字元
         */

        // 非 a
        System.out.println("b".matches("[^a]")); // true

        // 非數字
        System.out.println("abc".matches("[^0-9]+")); // true



        /*
         * 10. 常用 Regex 符號
         */

        // \d 數字
        System.out.println("123".matches("\\d+")); // true

        // \D 非數字
        System.out.println("abc".matches("\\D+")); // true

        // \w 字母數字底線
        System.out.println("abc123".matches("\\w+")); // true

        // \W 非字母數字底線
        System.out.println("@#!".matches("\\W+")); // true

        // \s 空白
        System.out.println(" ".matches("\\s")); // true

        // \S 非空白
        System.out.println("A".matches("\\S")); // true



        /*
         * 11. 身分證範例
         */

        String id = "A123456789";
        boolean idResult = id.matches("^[A-Z][0-9]{9}$");

        System.out.println(idResult);

    }
}