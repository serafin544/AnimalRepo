public class Cat extends Animal implements Pet,Feline{

    public Cat(String name, String type, String speak) {
        super(name, type);
    }


    @Override
    public String speak() {
        return "Meow";
    }

    public void setGenetics(String type) {
        type = "Feline: Cat";
    }

    public void play() {
        System.out.println("CAT NIP ZZZZZZZZZZZ");
    }
}
