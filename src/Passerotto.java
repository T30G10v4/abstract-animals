public class Passerotto extends Animale implements IVolante {


    public Passerotto(String name) {
        super(name);
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
