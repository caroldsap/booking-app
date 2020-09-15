package com.booking.mgmt.model;

public enum PaymentType {
    COD(1,"Cash On Delivery"),ONLINE(2,"Online Payment");
    String paymentTypeStr;
    int paymentType;
    PaymentType(int paymentType,String paymentTypeStr) {
        this.paymentType = paymentType;
        this.paymentTypeStr = paymentTypeStr;
    }



    public static PaymentType byPaymentType(int paymentType) {
        PaymentType returnValue = null;
        for (PaymentType m : PaymentType.values()) {
            if (m.paymentType==paymentType) {
                returnValue = m;
            }
        }

        return returnValue;
    }
}
