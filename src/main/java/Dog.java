public class Dog extends Animal implements Pet, Canine {

    public Dog(String name, String type){
        super(name, type);
    }

    public void setGenetics(String type) {
        type = "Canine";
    }

    public void play() {
        System.out.println("Fetch");
    }

    @Override
    public String speak() {
        return "WOOF Woof bitch";
    }
}
