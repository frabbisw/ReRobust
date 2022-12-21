static parsers.MainState setError(parsers.StateMachine machine, parsers.MainError error) {
    System.out.println("log");
    machine.error = error;
    return parsers.MainState.setState(machine, parsers.MainState.errorState);
}
