@java.lang.Override
public int compareTo(ai.grakn.concept.Concept o) {
    System.out.println("log");
    return reified().compareTo(o);
}
