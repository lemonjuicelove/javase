package com.whut.javase;
/*
使用继承机制来解决代码复用问题
 */
public class ExtendTest01 {
    public static void main(String[] args) {

        Account2 act = new Account2("1111",10000);
        System.out.println(act);

        CreditAccount2 ca = new CreditAccount2("2222",200.0,10);
        System.out.println(ca);

    }
}

// 父类
class Account2{

    private String actno;
    private double balance;

    public Account2(){
    }
    public Account2(String actno, double balance) {
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
        return "Account2{" +
                "actno=" + actno +
                ", balance=" + balance +
                '}';
    }

}

// 子类
class CreditAccount2 extends Account2{

    private double credit;

    public CreditAccount2(){
    }
    public CreditAccount2(String actno,double balance,double credit) {
        // this.actno = actno; 父类私有的属性无法在子类中直接访问
        setActno(actno);
        setBalance(balance);
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
        return "CreditAccount2{" + "actno=" + getActno() + ",balance=" + getBalance() +
                ",credit=" + credit +
                '}';
    }

}