package com.AbstractFactoryPattern.Main;

import com.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.AbstractFactoryPattern.Bank.Bank;
import com.AbstractFactoryPattern.FactoryCreator.FactoryCreator;
import com.AbstractFactoryPattern.abstractLoan.Loan;

import java.io.IOException;
import java.util.Scanner;

public class AbstractFactoryPatternExample {
    public static void main(String args[]) throws IOException {

        Scanner sc =new Scanner(System.in);

        System.out.print("Nhap ten cua Bank ma ban muon vay tien: ");
        String bankName = sc.nextLine();

        System.out.print("Nhap kieu ban muon vay (home, business, education): ");
        String loanName = sc.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("Nhap lai suat ngan hang " + b.getBankName() + ": ");
        double rate = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so tien ban muon vay: ");
        double loanAmount = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so nam de thanh toan toan bo so tien ban vay: ");
        int years = Integer.parseInt(sc.nextLine());

        System.out.println("Ban dang vay tien tu " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
