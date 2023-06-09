public class Dog extends Animal{
    private String breed;

    public Dog(String name, String color, int age, int weight, String breed) {
        super(name, color, age, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
