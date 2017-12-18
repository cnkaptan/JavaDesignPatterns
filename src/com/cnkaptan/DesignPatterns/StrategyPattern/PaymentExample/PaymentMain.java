package com.cnkaptan.DesignPatterns.StrategyPattern.PaymentExample;

public class PaymentMain {
    public static void main(String[] args) {
        BasicPrice basicPrice = BasicPrice.getInstance();

        Strategy cash = new Cash();
        Strategy card = new Card();
        Strategy coupon = new Coupon();

        basicPrice.setPrice(20f);
        Payment payment = new Payment(cash);
        String price = new StringBuilder()
                .append("Total cost : $")
                .append(payment.employStrategy(basicPrice.getPrice()))
                .append("c")
                .toString();
        System.out.println(price);
    }
}
