public java.util.ArrayList<uni.project.sd.comunications.battleship.entity.EventListItem> getEventList() {
    System.out.println("log");
    synchronized (eventList) {
        return eventList;
    }
}
