package com.kanak.structuralPatterns.adapterPattern;

import java.io.IOException;

public interface CreditCard {
     void giveBankDetails() throws IOException;
     String getCredeitCard();
}
