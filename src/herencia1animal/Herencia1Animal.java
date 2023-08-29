
package herencia1animal;

import Entity.Animal;
import Entity.Cat;
import Entity.Dog;
import Entity.Horse;

public class Herencia1Animal {

    public static void main(String[] args) {
        
        // Declaración del Objeto Dog:
        
        Animal dog1 = new Dog("Dogui", 200, "Stitch", "Carne", 15, "Doberman");
        //dog1.animalFeed();
        System.out.println(dog1.toString());
        
         // Declaración de otro Objeto Dog:
         
         Animal dog2 = new Dog("Alim", 400, "Teddy", "Croquetas", 10, "Chihuahua");
         //dog2.animalFeed();
         System.out.println(dog2.toString());
         
          // Declaración del Objeto Cat:
          
          Animal cat1 = new Cat("Pelusa", "Galletas", 15, "Siamés");
          //cat1.animalFeed();
          System.out.println(cat1.toString());
          
          // Declaración del Objeto Horse:
          
          Animal horse1 = new Horse("Spark", "Pasto", 25, "Fino");
          //horse1.animalFeed();
          System.out.println(horse1.toString());
    }
    
}

//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.

//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente: