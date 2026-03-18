import java.util.Arrays;
import java.util.Scanner;

/**
 * Day05 Java 筆記 (補充)
 *
 * 主題：
 * 1. 基本型別 vs 參考型別
 * 2. 參數傳遞
 * 3. Arrays 工具類
 */

public class Day05ArrayUtilitiesDemo{

    public static void main(String[] args) {

        // 1. Arrays.toString

        int[] arr = {1,1,2,3,5,8};

        System.out.println("創建陣列: " + Arrays.toString(arr));


        // 2. clone 複製陣列: 使用 clone()

        int[] arr1 = arr.clone();
        // int[] arr1 = arr; // -> 不行, 這只是在Stack複製了arr地址, 若改值arr也會改變

        arr1[0] = 999;

        System.out.println("陣列arr " + Arrays.toString(arr));
        System.out.println("方法clone: " + Arrays.toString(arr1));

        // clone 複製陣列: 手動迴圈複製
        int[] arr2 = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            arr2[i]=arr[i];
        }
        System.out.println("手動clone: " + Arrays.toString(arr2));


        // 3. fill 填滿陣列

        int[] arr3 = new int[5];

        Arrays.fill(arr3, -1);

        System.out.println("fill填滿: " + Arrays.toString(arr3));


        // 4. sort 排序

        int[] arr4 = {50,1,-999,6000,77,3};

        Arrays.sort(arr4);

        System.out.println("sort排序: " + Arrays.toString(arr4));
        System.out.println("最大值 is " + arr4[0]);
        System.out.println("最小值 is " + arr4[arr4.length - 1]);


        // 5. binarySearch 搜尋 -> 只能用在已排序的陣列

        int index = Arrays.binarySearch(arr4, 77);

        System.out.println("二元搜尋index = " + index); //  [-999, 1, 3, 50, 77, 6000]

        // 5.1 搜尋不存在的數值
        System.out.println(Arrays.binarySearch(arr4, 5)); // -4（找不到）

        // 規則: 找不到時 → 回傳 -(插入位置) - 1
        // 回傳負數 = 沒找到
        // 數字大小 = 插入位置的線索
        // 反推公式：插入位置 = -(結果 + 1)

        // 找 5
        System.out.println(Arrays.binarySearch(arr4, 5)); // -4
        // 應插入在 3 和 50 中間 → index = 3
        // → -(3) - 1 = -4

        // 找 2000
        System.out.println(Arrays.binarySearch(arr4, 5)); // -6
        // 應插入在 77 和 6000 中間 → index = 5
        // → -(5) - 1 = -6


        // 6. equals 比較陣列 -> 比較內容, 不是地址

        int[] x = {1,2,3};
        int[] y = x.clone();

        System.out.println("陣列內容是否相同: " + Arrays.equals(x,y)); // true
        System.out.println("陣列地址是否相同:  " + (x == y)); // 比較記憶體地址

        x[0] = 1;
        System.out.println(Arrays.equals(x,y)); // false

        x = y;
        System.out.println(Arrays.equals(x,y)); // true

        x = null;
        y = null;
        System.out.println(Arrays.equals(x, y)); // true -> 兩個皆為 null 視為相等

    }
}