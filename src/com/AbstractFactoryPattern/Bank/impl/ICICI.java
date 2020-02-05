package com.AbstractFactoryPattern.Bank.impl;

import com.AbstractFactoryPattern.Bank.Bank;

public class ICICI implements Bank {
    private final String BNAME;

    ICICI() {
        BNAME = "ICICI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
