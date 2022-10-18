public class Dog {
    public String name;
    public int age;
    public String hairColor;

    // constructor
    // notice no return type
    // dunder init, dunder = shorthand for double underscore
    public Dog(){
        this.name = "Default";
        this.age = 5;
        this.hairColor = "brown";

    }

    public Dog(String name) {
        this.name = name;
        this.age = 5;
        this.hairColor = "brown";

    }
    
    
    public Dog(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    //METHODS

    public void bark(){
        System.out.println("Bark bark my name is " + this.name);
    }

    //GETTERS AND SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int Age){
        if (this.age < age) {
            this.age = age;
        }
    }

    public String getHairColor(){
        return hairColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;

    }
}