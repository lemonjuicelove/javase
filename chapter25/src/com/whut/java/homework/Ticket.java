package com.whut.java.homework;

public class Ticket implements SaleTicket{

    private int ticketNum = 50;

    public Ticket(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public int getTicketNum() {
        return ticketNum;
    }
    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    @Override
    // synchronized用在实例方法上，锁的是this
    public synchronized void saleTicket() {
        if (ticketNum <= 0){
            try {
                throw new TicketNotEnough(Thread.currentThread().getName() + "的票已经卖完了");
            } catch (TicketNotEnough e) {
                System.out.println(e.getMessage());
            }
        }else {
            this.ticketNum -= 1;
            System.out.println(Thread.currentThread().getName() + "售票成功，剩余票数为：" + this.getTicketNum());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
