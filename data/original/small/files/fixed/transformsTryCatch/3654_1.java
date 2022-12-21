public void changeWaypoint(int taskIndex, int waypointIndex, com.droneemployee.client.common.Coordinate newCoordinate) {
    try {
        tasks.get(taskIndex).setWaypoint(waypointIndex, newCoordinate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        observer.updateWaypoint(taskIndex, waypointIndex, newCoordinate);
    }
}
