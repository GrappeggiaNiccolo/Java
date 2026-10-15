package Esercizi.StringInt;

public class StringInt {
    int num = 0;

    public StringInt(String[] args) throws IllegalArgumentException, NumberFormatException {
        for (String string : args) {
                num = Integer.parseInt(string); // ritorna una NumberFormatException

                if (num > 10 || num < -10) {
                    System.out.println("Numero fuori range: " + num);
                    throw new IllegalArgumentException("Fuori Range"); // essendo il numero fuori range, genero un'eccezione
                } else {
                    System.out.println("Numero valido: " + num);
                }
        }
    }
}