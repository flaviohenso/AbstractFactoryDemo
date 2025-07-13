# Exemplo de Padrão de Projeto: Abstract Factory em Java 21

## Visão geral
O *Abstract Factory* é um padrão criacional que fornece uma interface para criar **famílias de objetos relacionados** sem especificar suas classes concretas. Ele promove o **princípio da Inversão de Dependência** e o **princípio Aberto-Fechado**, permitindo trocar facilmente o conjunto inteiro de produtos em tempo de execução.

Neste projeto, temos duas famílias de componentes gráficos (GUI): `Windows` e `Mac`. A aplicação é capaz de decidir, em tempo de execução, qual fábrica concreta utilizar com base no sistema operativo.

```
           +-----------------+        +------------------+
           |  Application    |------->|  GUIFactory      |<---+
           +-----------------+        +------------------+    |
                    ^                           ^             |
                    |                           |             |
          +---------+-----------+   +----------+---------+    |
          | FactoryProvider    |   | Concrete Factories |    |
          +--------------------+   | WinFactory /       |    |
                                    | MacFactory         |    |
                                    +--------------------+    |
                    ^                           ^             |
                    |                           +-------------+
       +------------+----+             +------------------+
       | Produtos (Button| Checkbox)   | Produtos (Button| Checkbox)
       |   Windows       |             |      Mac        |
       +-----------------+             +-----------------+
```

## Estrutura de diretórios
```
AbstractFactoryDemo
 ├── pom.xml
 └── src
     └── main
         └── java
             └── com
                 └── example
                     └── abstractfactory
                         ├── Application.java
                         ├── FactoryProvider.java
                         ├── GUIFactory.java
                         ├── Button.java
                         ├── Checkbox.java
                         ├── WinFactory.java
                         ├── MacFactory.java
                         ├── WinButton.java
                         ├── WinCheckbox.java
                         ├── MacButton.java
                         └── MacCheckbox.java
```

## Como compilar e executar
1. Certifique-se de ter **Java 21** e **Maven 3.9+** instalados.
2. No terminal, navegue até o diretório do projeto:
   ```bash
   cd /home/flavio/Projetos/AbstractFactoryDemo
   ```
3. Compile e execute:
   ```bash
   mvn clean package
   java -jar target/abstract-factory-demo-1.0-SNAPSHOT.jar
   ```

A saída será algo como:
```
Detectado SO: linux
Você criou um botão do Mac.
Você criou uma checkbox do Mac.
```

## Pontos-chave do código
* **`GUIFactory`** – Interface *Abstract Factory*.
* **`WinFactory` / `MacFactory`** – Fábricas concretas que produzem componentes da sua respectiva família.
* **`Button` e `Checkbox`** – Produtos abstratos.
* **`WinButton`, `MacButton`, `WinCheckbox`, `MacCheckbox`** – Produtos concretos.
* **`FactoryProvider`** – Classe auxiliar que escolhe a fábrica apropriada.
* **`Application`** – Cliente que usa somente a abstração `GUIFactory` sem conhecer implementações concretas.

## Vantagens do Abstract Factory
* **Isolamento de concretizações**: o código cliente permanece independente das classes concretas.
* **Consistência de produtos**: garante que todos os objetos criados pertencem à mesma família.
* **Facilidade de extensão**: adicionar uma nova família de produtos requer apenas criar uma nova fábrica concreta.

## Execução em diferentes sistemas operacionais
Mude a propriedade `os.name` para simular:
```bash
java -Dos.name="Windows 11" -jar target/abstract-factory-demo-1.0-SNAPSHOT.jar
```

---
Desenvolvido como parte de estudos do padrão Abstract Factory. 
