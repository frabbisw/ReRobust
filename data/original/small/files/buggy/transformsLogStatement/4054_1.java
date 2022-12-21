@java.lang.Override
public java.util.Collection<V> values() {
    System.out.println("log");
    return values(TruePredicate.INSTANCE);
}
