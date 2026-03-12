import java.util.Scanner; // 建立一個從鍵盤讀取資料的物件

public class Day03ScannerDemo {

    public static void main(String[] args) {

        // 1. 建立 Scanner 物件
        Scanner scn = new Scanner(System.in);

        // 2. 提示使用者輸入
        System.out.println("請輸入消費金額");

        // 3. 讀取整數輸入
        int money = scn.nextInt();

        // 4. 條件判斷
        if (money > 100000) {
            System.out.println("您已成為VIP, 歡迎下次光臨!");
        } else {
            System.out.println("謝謝惠顧!");
        }

        // 5. 關閉 Scanner
        scn.close();
    }
}