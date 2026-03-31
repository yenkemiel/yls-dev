// v1 - 2025/03/28

import java.util.Scanner;

class Day07IdValidatorHw_v1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // String s ="L123456789";

        String n1 = s.substring(0, 1); // 第1個字，英文
        int n2 = Integer.parseInt(s.substring(1, 2)); // 第2個字，性別碼

        // 第一關驗證: 總長度是否為10個數字 & 性別碼第二碼是否為 1或2
        if (s.length() == 10 && (n2 == 1 || n2 == 2)) {

            // 擷取第3-10個數字
            int n3 = Integer.parseInt(s.substring(2, 3)); // 第3個字
            int n4 = Integer.parseInt(s.substring(3, 4)); // 第4個字
            int n5 = Integer.parseInt(s.substring(4, 5)); // 第5個字
            int n6 = Integer.parseInt(s.substring(5, 6)); // 第6個字
            int n7 = Integer.parseInt(s.substring(6, 7)); // 第7個字
            int n8 = Integer.parseInt(s.substring(7, 8)); // 第8個字
            int n9 = Integer.parseInt(s.substring(8, 9)); // 第9個字
            int n10 = Integer.parseInt(s.substring(9, 10)); // 第10個字

            // 驗證碼計算
            // 1. 把英文對應成相對數值
            switch (n1) {

                case "A":
                    n1 = "10";
                    break;
                case "B":
                    n1 = "11";
                    break;
                case "C":
                    n1 = "12";
                    break;
                case "D":
                    n1 = "13";
                    break;
                case "E":
                    n1 = "14";
                    break;
                case "F":
                    n1 = "15";
                    break;
                case "G":
                    n1 = "16";
                    break;
                case "H":
                    n1 = "17";
                    break;
                case "I":
                    n1 = "34";
                    break;
                case "J":
                    n1 = "18";
                    break;
                case "K":
                    n1 = "19";
                    break;
                case "M":
                    n1 = "21";
                    break;
                case "N":
                    n1 = "22";
                    break;
                case "O":
                    n1 = "35";
                    break;
                case "P":
                    n1 = "23";
                    break;
                case "Q":
                    n1 = "24";
                    break;
                case "T":
                    n1 = "27";
                    break;
                case "U":
                    n1 = "28";
                    break;
                case "V":
                    n1 = "29";
                    break;
                case "W":
                    n1 = "32";
                    break;
                case "X":
                    n1 = "30";
                    break;
                case "Z":
                    n1 = "33";
                    break;
                default:
                    break;

            }

            // 2. 把對應數值拆成兩個字串, 轉成數字
            int num1 = Integer.parseInt(n1.substring(0, 1)); // 戶籍十位數
            int num2 = Integer.parseInt(n1.substring(1, 2)); // 戶籍個位數

            // 4. 驗證碼公式總和
            int sum = num1 * 1 + num2 * 9 + n2 * 8 + n3 * 7 +
                    n4 * 6 + n5 * 5 + n6 * 4 + n7 * 3 + n8 * 2 + n9 * 1;

            // 5. 算出驗證碼
            int r = sum % 10;
            int result = 10 - r;

            // 第二關驗證: 驗證碼是否等於第十碼
            if (result == n10) {
                System.out.println("驗證成功");
            } else {
                System.out.println("驗證失敗");
            }
        } else if (s.length() != 10) {
            System.out.println("長度必須是十個字");
        } else if (n2 != 1 && n2 != 2) {
            System.out.println("性別不符");
        }
    }
}