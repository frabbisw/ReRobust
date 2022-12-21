public java.sql.ResultSet GetFavoriteShopsByUser(java.lang.String username) throws java.sql.SQLException {
    try {
        ConnectToDB();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stmt = conn.createStatement();
    java.lang.String sql = "";
    java.sql.ResultSet rs = stmt.executeQuery(sql);
    return rs;
}
