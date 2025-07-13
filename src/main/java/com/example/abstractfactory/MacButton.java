package com.example.abstractfactory;

/**
 * Produto concreto: botão do Mac
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Você criou um botão do Mac.");
    }
} 