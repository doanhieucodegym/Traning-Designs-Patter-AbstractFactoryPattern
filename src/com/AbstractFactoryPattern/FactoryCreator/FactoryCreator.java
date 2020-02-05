package com.AbstractFactoryPattern.FactoryCreator;

import com.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.AbstractFactoryPattern.AbstractFactory.BankFactory;
import com.AbstractFactoryPattern.AbstractFactory.LoanFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
