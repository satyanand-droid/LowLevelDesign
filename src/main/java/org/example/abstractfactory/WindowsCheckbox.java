package org.example.abstractfactory;

public class WindowsCheckbox implements  CheckBox{
    @Override
    public void toggle() {
    System.out.println("toggled windows checkbox");
    }
}
