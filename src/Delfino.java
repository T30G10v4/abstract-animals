public class Delfino extends Animale implements IVolante {


    public Delfino(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }


    @Override
    public void verso() {
        System.out.println("Splash Splash TWOOOOOOOOOOO");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio i pesci");
    }

    @Override
    public void vola() {
        System.out.println("Delfino che nuota");
    }
}
