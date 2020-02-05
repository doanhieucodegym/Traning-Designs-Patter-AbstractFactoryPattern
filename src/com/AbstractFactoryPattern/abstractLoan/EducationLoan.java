package com.AbstractFactoryPattern.abstractLoan;

public class EducationLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate =r ;
    }
}
