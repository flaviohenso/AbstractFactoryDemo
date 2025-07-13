package com.example.abstractfactory;

/**
 * Classe auxiliar responsável por escolher dinamicamente
 * qual fábrica concreta deve ser utilizada com base no SO.
 */
public final class FactoryProvider {
    private FactoryProvider() {
        // Evita instanciação
    }

    public static GUIFactory getFactory() {
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println("Detectado SO: " + os);
        if (os.contains("win")) {
            return new WinFactory();
        }
        return new MacFactory();
    }
} 