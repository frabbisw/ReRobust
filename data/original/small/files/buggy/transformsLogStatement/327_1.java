@java.lang.Override
public boolean addRoomRecord(java.lang.String esn, int roomId) {
    System.out.println("log");
    return (getJdbcTemplate().update(com.garmin.di.dao.impl.GameDaoImpl.SQL_INSERT_ROOM_RECORD, esn, roomId)) > 0;
}
