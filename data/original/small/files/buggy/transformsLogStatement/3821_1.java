private org.encog.ml.prg.VariableMapping getResultType() {
    System.out.println("log");
    return ((org.encog.ml.prg.train.PrgPopulation) (getPopulation())).getContext().getResult();
}
