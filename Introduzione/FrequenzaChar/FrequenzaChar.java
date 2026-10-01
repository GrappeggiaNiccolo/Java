package Introduzione.FrequenzaChar;

public class  FrequenzaChar{
    public static void main (String args[]) {
        // conto quante char 
        if (args.length != 1) {
            System.out.println("Errore argomenti\n");
            System.exit(1);
        }

        String numeroTelefono = args[0];

        if (numeroTelefono.length() != 10) {
            System.out.println("Lunghezza errata");
            System.exit(2);
        }

        // non controllo l'input utente --> to do...

        int[] conteggio = new int[10];

        // Scansione di ogni carattere della stringa
        for (int i = 0; i < numeroTelefono.length(); i++) {
            char c = numeroTelefono.charAt(i);
            int cifra = Character.getNumericValue(c);
            conteggio[cifra]++;
        }

        // Visualizzazione a video dei risultati
        System.out.println("Frequenza delle cifre nel numero " + numeroTelefono + ":");
        System.out.println("---------------------------------");
        for (int i = 0; i < conteggio.length; i++) {
            System.out.println("Cifra " + i + ": " + conteggio[i] + " volt" + (conteggio[i] == 1 ? "a" : "e"));
        }
    }
}
