public class Passerotto extends Animale implements IVolante {

    String name = "";

    public Passerotto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void verso() {
        System.out.println("Pio Pio");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio i semi");
    }

    @Override
    public void vola() {
        System.out.println("Passerotto che vola");
    }
}
