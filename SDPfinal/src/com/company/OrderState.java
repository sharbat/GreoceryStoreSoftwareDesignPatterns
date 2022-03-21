package com.company;

public interface OrderState {
    void changeAddress();
    void payByCard();
    void payByCash();
    void setPickup();
    void changeDelivery();
}
