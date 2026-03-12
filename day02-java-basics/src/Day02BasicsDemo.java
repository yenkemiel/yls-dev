public class Day02BasicsDemo {
    public static void main(String[] args){
        // 1. 註解練習 & 換行練習
        // System.out.println("HelloWorld!");
        /*System.out.print("HelloWorld!");
        System.out.print("HelloWorld!");*/
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");

        // 2. 識別字練習
        // 只能包含英文字母、數字、_和$

        // 2.1 不能以數字開頭
        // int 123abc = 10; // 報錯
        int _123abc = 10;
        System.out.println(_123abc);
        // 2.2 不能使用Java的關鍵字、保留字
        // int class = 10; // 報錯

        // 2.3 大小寫敏感
        // 類別名稱為駝峰命名
        class MyClass {}
        // 變數名稱為小駝峰命名
        int myVariable;
        // 方法名稱為小駝峰命名
        void myMethod() {}
        // 常數名稱為全大寫加底線
        static final int MY_CONSTANT = 100;

        // 3.跳脫字元練習
        // 3.1 倒退字元 \b
        System.out.println("Hello\bWorld!"); // o 會被刪除，顯示為"HellWorld!"
        // 3.2 水平定位 \t
        System.out.println("Hello\tWorld!"); // Hello   World!
        // 3.3 換行 \n
        System.out.println("Hello\nWorld!"); 
        // 3.4 換頁 \f
        System.out.println("Hello\fWorld!");
        // 3.5 回車 \r:把游標拉回行首
        System.out.println("ABCDE\r123"); // 123 會覆蓋掉 ABC，只顯示 123DE
        // 3.6 單引號 \'
        System.out.println('\''); // '
        //3.7 雙引號 \"
        System.out.println("\"Hello World!\""); // "Hello World!"
        // 3.7 反斜線 \\
        System.out.println("This is a backslash: \\"); // This is a backslash: \
        // 3.5 Unicode字元 \u
        System.out.println("\u2665"); // 顯示一個愛心符號   
    }
}
