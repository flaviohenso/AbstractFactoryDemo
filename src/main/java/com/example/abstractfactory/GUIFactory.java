package com.example.abstractfactory;

/**
 * Abstract Factory
 * <p>
 * Declara métodos para criação de cada tipo de produto
 * pertencente a uma mesma família de objetos.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
} 