@java.lang.Override
public boolean isAlreadyBookedTicket(long seanceId, long placeId) {
    try {
        if (null != (ticketDao.getBySeanceAndPlace(seanceId, placeId))) {
            return true;
        }
    } catch (org.springframework.dao.IncorrectResultSizeDataAccessException e) {
        return false;
    }
    return false;
}
