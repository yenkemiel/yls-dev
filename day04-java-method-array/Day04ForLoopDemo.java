// ForLoopDemo.java 

// 1. for 迴圈 (為何要使用迴圈？)
// 當需要重複執行某段程式時，可以使用迴圈
// 例如：印出 1~10，如果不用迴圈就要寫很多次 println
// 使用迴圈可以讓程式更簡潔

public class Day04ForLoopDemo {

    public static void main(String[] args) {

        // 2. for 迴圈基本語法
        // for(初始化; 條件判斷; 更新運算)
        // {
        //     要重複執行的程式
        // }

        // 2.1 初始化 (initialization)
        // 宣告並設定迴圈變數初始值
        // 例：int i = 1

        // 2.2 條件判斷 (condition)
        // 必須是 boolean 結果
        // 如果為 true → 繼續迴圈
        // 如果為 false → 結束迴圈
        // 例：i <= 10

        // 2.3 更新運算 (update)
        // 每次迴圈執行後更新變數
        // 例：i++

        for (int i = 1; i <= 10; i++) {

            // 3. 迴圈執行內容
            // 每次迴圈會印出 i 的值

            System.out.println(i);
        }

        // 4. 執行流程
        // 4.1 i = 1
        // 4.2 判斷 i <= 10 → true
        // 4.3 執行 println
        // 4.4 i++
        // 4.5 重複直到 i > 10 結束

        // 5. for 迴圈三個部分
        // 初始化 → 條件判斷 → 更新

	// =========
	// 變化題
	// =========

        // 6. 使用 for 迴圈計算 1+2+...+10
        // 6.1 需要一個累加變數 (sum)
        // 6.2 每次迴圈把 i 加到 sum

        int sum = 0; // 累加器

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        // 6.3 印出加總結果
        System.out.println("1+2+...+10 = " + sum);

	// 7. 只列出奇數
        // 7.1 奇數的特徵：除以 2 的餘數為 1
        // 7.2 i % 2 == 1 代表奇數

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1) {
                System.out.println("奇數: " + i);
            }

        }


        // 8. 只列出偶數
        // 8.1 偶數的特徵：除以 2 的餘數為 0
        // 8.2 i % 2 == 0 代表偶數

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("偶數: " + i);
            }

        }

	// 9. 使用 for 迴圈直接列出奇數或偶數（另一種寫法）
// 9.1 可以透過改變更新運算的數值來控制遞增間隔
// 9.2 i += 2 代表每次增加 2
// 9.3 這樣可以避免使用 if 判斷，效率較好

// 列出奇數
for (int i = 1; i <= 10; i += 2) {
    System.out.println("奇數: " + i);
}

// 列出偶數
for (int i = 2; i <= 10; i += 2) {
    System.out.println("偶數: " + i);
}


    }
}