public class Main {

    public static void faiVolare(IVolante animale){

        animale.vola();

    }

    public static void faiNuotare(INuotante animale){

        animale.nuota();

    }
    public static void main(String[] args) {

        Animale[] animali = new Animale[4];

        animali[0] = new Cane("Fido");
        animali[1] = new Passerotto("Cipi");
        animali[2] = new Aquila("Kiki");
        animali[3] = new Delfino("Ecco");

        for(Animale animal : animali) {

            System.out.println("************************");
            animal.dormi();
            animal.mangia();
            animal.verso();

            if(animal instanceof IVolante){

               faiVolare((IVolante) animal);

            }
            else if (animal instanceof INuotante){

                faiNuotare((INuotante) animal);

            }

        }

    }
}