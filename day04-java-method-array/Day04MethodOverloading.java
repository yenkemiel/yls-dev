public class Day04MethodOverloading {

    
    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
        add("Hello", "World");

    }

    // ===========================
    // 方法區
    // ===========================

    // 方法多載 (Method Overloading)
    // 意思: 方法名稱相同，但參數不同
    // 參數個數不同
    // 參數型別不同
    // 參數順序不同（前提：型別不同）

    // 跟「回傳值型別」或「參數名稱」完全無關
    // 回傳型別不同 → 不算多載
    // 參數名稱不同 → 不算多載

    
    // 基礎方法
    public static void method() { }

    // public static int method() { return 1; } 失敗 -> 雖然回傳值不同(int)，但參數個數相同(皆為空)

    public static void method(int a) { } // 參數個數不同 (多了一個 int a)
    // public static void method(int b) { } 失敗 -> 雖然參數名稱改成 b，但型別還是 int。
    public static void method(int a, int b) { } // 參數個數不同 (多了一個 int b)
    public static void method(int a, int b, int c) { } // 參數個數不同 (多了一個 int c)
    // public static void method(int b, int a) { } // 失敗 -> 順序不同成功，但是型別個數相同
    // public static void method(int x, int y) { } // 失敗 -> 參數名稱不同,但型別個數相同

    public static void method(String s) { } // 資料型別不同 (改為 String)

    public static void method(int a, String s) { } // 參數個數不同 (變兩個)

    // 這也算資料型別組合不同的一種
    public static void method(String s, int a) { } // 參數順序不同 (String 在前, int 在後)
    

    // ===========================
    // 例子
    // ===========================
    public static void add(int a, int b) {
        System.out.println("多載方法兩個參數相加結果: " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("多載方法三個參數相加結果: " + (a + b + c));
    }

    public static void add(String a, String b) {
        System.out.println("多載方法字串相加結果: " + (a + b));
    }
}



