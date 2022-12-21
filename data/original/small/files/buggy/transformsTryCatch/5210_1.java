@java.lang.Override
public void addAudio(long audioId, long userId) throws java.sql.SQLException {
    try {
        jdbcTemplate.update(addAudio, userId, audioId, userId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
