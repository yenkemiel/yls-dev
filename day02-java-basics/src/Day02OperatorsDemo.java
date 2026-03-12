public class Day02OperatorsDemo {
    public static void main(String[] args) {

        // 1. 一元運算子 (Unary Operator)
        int a = 3;
        System.out.println(a); // 3

        // 1.1 a++ 先賦值，再自增
        int b = a++;
        System.out.println(b); // 3
        System.out.println(a); // 4

        // 1.2 ++a 先自增，再賦值
        int c = ++a;
        System.out.println(c); // 5
        System.out.println(a); // 5

        // 額外例子
        int d = 3;
        System.out.println(d++); // 3，執行後 d = 4
        System.out.println(++d); // 5


        // 2. 二元運算子 (Binary Operators)

        int x = 5;
        int y = 3;

        // 2.1 比較運算子
        System.out.println(x == y); // false  相等
        System.out.println(x != y); // true   不相等
        System.out.println(x > y);  // true   大於
        System.out.println(x >= y); // true   大於或等於
        System.out.println(x < y);  // false  小於
        System.out.println(x <= y); // false  小於或等於


        // 2.2 邏輯運算子
        boolean p = true;
        boolean q = false;

        // AND (且)
        boolean r1 = p & q;
        System.out.println(r1); // false
        // OR (或)
        boolean r2 = p | q;
        System.out.println(r2); // true
        // XOR (互斥或)
        boolean r3 = p ^ q;
        System.out.println(r3); // true
        // NOT (反向)
        boolean r4 = !p;
        System.out.println(r4); // false
        // Short-Circuit OR (短路 OR)
        boolean r5 = p || q;
        System.out.println(r5); // true
        // Short-Circuit AND (短路 AND)
        boolean r6 = p && q;
        System.out.println(r6); // false

        // 3. 三元運算子 (Ternary Operator)
        int a1 = 10;
        int b1 = 5;

        int max = (a1 > b1) ? a1 : b1; // 如果 a > b，結果為 a，否則為 b
        System.out.println(max); // 10

        // 等價的 if-else 寫法
        int max2;

        if (a1 > b1) {
            max2 = a1;
        } else {
            max2 = b1;
        }
        System.out.println(max2); // 10

        // 4. 字串格式化 (printf)

        // 4.1 字串
        // %s : 輸出字串
        System.out.printf("%s", "hello world"); // hello world

        // 4.2 整數格式化
        // %d : 十進位整數
        // %o : 八進位整數
        // %x : 十六進位整數
        // %X : 大寫十六進位整數
        System.out.printf("%d %o %x %X", 10, 10, 10, 10); // 10 12 a A

        // 4.3 浮點數格式化
        // %f : 浮點數
        // %e : 科學記號 (小寫 e)
        // %E : 科學記號 (大寫 E)
        // %.nf : 控制小數點後 n 位
        System.out.printf("%.2f %e %E", 3.1415926, 3.1415926, 3.1415926); // 3.14 3.141593e+00 3.141593E+00
        System.out.printf("%.3f", 3.1415926); // 3.142

        // 綜合格式化輸出
        System.out.printf("%s %d %.2f", "apple", 10, 3.14159); // apple 10 3.14

        // 換行
        // printf 不會自動換行，需要使用 %n
        System.out.printf("%nhello%n");
        System.out.printf("hello%n");

        // 4.4 布林值格式化
        // %b : 輸出布林值
        System.out.printf("%b", true);  // true

        // 4.5 字元格式化
        // %c : 輸出字元
        System.out.printf("%c", 'a');  // a

        // 4.6 寬度與精度格式化
        // %m.nf : m 表示最小寬度，n 表示小數點後位數
        // m = minimum width
        // n = precision
        System.out.printf("%2d %5.2f %s", 10, 3.1415926, "hello"); // 10  3.14 hello


        // 4.7 printf 格式旗標 (Format Flags)
        // + 為正數或負數添加符號
        System.out.printf("%+d%n", 15); // +15
        // - 左對齊
        System.out.printf("%-5d%n", 15); // 15    (左對齊)
        // 0 數字前面補 0
        System.out.printf("%04d%n", 99); // 0099
        // 空格 在正數前加空格
        System.out.printf("% 4d%n", 99); //  99
        // , 數字分組（千分位）
        System.out.printf("%,f%n", 9999.99); // 9,999.990000
        // ( 負數用括號表示
        System.out.printf("%(f%n", -99.99); // (99.990000)
        // # 顯示進制前綴
        System.out.printf("%#x%n", 99); // 0x63
        System.out.printf("%#o%n", 99); // 0143
        // < 使用前一個參數
        System.out.printf("%f 和 %<3.2f%n", 99.45); // 99.450000 和 99.45
        // $ 指定參數索引 -> 可以調整輸出順序
        System.out.printf("%1$d,%2$s%n", 99, "abc"); // 99,abc        
        System.out.printf("%2$s,%1$d%n", 99, "abc"); // abc,99
    }
}