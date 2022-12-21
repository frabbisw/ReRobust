@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.jdelorenzo.capstoneproject.EditDayFragment.ARG_ROUTINE_ID, mRoutineId);
    mAdapter.onSaveInstanceState(outState);
    try {
        super.onSaveInstanceState(outState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
