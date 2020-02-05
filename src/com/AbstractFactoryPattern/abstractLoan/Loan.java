package com.AbstractFactoryPattern.abstractLoan;

public  abstract class Loan {
    protected double rate;

   public abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /*
         * t�nh to�n kho?n thanh to�n ti?n vay h�ng th�ng
         *
         * rate = (l�i su?t n?m / 12) * 100;
         * n = s? l?n tr? g�p h�ng th�ng;
         * 1year = 12 months,
         * n = years * 12;
         */

        double EMI;
        int n;

        n = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1))
                * loanAmount;

        System.out.println("EMI hang thang cua ba la: " + EMI +
                " cho so luong " + loanAmount + " ban da vay.");
    }
}
