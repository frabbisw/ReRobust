@java.lang.Override
public boolean isApplicable(model.AtomData data) {
    return ((data.getPrevious()) != null) || ((data.getNext()) != null);
}
