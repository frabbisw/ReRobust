private void closeConnection(java.sql.Connection connection) {
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        persistence.JdbcTemplate.LOGGER.error((e + "Can't close connection: "));
    }
}
