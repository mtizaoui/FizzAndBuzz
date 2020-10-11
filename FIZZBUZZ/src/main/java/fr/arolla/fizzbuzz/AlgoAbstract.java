package fr.arolla.fizzbuzz;

public class AlgoAbstract implements IAlgo {
    protected IAlgo algo;

    public AlgoAbstract(IAlgo algo) {
        this.algo = algo;
    }


}
