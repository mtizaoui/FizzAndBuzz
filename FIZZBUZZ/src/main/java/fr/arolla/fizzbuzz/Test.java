package fr.arolla.fizzbuzz;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.print(i);
            System.out.println(new FizzAndBuzzAlgo().apply(i, new StringBuilder("")));
        }
    }
}
