package fr.arolla.fizzbuzz;

class FizzAndBuzzAlgo implements IAlgo {

    @Override
    public String apply(Integer number, StringBuilder finalValue) {
        ElseAlgo elseAlgo = new ElseAlgo();
        BuzzAlgo buzzAlgo = new BuzzAlgo(elseAlgo);
        FizzAlgo fizzAlgo = new FizzAlgo(buzzAlgo);

        return fizzAlgo.apply(number, finalValue);
    }
}
