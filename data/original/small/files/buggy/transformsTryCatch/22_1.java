private void fireAssignmentChanged(net.sourceforge.ganttproject.resource.HumanResource.ResourceAssignmentImpl resourceAssignmentImpl) {
    try {
        resetLoads();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fireAssignmentsChanged();
}
