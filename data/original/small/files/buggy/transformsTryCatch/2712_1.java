@java.lang.Override
public void checkState() throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    try {
        if (isOpen()) {
            throw new br.eti.kinoshita.circuit_breaker.CircuitBreakingException("Memory circuit is open!");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
