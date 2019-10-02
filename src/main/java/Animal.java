public class Animal {
    private String name;
    private String type;
    private String speak;
    public Animal(String name, String type){
        this.name = name;
        this.type = type;
        this.speak = speak();
    }
    public String speak(){
     return "";
    }
}
