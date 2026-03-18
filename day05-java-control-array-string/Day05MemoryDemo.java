import java.util.Arrays;

/**
 * Day05 - 記憶體觀念筆記
 * 主題：基本型別 vs 參考型別（傳值 vs 傳址）
 */
public class Day05MemoryDemo {

    public static void main(String[] args) {

        // 1. 基本型別 (Primitive)

        int num = 10;

        System.out.println("呼叫方法前 num = " + num);
        // num = 20;    // 直接賦值值會變-> 在原本的 Stack 格子裡更換數字
        changePrimitive(num); // 呼叫方法-> 在新的 Stack 格子裡存入副本

        System.out.println("呼叫方法後 num = " + num);
        // 不會改變（因為是傳值）


        // 2. 參考型別 (Reference)

        int[] array = {1, 2, 3, 4};

        System.out.println("呼叫方法前 array = " + Arrays.toString(array));
        System.out.println("記憶體地址: " + array); // Heap 的地址

        changeArray(array); // 呼叫方法-> 雖然開了新格子，但裡面存的是同一個地址副本

        System.out.println("呼叫方法後 array = " + Arrays.toString(array));
        // 會被改變（因為傳過去的是地址複本，兩者操作的是 Heap 裡同一個實體記憶體）


    }



    // 基本型別：傳值 (Pass by Value)
    // 比喻：影印文件 → 改影本不影響正本
    public static void changePrimitive(int num) {
        num = 20;
        System.out.println("方法內 num = " + num);
    }

    // 參考型別：傳址 (傳的是位址)
    // 比喻：給 Google Doc 連結 → 改內容大家都看到
    public static void changeArray(int[] arr) {
        arr[2] = 5;

        System.out.println("方法內地址: " + arr);
        System.out.println("方法內內容: " + Arrays.toString(arr));
    }

}