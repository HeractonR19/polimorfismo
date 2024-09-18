package aplicacao;

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import calculadora.CalculadoraBase;

public class Main {

    public static void main(String[] args) {
        // Exibindo uma mensagem no console
        System.out.println("Aprendendo polimorfismo");

        // Criando um objeto da classe CalculadoraBase
        CalculadoraBase calc = new CalculadoraBase();

        // Usando o método somar com diferentes parâmetros
        System.out.println(calc.somar(45, 45)); 
        System.out.println(calc.somar(45, 5, 45)); 
        System.out.println(calc.somar(25.5, 25.5)); 
    
        //Implementar a variável meu animal que é do tipo Animal. 
        Animal meuAnimal; 
        
        // Pode-se usar um objeto da classe derivada através de uma referência da super classe. 
        meuAnimal = new Cachorro(); 
        meuAnimal.fazerSom(); 
        
        meuAnimal = new Gato(); 
        meuAnimal.fazerSom(); 
    }
    
    
}
