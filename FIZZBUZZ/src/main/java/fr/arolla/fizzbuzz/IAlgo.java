package fr.arolla.fizzbuzz;

public interface IAlgo {

    default String apply(Integer number, StringBuilder finalValue) {
        return finalValue.toString().isEmpty() ? number.toString() : finalValue.toString();
    }


}
