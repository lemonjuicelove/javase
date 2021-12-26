public class InterfaceTest05 {
    public static void main(String[] args) {

        // 多态机制
        FoodMenu f1 = new ChineseCooker();
        // c1中的菜单属性就是Cooker类的实例化对象
        Customer c1 = new Customer(f1);
        c1.order();

        // 多态机制
        FoodMenu f2 = new AmericanCooker();
        // c2中的菜单属性就是AmericanCooker类的实例化对象
        Customer c2 = new Customer(f2);
        c2.order();

    }
}

// 接口：菜单
interface FoodMenu{
    void ChaoDan();
    void ZuoTang();
}

// 菜单是接口，每个厨师都可以将菜单上的菜实现
// 中国厨师实现菜单
class ChineseCooker implements FoodMenu{
    @Override
    public void ChaoDan() {
        System.out.println("青椒炒蛋来咯!");
    }

    @Override
    public void ZuoTang() {
        System.out.println("紫菜汤来啦!");
    }
}

// 美国厨师实现菜单
class AmericanCooker implements FoodMenu{
    @Override
    public void ChaoDan() {
        System.out.println("法国煎蛋来了");
    }

    @Override
    public void ZuoTang() {
        System.out.println("三明治汤来咯");
    }
}

/*
 * cat is a animal   凡是满足is a的都可以设置为继承
 * customer has a menu   凡是满足has a的都以属性的形式存在
 */

class Customer{

    //  凡是能使用has a 来描述的，统一以属性的方式存在
    // 实例变量 属性
    private FoodMenu f;

    public Customer() {
    }
    public Customer(FoodMenu f) {
        this.f = f;
    }

    public FoodMenu getF() {
        return f;
    }
    public void setF(FoodMenu f) {
        this.f = f;
    }

    public void order(){
        this.f.ChaoDan();
        this.f.ZuoTang();
    }

}
