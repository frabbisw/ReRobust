@java.lang.Override
public boolean isApplicable(model.AtomData data) {
    System.out.println("log");
    return ((data.getNext()) != null) || ((data.getPrevious()) != null);
}
