public class Cow extends Animal{

    private int weigt;

    public Cow(String name, String color, int age, int weight, int weigt) {
        super(name, color, age, weight);
        this.weigt = weigt;
    }
    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weigt=" + weigt +
                '}';
    }
}

