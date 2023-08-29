
package Entity;

public class Animal {
    
    protected String name;
    protected String food;
    protected Integer age;
    protected String breed; //raza

    public Animal() {
    }

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
 
    // public o protected? Lo habitual es que los metodos sean PUBLIC
    
    public String animalFeed() {
        return " se alimenta de " + food; // El 'this' aqui no hace falta
    }

    @Override
    public String toString() {
        return " { El animal "+ name + animalFeed() + ",  su edad es: " + age + ", su raza es: " + breed + '}';
    }
    
}

//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente: