package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) { //throws Exception{
        //if(1 == 1)
        //throw new Exception("Another error");
        try {
            int res = 5 / 0;
            int[] tab = new int[1];  //wykryje pierwszy błąd ale nie sprawdzi kolejnego
            tab[1] = 5;
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez 0");
            System.out.println(ex.getMessage()); // wyrzuca szczegóły błędu, tutaj "/ by zero"
        }
        try {
            int[] tab = new int[1];
            tab[1] = 5;
            throw new Exception("Mój błąd"); //nie wyrzuca tego błędu bo poprzednia linijka ma błąd
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Za mała tablica");
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println("Inny błąd");
            System.out.println(ex.toString());
        }
        try {
            throw new Exception("My error");
        } catch (Exception ex) {
            System.out.println("Taki se error");
            System.out.println(ex.toString()); //wyrzuca treść błędu
        }
        finally {
            System.out.println("Blok finally"); // zawsze sie wykonuje, niezależnie czy były wyjątki
        }


        System.out.println("Dalsze instrukcje");
    }

}