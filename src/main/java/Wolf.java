public class Wolf extends Animal implements Canine {

    public Wolf(String name, String type, String speak) {
        super(name, type);
    }

    public void setGenetics(String type) {
        type = "Canine";
    }

    @Override
    public String speak() {
        return "I am ALpha DOG";
    }
}
