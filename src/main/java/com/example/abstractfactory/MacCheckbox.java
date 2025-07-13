package com.example.abstractfactory;

/**
 * Produto concreto: checkbox do Mac
 */
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Você criou uma checkbox do Mac.");
    }
} 