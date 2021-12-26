package com.whut.javase;
/* 	在恰当的时间使用super(实参);
 *
 * 	注意：在构造方法执行过程中一连串调用了父类的构造方法，父类的构造方法又调用了它的父类的
 * 		 的构造方法，但实际上对象只创建了一个。(虽然可能会调用许多次构造方法，但对象只创建了一个)
 *
 * 	思考："super(实参)"到底是干嘛的
 * 	super(实参)的作用是：初始化当前对象的父类型特征，并不是创建新对象
 *
 * 	super关键字代表什么：super关键字代表的是"当前对象"的那部分父类型特征
 */
public class SuperTest02 {
    public static void main(String[] args) {

        Account c1 = new CreditAccount("111", 100.0, 0.99);
        Account c2 = new Account();
        System.out.println(c1);
        System.out.println(c2);

    }
}

class Account{

    private String actno;
    private double balance;

    public Account(){
    }
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno=" + actno +
                ", balance=" + balance +
                '}';
    }

}


class CreditAccount extends Account{

    private double credit;

    public CreditAccount(){
        // super();	默认会有这样的一行代码
    }
    public CreditAccount(String actno, double balance, double credit) {

		// this.actno = actno;
		// this.balance = balance;
        // 不能这样写，因为父类中私有化的属性在子类中不能直接访问
        // 以上两行代码在恰当的位置，正好可以使用：super(actno, balance);

        // 调用父类的有参构造完成actno和balance属性的初始化
        super(actno, balance);

        // 完成credit属性的初始化
        this.credit = credit;

    }

    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno=" + getActno() +
                ", balance=" + getBalance() +
                ", credit=" + getCredit() +
                '}';
    }

}