@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    System.out.println("log");
    super.setHasStableIds(hasStableIds);
    mOriginalAdapter.setHasStableIds(hasStableIds);
}
