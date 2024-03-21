package com.kanak.structuralPatterns.adapterPattern;

import java.io.IOException;

public class AdapterPatternDemo {
    public static void main(String[] args) throws IOException {
        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCredeitCard());
    }
}
