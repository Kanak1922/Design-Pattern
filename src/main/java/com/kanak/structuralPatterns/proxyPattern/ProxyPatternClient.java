package com.kanak.structuralPatterns.proxyPattern;

public class ProxyPatternClient {
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("Kanak Arya");
        access.grantInternetAccess();
    }
}
