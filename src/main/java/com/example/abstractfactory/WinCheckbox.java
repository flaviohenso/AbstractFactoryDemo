package com.example.abstractfactory;

/**
 * Produto concreto: checkbox do Windows
 */
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Você criou uma checkbox do Windows.");
    }
} 