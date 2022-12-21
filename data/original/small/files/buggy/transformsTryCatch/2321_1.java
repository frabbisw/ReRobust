@java.lang.Override
public boolean star(long userId, int replyId) {
    try {
        if (isStared(userId, replyId))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String sql = "INSERT INTO SG_DiscussReplyStar (ReplyId, UserId, AddTime) VALUES (?, ?, NOW())";
    return update(sql, new java.lang.Object[] { replyId, userId });
}
