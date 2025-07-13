package com.example.abstractfactory;

/**
 * Classe cliente que utiliza o padrão Abstract Factory.
 */
public class Application {

    public static void main(String[] args) {
        /*
         * O código cliente depende apenas da abstração GUIFactory.
         * O FactoryProvider decide qual implementação concreta entregar.
         */
        GUIFactory factory = FactoryProvider.getFactory();

        // Cria componentes da mesma família
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Usa componentes normalmente
        button.paint();
        checkbox.paint();
    }
} 