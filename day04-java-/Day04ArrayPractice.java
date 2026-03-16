public class Day04ArrayPractice {
    public static void main(String[] args) {

        // ================================
        // 課堂練習 1
        // 建立一個陣列存5個整數
        // 計算總和
        // 計算平均
        // ================================

        int[] arr1 = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }

        double avg = sum / (double) arr1.length;

        System.out.println("總和: " + sum);
        System.out.println("平均: " + avg);


        // ================================
        // 課堂練習 2
        // 建立10個整數陣列
        // 找出最大值
        // ================================

        int[] arr2 = {5, 12, 7, 20, 3, 15, 8, 10, 25, 6};

        int max = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }

        System.out.println("最大值: " + max);


        // ================================
        // 課堂練習 3
        // 建立3x3二維陣列
        // 印出矩陣
        // ================================

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}