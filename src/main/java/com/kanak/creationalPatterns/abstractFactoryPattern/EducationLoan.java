package com.kanak.creationalPatterns.abstractFactoryPattern;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate=r;
    }
}
