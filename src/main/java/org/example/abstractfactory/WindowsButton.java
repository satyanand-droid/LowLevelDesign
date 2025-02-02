package org.example.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("clicked windows button");
    }
}
