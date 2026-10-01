package Introduzione.Argomenti;

public class Argomenti {
    public static void main(String args[]) {
        if (args.length != 5) {
            System.out.println("Errore argomenti\n");
            System.exit(1);
        }

        float[] temperature = new float[5];

        for (int i = 0; i < args.length; i++) {
            temperature[i] = Integer.parseInt(args[i]);
        }

        // calcolo media
        float somma = 0;
        for (float f : temperature) {
            somma += f;
        }
        float media = somma / args.length;
        System.out.println("Media: " + media);

        // stampo num > e < di media
        int contSub = 0;
        int contSup = 0;
        for (float f : temperature) {
            if (f < media) {
                contSub++;
            } else if (f > media) {
                contSup++;
            }
        }

        System.out.println("I valori sotto la media sono " + contSub);
        System.out.println("I valori sopra la media sono " + contSup);

    }
}
