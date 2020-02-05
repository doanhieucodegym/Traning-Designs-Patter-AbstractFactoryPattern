package com.AbstractFactoryPattern.AbstractFactory;

import com.AbstractFactoryPattern.Bank.Bank;
import com.AbstractFactoryPattern.Bank.impl.HDFC;
import com.AbstractFactoryPattern.Bank.impl.ICICI;
import com.AbstractFactoryPattern.Bank.impl.SBI;
import com.AbstractFactoryPattern.abstractLoan.Loan;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        return null;

    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
