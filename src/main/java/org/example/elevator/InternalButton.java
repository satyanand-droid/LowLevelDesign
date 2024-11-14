package org.example.elevator;

public class InternalButton {
    private InternalButtonDispatcher internalButtonDispatcher;
    public void pressButton(){
        internalButtonDispatcher.submit();
    }
}
