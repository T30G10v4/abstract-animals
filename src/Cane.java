public class Cane extends Animale implements INuotante {

    String name = "";

    public Cane(String name) {
        this.name = name;
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
