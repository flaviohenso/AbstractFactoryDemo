package com.example.abstractfactory;

/**
 * Fábrica concreta que cria componentes na família Mac.
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
} 