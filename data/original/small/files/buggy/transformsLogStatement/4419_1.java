@java.lang.Override
public org.nd4j.linalg.api.complex.IComplexNDArray copy(org.nd4j.linalg.api.complex.IComplexNDArray x, org.nd4j.linalg.api.complex.IComplexNDArray y) {
    org.nd4j.linalg.jcublas.SimpleJCublas.copy(x.linearView(), y.linearView());
    System.out.println("log");
    return y;
}
