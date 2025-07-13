package com.example.abstractfactory;

/**
 * Produto concreto: botão do Windows
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Você criou um botão do Windows.");
    }
} 