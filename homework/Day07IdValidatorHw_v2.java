// v2 - 2025/03/30
// 優化內容：加強驗證、修正驗證碼bug

import java.util.Scanner;

class Day07IdValidatorHw_v2{
    public static void main(String[] args){  
        
        // 輸入身分證字號
        System.out.println("請輸入身分證字號：");        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();
    
        // String s ="A123456789"; // 測試用
        
        // 限制檢查
        // 1. 檢查空白字元
        if(s.isEmpty()){
            System.out.println("請輸入字元");
            return;
        }

        // 2. 檢查總長度
        if(s.length() != 10){
            System.out.println("輸入長度必須為10個字");
            return;
        }

        // 3. 檢查第一碼是否為英文字母
        if(!Character.isLetter(s.charAt(0))){
            System.out.println("第一碼請輸入英文字母");
            return;
        }

        // 4. 檢查性別碼是否為1或2
        if(s.charAt(1) != '1' && s.charAt(1) != '2'){
            System.out.println("第二碼性別碼是必須是1或2");
            return;
        }

        // 5. 檢查第3～10碼是否為數字
        for(int i = 2; i < 10; i++){
            if(!Character.isDigit(s.charAt(i))){
                System.out.println("第" + (i+1) + "碼必須是數字");
            return;
            }  
        }


        // 擷取每個字元
        String n1 = s.substring(0,1); // 第1個字，英文
        int n2 = Integer.parseInt(s.substring(1,2)); // 第2個字，性別碼
        // 擷取第3-10個數字
        int n3 = Integer.parseInt(s.substring(2, 3)); // 第3個字
        int n4 = Integer.parseInt(s.substring(3, 4)); // 第4個字
        int n5 = Integer.parseInt(s.substring(4, 5)); // 第5個字
        int n6 = Integer.parseInt(s.substring(5, 6)); // 第6個字
        int n7 = Integer.parseInt(s.substring(6, 7)); // 第7個字
        int n8 = Integer.parseInt(s.substring(7, 8)); // 第8個字
        int n9 = Integer.parseInt(s.substring(8, 9)); // 第9個字
        int n10 = Integer.parseInt(s.substring(9, 10)); // 第10個字

        // 把第一碼字母對應成相對數值
        String letter = switch (n1) {
            case "A" -> "10";
            case "B" -> "11";
            case "C" -> "12";
            case "D" -> "13";
            case "E" -> "14";
            case "F" -> "15";
            case "G" -> "16";
            case "H" -> "17";
            case "I" -> "34";
            case "J" -> "18";
            case "K" -> "19";
            case "L" -> "20";
            case "M" -> "21";
            case "N" -> "22";
            case "O" -> "35";
            case "P" -> "23";
            case "Q" -> "24";
            case "R" -> "25";
            case "S" -> "26";
            case "T" -> "27";
            case "U" -> "28";
            case "V" -> "29";
            case "W" -> "32";
            case "X" -> "30";
            case "Y" -> "31";
            case "Z" -> "33";
            default -> "-1";   
        };

        // 把對應數值拆成兩個字串, 轉成數字
        int num1 = Integer.parseInt(letter.substring(0,1));// 戶籍十位數
        int num2 = Integer.parseInt(letter.substring(1,2)); // 戶籍個位數

        // 驗證碼計算
        // 驗證碼公式總和 
        int sum = num1 * 1 + num2 * 9 + n2 * 8 + n3 * 7 + 
                    n4 * 6 + n5 * 5 + n6 * 4 + n7 * 3 + n8 * 2 + n9 * 1;
        
        // 算出驗證碼
        int result = (10 - (sum % 10)) % 10;

        // 驗證碼是否等於第十碼
        if(result == n10){
            System.out.println("身分證輸入成功!");
        }else{
            System.out.println("驗證失敗請重新輸入");
        }
    }
}