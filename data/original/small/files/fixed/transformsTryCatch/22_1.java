private void fireAssignmentChanged() {
    try {
        resetLoads();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fireAssignmentsChanged();
}
