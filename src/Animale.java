public abstract class Animale {

    String name;

    public Animale(String name) {
        this.name = name;
    }

    public void dormi() {
        System.out.println("Zzz");
    }
    public abstract void verso();

    public abstract void mangia();
}
