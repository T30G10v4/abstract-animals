public class Delfino extends Animale implements IVolante {
    String name = "";

    public Delfino(String name) {
        this.name = name;
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
