abstract class Animal {
    public String Type;
    public String Name;

    abstract void Sound();
    abstract String getName();
    abstract void setName(String name);
}

class Dog extends Animal {
    public Dog() {
        Type = "Dog";
    }
    public void Sound() {
        System.out.println("Bark!");
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.setName("Azorel");
        System.out.println(obj.Type);
        obj.Sound();
        System.out.println(obj.getName());
    }
}
