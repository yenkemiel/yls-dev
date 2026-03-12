public class Day02ControlFlowDemo {

    public static void main(String[] args) {

        // 1. 條件判斷 (if / else) - 奇偶數判斷
        var input = 10;
        var remainder = input % 2;

        if (remainder == 1) { // 餘數為 1 表示奇數
            System.out.printf("%d 是奇數%n", input); 
        } else {
            System.out.printf("%d 是偶數%n", input); // 10 是偶數
        }


        // 2. 命令列參數 (Command-line arguments)
        if (args.length > 0) { // args: 程式執行時輸入的參數

            for (int x = 0; x < args.length; x++) { // 從第 0 個參數一直到最後一個參數逐一印出
                System.out.printf("args[%d] is %s%n", x, args[x]);
            }

        } else {

            System.out.println("沒有輸入參數");

        }

        // 2.1 執行範例
        // 2.1.1 情況 1：沒有參數
        // Bash: java Day02ControlFlowDemo
        // 輸出：沒有輸入參數

        // 2.1.2 情況 2：有參數
        // java Day02ControlFlowDemo apple banana
        // 輸出：args[0] is apple
        //       args[1] is banana

    }
}