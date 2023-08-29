package Entity;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
    }

//@Override       NO HACE FALTA IMPLEMENTAR EL METODO ASI
//       public void animalFeed() {
//        System.out.println("El perro se alimenta de 'Alimento para perros'");
//    }
}
