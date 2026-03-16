// 1. package 說明
// 1.1 package 是將程式依資料夾分層管理
// 1.2 package 名稱通常會對應資料夾結構

package test;  // 1.3 宣告此 class 屬於 test 套件
import test.tools.Math;

public class Day04PackageDemo {

    public static void main(String[] args) {

        System.out.println("Hello");

        // 4. 呼叫其他 package 的 class
        // 4.1 呼叫方法時需使用 包名.類別名.方法名
        // 例如：
        test.tools.Math.pi();

        // 4.2 也可以使用 import 簡化
        //import test.tools.Math;
        Math.pi();
    }
}

// 2. 編譯指令
// 2.1 javac Day04PackageDemo.java
// 2.2 若使用 package，建議使用
//     javac -d . Day04PackageDemo.java
//     -d . 代表依照 package 自動建立資料夾
// 2.3 也可以同時編譯多個檔案
//     javac -d . Hello.java Math.java

// 3. 執行指令
// 3.1 java test.Day04PackageDemo
// 3.2 格式：java package.class

// 4. 若執行位置與 class 不同，可使用 classpath
// 4.1 java -cp 路徑 package.class
// 例如：
//     java -cp d:\ lin.Hello


