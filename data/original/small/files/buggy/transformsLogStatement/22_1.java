private void fireAssignmentChanged(net.sourceforge.ganttproject.resource.HumanResource.ResourceAssignmentImpl resourceAssignmentImpl) {
    resetLoads();
    System.out.println("log");
    fireAssignmentsChanged();
}
