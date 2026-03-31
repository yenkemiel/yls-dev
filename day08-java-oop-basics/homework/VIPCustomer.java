public class VIPCustomer extends Customer {
    // 呼叫父類別建構式
    public VIPCustomer() {
    }

    public VIPCustomer(String name, int age) {
        super(name, age);
    }

    @Override
    public void buy(String food, int count, int uniPrice) {
        int total = (int) (uniPrice * count * 0.7); // 局部變量
        System.out.println("VIP顧客: " + this.name + " 買了 " + count + " 個 " + food + "，折扣後共 " + total + " 元");
    }

    // 靜態方法
    public static boolean vipLimitBuy(int count) {
        return count <= 20;
    }

    public void purchase(String food, int count, int price) {
        if (vipLimitBuy(count)) {
            buy(food, count, price);
        } else {
            System.out.println("最多只能買20個，請重新輸入");

        }

    }
}
