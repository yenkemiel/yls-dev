
public class Day04ArrayHw{

    public static void main(String[] args){

        // 1. 建立一個陣列存10個整數
        int [] arr ={2,5,6,10,5,9,8,15,21,4};

        for(int i = 0; i < arr.length ; i++){

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 2. 計算總和
        int sum = 0;

        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
        }

        System.out.println("sum is " + sum );


        // 3. 計算平均
        double avg = (double)sum/arr.length;

        System.out.println("average is " + avg);
 

        // 4. 找出最大值
        int max = arr[0];

        for(int i =1; i <arr.length; i++){

            if (arr[i] > max) {
                
                max = arr[i];
            }
        }
             System.out.println("max is " + max);
    }
}


