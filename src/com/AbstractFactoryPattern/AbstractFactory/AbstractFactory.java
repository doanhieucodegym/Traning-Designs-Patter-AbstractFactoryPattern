package com.AbstractFactoryPattern.AbstractFactory;

import com.AbstractFactoryPattern.Bank.Bank;
import com.AbstractFactoryPattern.abstractLoan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
