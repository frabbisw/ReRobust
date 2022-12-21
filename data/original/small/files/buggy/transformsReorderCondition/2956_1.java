@java.lang.Override
public boolean isSatisfied() {
    return 2 == (getActivity().getTabModelSelector().getTotalTabCount());
}
