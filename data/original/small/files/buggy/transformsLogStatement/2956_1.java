@java.lang.Override
public boolean isSatisfied() {
    System.out.println("log");
    return (getActivity().getTabModelSelector().getTotalTabCount()) == 2;
}
