package Introduzione.Counter;

public class Esempio {
    public static void main(String[] args) {
        int n;
        Counter c1, c2;
        boolean b1;

        c1 = new Counter();
        c2 = new Counter();
        c1.Reset();
        c1.Inc();

        n = c1.GetValue();

        System.out.println("Parte 1:\n" + n);

        // parte 2
        c1.Copy(c2);
        b1 = c1.equals(c2);
        System.out.println("Parte 2:\n" + b1);

        // parte 3
        Counter c3;
        c3 = new Counter();
        c3.Reset();
        c3.Inc();
        c3.Inc();
        n = c3.GetValue();
        System.out.println("Parte 3:\n" + n);
        c3.Dec();
        n = c3.GetValue();
        System.out.println(n);

    }
}