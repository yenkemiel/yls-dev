public class Day02DataTypeDemo {
    public static void main(String[] args) {
        // 1. 基本資料型別練習
        // 1.1 var
        var myInt = 10; // 編譯器會推斷myInt是int類型
        var myDouble = 3.14; // 編譯器會推斷myDouble是double類型
        var myString = "Hello, World!"; // 編譯器會推斷myString是String類型 
        System.out.println("myInt: " + myInt); // myInt: 10

        // 1.2 數值類型練習
        // 整數類型
        int myInt2 = 20;
        int a = 5;
        int b = 10;
        System.out.println(a + b); //15
        // _ 是數字分隔符，增加可讀性
        int population = 23_500_000;
        System.out.println(population); // 23500000

        // 浮點數類型
        double myDouble2 = 2.718;
        System.out.println("myInt2: " + myInt2); // myInt2

        // 字串類型
        String myString2 = "Java Programming";
        System.out.println("myString2: " + myString2); // myString2: Java Programming
        
        // 布林類型
        boolean myBoolean = true;
        System.out.println("myBoolean: " + myBoolean); // myBoolean: true
        
        // 字元類型
        char myChar = 'A';
        System.out.println("myChar: " + myChar); // myChar: A
        
        // 常數
        final double PI = 3.14159;
        System.out.println("PI: " + PI); // PI: 3.14159

        // 2. 基本資料型別轉換
        // 2.1 小轉大自動轉換
        byte _byte = 123;
        // byte 轉換成 short
        short _short = _byte; 
        System.out.println(_short); // 123
        // short 轉換成 int
        int _int = _short; 
        System.out.println(_int); // 123
        // int 轉換成 long
        long _long = _int;
        System.out.println(_long); // 123
        // long 轉換成 float
        float _float = _long;
        System.out.println(_float); // 123.0
        // float 轉換成 double
        double _double = _float; 
        System.out.println(_double); // 123.0

        //2.2 大轉小需要強制轉換
        double _double1 = 123.489532546;
        System.out.println(_double1); // 123.489532546
        // double 轉換成 float
        // float _float = _double; // 報錯 -> 需要強制轉換
        float _float1 = (float)_double1; // 強制轉換, 但會失真
        System.out.println(_float1); // 123.48953
        // float 轉換成 long
        long _long1 = (long)_float1;
        System.out.println(_long1); // 123 -> 小數點被捨棄
        // long 轉換成 int
        int _int1 = (int)_long1;
        System.out.println(_int1); // 123
        // int 轉換成 short
        short _short1 = (short)_int1;
        System.out.println(_short1); // 123
        // short 轉換成 byte
        byte _byte1 = (byte)_short1;
        System.out.println(_byte1); // 123

        // 3. 進制轉換
        // 3.1 十進制轉成十六進制
        String s16 = Integer.toHexString(10);
        System.out.println(s16); // a (十六進制：0~9, a~f)
        // 3.2 十進制轉成八進制
        String s8 = Integer.toOctalString(16);
        System.out.println(s8); // 20 (2×8 + 0 = 16)
        // 3.3 十進制轉成二進制
        String s2 = Integer.toBinaryString(10);
        System.out.println(s2); // 1010 (8 + 2 = 10)
        // 3.4 十六進制轉成十進制
        int n10 = Integer.parseInt("a", 16);
        System.out.println(n10); // 10
        // 3.5 八進制轉成十進制
        int n8 = Integer.parseInt("10", 8);
        System.out.println(n8); // 8 (1×8 + 0)
        // 3.6 二進制轉成十進制
        int n2 = Integer.parseInt("0101", 2);
        System.out.println(n2); // 5 (4 + 1)

        // 3.7 型別轉換與溢位（Overflow）
        int i = 300;
        byte b2 = (byte)i;
        System.out.println(b2); // b = 44 
        // byte 只有 8 位元，因此只會保留 int 的最後 8 位
        // 300 的二進位：00000001 00101100
        // 截取最後 8 位：        00101100 → 44
        int j = 1024;
        byte c = (byte)j;
        System.out.println(c); // c = 0
        // 1024 的二進位：00000100 00000000
        // 截取最後 8 位：         00000000 → 0

        // 4. 字串與數值轉換
        // 4.1 字串轉數值
        String s = "123";

        byte b3 = Byte.parseByte(s);
        short t = Short.parseShort(s);
        int intValue = Integer.parseInt(s);
        long l = Long.parseLong(s);
        float f = Float.parseFloat(s);
        double d = Double.parseDouble(s);

        System.out.println(b3);      // 123
        System.out.println(t);       // 123
        System.out.println(intValue);// 123
        System.out.println(l);       // 123
        System.out.println(f);       // 123.0
        System.out.println(d);       // 123.0


        // 布林字串轉布林值
        boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool); // true

        // 字串轉字元（Java沒有 parseChar）
        char ch = s.charAt(0);
        System.out.println(ch); // '1'


        // 4.2 數值轉字串
        int value = 100;
        String str1 = String.valueOf(value); // 可以把任何型別轉成字串
        String str2 = Integer.toString(value); // 只能把 int 轉成字串

        System.out.println(str1); // "100"
        System.out.println(str2); // "100"

    }
}
