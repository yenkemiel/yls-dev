class Customer {
    // 成員變數
    protected String name;
    protected int age;

    // 建構式
    public Customer() {
    }

    // 有參數建構式
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void buy(String food, int count, int uniPrice) {
        int total = uniPrice * count; // 局部變量
        System.out.println(this.name + " 買了 " + count + " 個 " + food + "，共 " + total + " 元");
    }

    // 靜態方法
    public static boolean limitBuy(int count) {
        return count <= 6;
    }

    public void purchase(String food, int count, int price) {
        if (limitBuy(count)) {
            buy(food, count, price);
        } else {
            System.out.println("最多只能買6個，請重新輸入");

        }

    }
}
