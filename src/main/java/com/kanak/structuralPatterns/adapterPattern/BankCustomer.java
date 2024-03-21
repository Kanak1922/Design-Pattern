package com.kanak.structuralPatterns.adapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{
    @Override
    public void giveBankDetails() throws IOException {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the account holder name :");
            String customerName=br.readLine();
            System.out.println();
            System.out.print("Enter Account number : ");
            long accNo=Long.parseLong(br.readLine());
            System.out.println();
            System.out.print("Enter bank name : ");
            String bankName=br.readLine();
            setAccHolderName(customerName);
            setAccNumber(accNo);
            setBankName(bankName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCredeitCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();
        return ("The Account number "+accno+" of "+accholdername+" in "+bname
                + "bank is valid and authenticated for issuing the credit card. ");
    }
}
