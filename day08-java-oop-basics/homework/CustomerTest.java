public class CustomerTest {
    public static void main(String[] args) {

        // 一般顧客，購買限制6個
        // 使用無參數建構式
        Customer c1 = new Customer();
        c1.name = "Emma";
        c1.age = 30;
        c1.purchase("蘋果", 3, 20);

        // 使用有參數建構式
        Customer c2 = new Customer("Tom", 35);
        c2.purchase("Banana", 4, 15);

        // 購買超過數量限制
        c2.purchase("Banana", 7, 15); // 最多只能買6個，請重新輸入
        System.out.println(Customer.limitBuy(5));

        // VIP顧客，折扣7折，購買限制20個
        VIPCustomer v1 = new VIPCustomer();
        v1.name = "Grace";
        v1.purchase("Cherry", 3, 200); // 420
        v1.purchase("Dragon fruit", 21, 70); // 最多只能買20個，請重新輸入
    }

}
