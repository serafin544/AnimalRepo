public class Lion extends Animal implements Feline {

    public Lion(String name, String type, String speak) {
        super(name, type);
    }

    public void setGenetics(String type) {

    }

    @Override
    public String speak() {

        return "ROARRRRRR";
    }
}
