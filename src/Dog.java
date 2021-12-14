public class Dog {
    private String name;
    private float weight;

    public Dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void printIt() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 25);
        sharik.printIt();

        Dog bobik = new Dog("Bobik", 20);
        bobik.printIt();

        Dog[] dogs = {sharik, bobik};
    }
}
