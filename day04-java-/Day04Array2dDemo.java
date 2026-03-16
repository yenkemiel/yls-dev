public class Day04Array2dDemo {

    public static void main(String[] args) {

        // ================================
        // 1. 二維陣列 (2D Array)
        // ================================

        // 1.1 宣告
        int[][] matrix;

        // 1.2 建立 (2列3欄)
        matrix = new int[2][3];

        // 1.3 初始化
        int[][] matrix2 = {
                {1, 2, 3},
                {5, 6, 7}
        };


        // ================================
        // 2. 二維陣列逐步設定值
        // ================================

        int[][] matrix3;

        // 2.1 建立第一層
        matrix3 = new int[2][];

        // 2.2 建立第二層
        matrix3[0] = new int[3];
        matrix3[1] = new int[3];

        // 2.3 設定值
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[0][2] = 3;

        matrix3[1][0] = 5;
        matrix3[1][1] = 6;
        matrix3[1][2] = 7;


        // ================================
        // 3. String 陣列範例
        // ================================

        // 3.1 一維陣列
        String[] array1;
        String[] array2 = new String[5];
        String[] array3 = new String[]{"1", "2", "3", "4", "5"};
        String[] array4 = {"1", "2", "3", "4", "5"};

        // 3.2 二維陣列
        String[][] array2D;

        String[][] array2D1 = new String[2][3];

        String[][] array2D2 = new String[][]{
                {"1", "2"},
                {"3", "4", "5"}
        };

        String[][] array2D3 = {
                {"1", "2"},
                {"3", "4", "5"}
        };

        // 3.3 不規則建立
        String[][] array2D4 = new String[2][];
        array2D4[0] = new String[2];
        array2D4[1] = new String[3];


        // ================================
        // 4. 二維陣列示意 (row / column)
        // ================================

        //      col0 col1 col2
        // row0   1    2    3
        // row1   4    5    6
        // row2   7    8    9


        // ================================
        // 5. 宣告與建立二維陣列
        // ================================

        int[][] matrixA = new int[3][3];


        // ================================
        // 6. 初始化二維陣列
        // ================================

        int[][] matrixB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // ================================
        // 7. 存取元素
        // ================================

        System.out.println(matrixB[0][0]); // 1
        System.out.println(matrixB[1][2]); // 6


        // ================================
        // 8. 巢狀迴圈讀取 (Nested Loop)
        // ================================

        for (int i = 0; i < matrixB.length; i++) {

            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }

            System.out.println();
        }


        // ================================
        // 9. for-each 讀取二維陣列
        // ================================

        for (int[] row : matrixB) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }


        // ================================
        // 10. 不規則陣列 (Jagged Array)
        // ================================

        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];


        // ================================
        // 11. 常見錯誤
        // ================================

        int[] arrError = new int[3];

        // index 只有 0,1,2
        // arrError[3] 會超出範圍

        // arrError[3] = 10;
        // ArrayIndexOutOfBoundsException


        // ================================
        // 12. 補充：2D Array 本質
        // ================================

        // Java 的二維陣列其實是：
        // 「陣列裡面放陣列」

        // matrixB
        // ↓
        // [ reference ][ reference ][ reference ]
        //      ↓             ↓             ↓
        //    [1,2,3]       [4,5,6]       [7,8,9]

    }
}