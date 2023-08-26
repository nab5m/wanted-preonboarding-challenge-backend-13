package com.wanted.preonboarding.theater.service.handler;

public class Wallet {
    private Long money;
    private final Invitation invitation;
    private Ticket ticket;

    public Wallet(long money){
        this(null, money);
    }
    public Wallet(Invitation invitation, long money){
        this.invitation = invitation;
        this.money = money;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }
    public boolean hasTicket() {
        return ticket != null;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public void minusMoney(long money) {
        this.money -= money;
    }
    public void plusMoney(long money) {
        this.money += money;
    }
}
