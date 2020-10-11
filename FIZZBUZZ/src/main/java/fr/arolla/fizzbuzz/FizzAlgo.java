package fr.arolla.fizzbuzz;

import fr.arolla.fizzbuzz.util.Constants;

class FizzAlgo extends AlgoAbstract {

    public FizzAlgo(IAlgo algo) {
        super(algo);
    }

    @Override
    public String apply(Integer number, StringBuilder finalValue) {
        if( number % 3 == 0 || number.toString().contains(Constants.THREE))
            finalValue.append(Constants.FIZZ );

        return this.algo.apply(number, finalValue);
    }
}