public class Homework01 {
    public static void main(String[] args) {

        // 多态机制 面向接口编程
        InsertDrawable s1 = new ShuBiao();
        Computer c1 = new Computer(s1);
        c1.getInsertDrawable().insert();

        InsertDrawable s2 = new KeyBoard();
        Computer c2 = new Computer(s2);
        c2.getInsertDrawable().insert();

        InsertDrawable s3 = new PingMu();
        Computer c3 = new Computer(s3);
        c3.getInsertDrawable().insert();

        InsertDrawable s4 = new DaYinJi();
        Computer c4 = new Computer(s4);
        c4.getInsertDrawable().insert();

    }
}

class Computer{

    private InsertDrawable insertDrawable;

    public Computer() {
    }
    public Computer(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }
    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

}

interface InsertDrawable{
    void insert();
}

class ShuBiao implements InsertDrawable{
    @Override
    public void insert() {
        System.out.println("插入鼠标");
    }
}
class KeyBoard implements InsertDrawable{
    @Override
    public void insert() {
        System.out.println("插入键盘");
    }
}
class PingMu implements InsertDrawable{
    @Override
    public void insert() {
        System.out.println("连接屏幕");
    }
}
class DaYinJi implements InsertDrawable{
    @Override
    public void insert() {
        System.out.println("虚拟打印机连接成功");
    }
}

