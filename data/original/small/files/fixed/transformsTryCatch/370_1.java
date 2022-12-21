@java.lang.Override
protected void onStop() {
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.m2dl.shifoomi.repository.room.RoomRepository repository = com.m2dl.shifoomi.repository.room.RoomRepositoryFirebase.getInstance();
    repository.deleteRoom(roomId);
}
