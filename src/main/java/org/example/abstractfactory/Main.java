package org.example.abstractfactory;

public class Main {
    public static void main(String[] args){
        Factory factory =  new MacFactory();
        Button button = factory.createButton();
        CheckBox checkBox =factory.createCheckBox();
        button.click();
        checkBox.toggle();
    }
}
