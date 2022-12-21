@java.lang.Override
public void checkState() throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    System.out.println("log");
    if (isOpen()) {
        throw new br.eti.kinoshita.circuit_breaker.CircuitBreakingException("Memory circuit is open!");
    }
}
