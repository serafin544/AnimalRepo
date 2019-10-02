public class robot {
    private int productNum;
    private String type;
    private int chargeLevel;


    public robot(int pn,  String type , int chargeLevel){
        this.productNum = pn;
        this.type = type;
        this.chargeLevel = chargeLevel;

    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public int getProductNum() {
        return productNum;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ROBOT INFO: \n" + productNum + " \n" + type + "\n " + chargeLevel;
    }
}
