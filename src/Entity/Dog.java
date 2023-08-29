package Entity;

public class Dog extends Animal {

    private String marcaAlimento;
    private Integer gramosPorPorcion;

    public Dog() {
    }

    public Dog(String marcaAlimento, Integer gramosPorPorcion, String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
        this.marcaAlimento = marcaAlimento;
        this.gramosPorPorcion = gramosPorPorcion;
    }

    //NO HACE FALTA IMPLEMENTAR EL METODO ASI
    @Override
    public String animalFeed() {

        return super.animalFeed() + " de la marca " + marcaAlimento + " y come " + gramosPorPorcion + " gramos de comida";

    }

}
