package fr.arolla.fizzbuzz;

import fr.arolla.fizzbuzz.util.Constants;

class BuzzAlgo extends AlgoAbstract {

    public BuzzAlgo(IAlgo algo) {
        super(algo);
    }

    @Override
    public String apply(Integer number, StringBuilder finalValue) {
        if (number % 5 == 0 || number.toString().contains(Constants.FIVE)) {
            finalValue.append(Constants.BUZZ);
        }

        return this.algo.apply(number, finalValue);
    }
}
