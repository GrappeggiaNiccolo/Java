package Esercizi.StringInt;

import java.util.*;

public class Esempio {
    // 'main' deve avere la 'm' minuscola e accettare String[] args
    public static void main(String[] args) {
        try {
            StringInt s = new StringInt(args);
        } catch (NumberFormatException e1) {
            System.err.println(e1.getMessage());
        } 
        catch(IllegalArgumentException e2) {
            System.err.println(e2.getMessage());
        }
    }
}