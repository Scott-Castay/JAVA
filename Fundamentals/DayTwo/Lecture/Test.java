public class Test {
    public static void main(String[] args) {
        System.out.println("Hello There");

        // instantiating an object
        // creating an instance of the class
        Dog dog1 = new Dog("Vicky", 5, "brindle");
        Dog dog2 = new Dog("Leia", 1, "red and white");
        Dog dog3 = new Dog();
        Dog dog4 = new Dog("Bosco");


        // dog1.name = "Vicky";
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getHairColor());
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getHairColor());

        System.out.println();
        System.out.println();

        dog1.setName("Woofy");
        System.out.println(dog1.getName());

        dog1.bark();

    }
}