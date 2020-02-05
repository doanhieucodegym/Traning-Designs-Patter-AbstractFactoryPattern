package com.AbstractFactoryPattern.Bank.impl;

import com.AbstractFactoryPattern.Bank.Bank;

public class HDFC implements Bank {
        private final String BNAME;

    public HDFC() {
        BNAME = "HD BNAME";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
