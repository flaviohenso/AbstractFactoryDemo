package com.example.abstractfactory;

/**
 * Fábrica concreta que cria componentes na família Windows.
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
} 