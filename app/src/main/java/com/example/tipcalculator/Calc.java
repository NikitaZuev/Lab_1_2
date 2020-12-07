package com.example.tipcalculator;

public class Calc {
    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых

    public static double calculateTip(double billAmount, double percent) { return
            billAmount*percent; }
    public static double calculateTotal(double billAmount, double percent) { return
            billAmount*(1+percent);}
    // Getter and setter:
    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }
    public double getPercent() { return percent; }
    public void setPercent(double percent) { this.percent = percent; }
    private Calc tipCalc = new Calc();
}
