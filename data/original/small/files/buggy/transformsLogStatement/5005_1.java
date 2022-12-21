@java.lang.Override
public int compare(org.ggp.base.util.statemachine.Move m0, org.ggp.base.util.statemachine.Move m1) {
    System.out.println("log");
    return m0.toString().compareTo(m1.toString());
}
