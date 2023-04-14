public class Cat extends Animal{

    private int age;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color, int age, int weight, int age1) {
        super(name, color, age, weight);
        this.age = age1;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}







