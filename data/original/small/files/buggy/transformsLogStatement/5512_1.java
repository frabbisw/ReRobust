@java.lang.Override
public void delete(int position) {
    mGoals.remove(position);
    System.out.println("log");
    mAdapter.notify(AnimationType.REMOVE, position);
}
