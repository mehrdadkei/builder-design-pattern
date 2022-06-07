public class JuiceMaker {

    private String water;
    private String fruit;
    private String sugar;
    private int iceCube;
    private String juiceName;

    public JuiceMaker setWater(String water) {
        this.water = water;
        return this;
    }

    public JuiceMaker setFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }

    public JuiceMaker setSugar(String sugar) {
        this.sugar = sugar;
        return this;
    }

    public JuiceMaker setIceCube(int iceCube) {
        this.iceCube = iceCube;
        return this;
    }

    public JuiceMaker setJuiceName(String juiceName) {
        this.juiceName = juiceName;
        return this;
    }

    public Juice getJuice(){
        return new Juice(water,fruit,sugar,iceCube,juiceName);
    }

}
