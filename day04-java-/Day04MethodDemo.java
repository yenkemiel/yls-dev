public class Day04MethodDemo {

    public static void main(String[] args) {

        // ================================
        // 1. 方法兩種類型
        // ================================

        // 1.1 輸出型方法
        // 這種方法會在方法內直接使用 System.out.println() 輸出結果
        // 呼叫方法時就會看到輸出

        // public static void printHello(){
        //     System.out.println("Hello");
        // }

        // 呼叫方式
        // printHello();


        // 1.2 回傳型方法
        // 這種方法只會回傳資料，不會自動輸出

        // public static int getNumberExample(){
        //     return 5;
        // }

        // 如果只呼叫方法
        // getNumberExample();
        // 不會有任何輸出，因為只是回傳值

        // 需要用以下方式才能看到結果：

        // 方法1：接住回傳值再輸出
        // int number = getNumberExample();
        // System.out.println(number);

        // 方法2：直接在 println 中呼叫
        // System.out.println(getNumberExample());


        // 補充說明：
        // 有回傳值的方法可以同時使用 println 和 return
        // println：負責輸出
        // return：負責把值回傳給呼叫者
        // 但只要方法宣告了回傳型別，就一定要 return 對應型別的值



        // ========================================== 
        // 方法呼叫與回傳值
        // ==========================================

        // 2.1 呼叫方法
        Day04MethodDemo.sayHello(); // 使用類別名稱呼叫
        sayHello();                 // 同一個 class 可以直接呼叫

        // void 方法不能接變數
        // int x = sayHello();  ❌ 錯誤，因為 sayHello() 沒有回傳值


        // 2. 有回傳值的方法
        // 2.2 回傳 int
        int number = getNumber();
        System.out.println(number);

        System.out.println(getNumber());

        // 說明：
        // getNumber() 會 return 1
        // 但 return 只是把值交回 main()
        // 如果沒有接住或輸出，畫面不會顯示任何東西
        getNumber(); // 不會輸出，因為沒有使用回傳值

        // 如果要看到結果，需要：
        // 1) 接住回傳值
        int value = getNumber();
        // 2) 或直接輸出
        System.out.println(value);
        // 3) 或直接在 println 裡呼叫
        System.out.println(getNumber());

        // 2.3 double
        double decimal = getDecimal();
        System.out.println(decimal);

        // 2.4 String
        String message = getMessage();
        System.out.println(message);

        // 2.5 方法帶參數
        printMessage("Hi");

        // 2.6 傳入陣列參數
        String[] names = {"Jack", "David"};
        printNames(names);

        // 直接建立陣列
        printNames(new String[]{"Peter", "Amy"});


        // 2.7 計算方法
        add(5, 4);


        // 2.8 方法回傳值
        int sum = addReturn(3, 7);
        System.out.println("sum = " + sum);

        // 2.2 補充: 小轉大 方法回傳值範例

        // 方法回傳 int → 用 double 接收 (小轉大，自動轉型)
        double bigType = getNumber();

        System.out.println(bigType); 
        // getNumber() 回傳 int
        // double 可以容納 int
        // Java 會自動轉型


        // 2.3 補充: 大轉小 方法回傳值範例
        // 方法回傳 double → 用 int 接收 (大轉小，強制轉型)
        int smallType = (int) getDecimal();

        System.out.println(smallType);
        // getDecimal() 回傳 double
        // int 容量較小
        // 必須使用 (int) 強制轉型
    }


    // ========================================== 
    // 方法區
    // ==========================================
        
    // 2.1 無回傳值的方法 (void)
    public static void sayHello() {
        System.out.println("Hi");
    }

    // 2.2 回傳 int
    public static int getNumber() {
        return 1;
    }

    // 2.3 回傳 double
    public static double getDecimal() {
        return 1.3;
    }

    // 2.4 回傳 String
    public static String getMessage() {
        return "Bonjour";
    }

    // 2.5 方法帶參數
    public static void printMessage(String message) {
        System.out.println("Say " + message);
    }

    // 2.6 陣列當參數
    public static void printNames(String[] names) {
        System.out.println("Name1: " + names[0]);
        System.out.println("Name2: " + names[1]);
    }

    // 2.7 計算方法（無回傳）
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    // 2.8 計算方法（有回傳）
    public static int addReturn(int a, int b) {
        return a + b;
    }

}