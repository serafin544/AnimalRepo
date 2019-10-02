public class Tiger extends Animal implements Feline {

    public Tiger(String name, String type) {
        super(name, type);
    }

    public void setGenetics(String type) {
            type = "Canine";
    }

    @Override
    public String speak() {
        return "Frosted Flakes, They'rrreeee GRRRREEEAAAAT";
    }
}
