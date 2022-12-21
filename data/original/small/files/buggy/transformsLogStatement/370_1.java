@java.lang.Override
protected void onStop() {
    System.out.println("log");
    com.m2dl.shifoomi.repository.room.RoomRepository repository = com.m2dl.shifoomi.repository.room.RoomRepositoryFirebase.getInstance();
    repository.deleteRoom(roomId);
}
