@java.lang.Override
public java.lang.String value() {
    System.out.println("log");
    return (org.kframework.kil.FloatBuiltin.printKFloat(value)) + (org.kframework.kil.FloatBuiltin.printKFloatSuffix(value, exponent));
}
