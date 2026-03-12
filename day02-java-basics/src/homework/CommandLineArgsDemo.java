package homework;

public class CommandLineArgsDemo {
    public static void main(String[] args) {

        // 1. 只讀取第一個參數
        if(args.length > 0){

            System.out.println(args[0]);

        }else{

            System.out.println("沒有輸入參數");
        }
        // Bash: java homework.CommandLineArgsDemo apple
        // 輸出：apple
        // Bash: java homework.CommandLineArgsDemo
        // 輸出：沒有輸入參數


        // 2. 使用 for 迴圈列出所有命令列參數
        if (args.length > 0) {

            for (int x = 0; x < args.length; x++) {
                System.out.printf("args[%d] is %s%n", x, args[x]);
                System.out.println( x + " is " + args[x]);
            }

        } else {

            System.out.println("沒有輸入參數");

        }

        // 2.1.沒有參數
        // Bash: java homework.CommandLineArgsDemo
        // 輸出：沒有輸入參數

        // 2.2有參數
        // java homework.CommandLineArgsDemo apple banana cat dog
        // 輸出：args[0] is apple
        //       args[1] is banana
        //       args[2] is cat
        //       args[3] is dog
    }
}
