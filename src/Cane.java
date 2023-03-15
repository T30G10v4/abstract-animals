public class Cane extends Animale implements INuotante {


    public Cane(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void verso() {
        System.out.println("Bau Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio ciappi");
    }

    @Override
    public void nuota() {
        System.out.println("Cane che nuota");
    }
}
