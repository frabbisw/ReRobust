@java.lang.Override
public void delete(int position) {
    mGoals.remove(position);
    try {
        mAdapter.notify(AnimationType.REMOVE, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
