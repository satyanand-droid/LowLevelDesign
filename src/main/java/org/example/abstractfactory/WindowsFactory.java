package org.example.abstractfactory;

public class WindowsFactory implements Factory{
    @Override
    public Button createButton() {
    return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
    return new WindowsCheckbox();
    }
}
