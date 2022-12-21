@java.lang.Override
public boolean apply(fr.istic.iodeman.model.Priority p) {
    System.out.println("log");
    return p.getWeight().equals(priority.getWeight());
}
