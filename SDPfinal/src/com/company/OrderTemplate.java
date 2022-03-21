package com.company;

public abstract class OrderTemplate {
    protected int total;

    private OrderState orderState;
    private OrderState orderByCash;

    public OrderState getOrderByCash() {
        return orderByCash;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public OrderState getOrderByCard() {
        return orderByCard;
    }

    public OrderState getOrderPickUp() {
        return orderPickUp;
    }

    private OrderState orderByCard;
    private OrderState orderPickUp;

    public void changeAddress(){
        orderState.changeAddress();
    }

    public void payByCard(){
        orderState.payByCard();
    }

    public void payByCash(){
        orderState.payByCash();
    }

    public void setPickUp(){
        orderState.setPickup();
    }

    public void changeDelivery(){
        orderState.changeDelivery();
    }

    public OrderTemplate(){
        orderByCash = new OrderByCashState(this);
        orderByCard = new OrderByCardState(this);
        orderPickUp = new OrderPickUpState(this);
    }

    public String getCardnumber() {
        return cardNumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardNumber = cardnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    protected String address;
    protected int delivery;
    protected String cardNumber;
    abstract void setAddress();
    abstract void setDelivery();
    abstract void setPayment();
    final boolean Order(double total, Client client){
        setAddress();
        setDelivery();
        setPayment();
        if (client.getBalance() < total){
            System.out.println(" You can't order this products!");
            return false;
        }else{
            client.setBalance(client.getBalance() - total);
            return true;
        }
    }
}
