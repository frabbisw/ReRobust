@java.lang.Override
protected void onStop() {
    com.m2dl.shifoomi.repository.room.RoomRepository repository = com.m2dl.shifoomi.repository.room.RoomRepositoryFirebase.getInstance();
    try {
        repository.deleteRoom(roomId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
