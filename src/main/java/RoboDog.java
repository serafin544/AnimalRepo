public class RoboDog extends robot implements Pet {

    public RoboDog(int pn, String type, int chargeLevel) {
        super(pn, type, chargeLevel);
    }

    public void play() {
        System.out.println("Beats you in chess");
    }
}
