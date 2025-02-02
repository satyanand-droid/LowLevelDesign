package org.example.abstractfactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void toggle() {
    System.out.println("mac checkbox toggled");
    }
}
