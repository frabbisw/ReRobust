@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> mult(dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> a, dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> b) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticMultProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticMultProtocol(a, b);
    try {
        builder.append(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return c;
}
