public class Day04ArrayDemo {
    public static void main(String[] args) {

        // 1. 為什麼需要陣列 (Array)

        // 沒有使用陣列
        int score1 = 80;
        int score2 = 90;
        int score3 = 70;
        int score4 = 85;
        int score5 = 88;

        // 使用陣列
        int[] scores = {80, 90, 70, 85, 88};

        // 2. Array 基本特性
        // 2.1 儲存相同型別資料
        // 2.2 使用 index 存取
        // 2.3 index 從 0 開始
        // 2.4 陣列大小建立後固定

        // Index : 0 1 2 3 4
        // Value : 80 90 70 85 88

        // 3. 一維陣列 (1D Array)

        // 最常見的陣列形式
        // 可以看成一排資料
        // 例如：學生分數列表



        // 4. 陣列宣告 (Declaration)
        //int[] arr;
        //int arr2[];
        double[] price;
        String[] names;

        // 建議寫法
        // int[] arr;
        // 因為型別清楚表示為 int[]



        // 5. 建立陣列 (Create Array)

        int[] arr = new int[3];

        // 陣列 index 從 0 開始
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 100;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        // 6. 初始化陣列 (Array Initializer)

        // 方法1
        int[] arr1 = {5, 3, 8, 1};

        // 方法2
        int[] arr2 = new int[]{5, 3, 8, 1};


        // 7. 建立後預設值

        // int -> 0
        // double -> 0.0
        // boolean -> false
        // String -> null


        // 8. 存取與修改陣列
        int[] arr3 = {5, 3, 8, 1};

        // 讀取資料
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);

        // 修改資料
        arr3[0] = 100;


        // 9. 取得陣列長度

        System.out.println(arr3.length);


        // 10. 使用 for 讀取陣列

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }


        // 11. for-each 讀取陣列

        for (int value : arr3) {
            System.out.println(value);
        }


        // 12. 常見應用

        // 計算總和
        int sum = 0;

        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }

        // 計算平均
        double avg = sum / (double) arr3.length;

        // 找最大值
        int max = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
            }
        }

// 13. Arrays.toString() 可以把陣列轉成字串方便輸出
// 如果直接印陣列會出現記憶體位置

int[] arrPrint = {1, 2, 3, 4, 5};

// 錯誤示範 (只會印出記憶體位置)
//System.out.println(arrPrint);

// 正確示範
// 需要 import java.util.Arrays;
//System.out.println(java.util.Arrays.toString(arrPrint));

// 輸出結果
// [1, 2, 3, 4, 5]

    }
}