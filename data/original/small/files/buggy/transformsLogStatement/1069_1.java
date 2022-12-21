@java.lang.Override
public KernelTransaction.Revertable restrict(org.neo4j.kernel.api.security.AccessMode mode) {
    System.out.println("log");
    return currentTransaction.get().restrict(mode);
}
