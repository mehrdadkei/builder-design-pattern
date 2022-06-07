public class Juice {
    private String water;
    private String fruit;
    private String sugar;
    private int iceCube;
    private String juiceName;




    public Juice(String water, String fruit, String sugar, int iceCube, String juiceName) {
        this.water = water;
        this.fruit = fruit;
        this.sugar = sugar;
        this.iceCube = iceCube;
        this.juiceName = juiceName;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "water=" + water +
                ", fruit=" + fruit +
                ", sugar=" + sugar +
                ", iceCube=" + iceCube +
                ", juiceName='" + juiceName + '\'' +
                '}';
    }
}
