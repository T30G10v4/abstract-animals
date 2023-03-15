public class Aquila extends Animale implements IVolante {


    public Aquila(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void verso() {
        System.out.println("PWOOOOOOOOOO");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio le prede");
    }

    @Override
    public void vola() {
        System.out.println("Aquila che volola");
    }
}
