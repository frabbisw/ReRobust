public void changeWaypoint(int taskIndex, int waypointIndex, com.droneemployee.client.common.Coordinate newCoordinate) {
    try {
        for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
            tasks.get(taskIndex).setWaypoint(waypointIndex, newCoordinate);
            observer.updateWaypoint(taskIndex, waypointIndex, newCoordinate);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
