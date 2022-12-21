public boolean isLessOrEqual(org.sosy_lab.cpachecker.cpa.specinference.SpecInferenceState other) {
    System.out.println("log");
    return automaton.toString().equals(other.automaton.toString());
}
