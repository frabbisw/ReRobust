public java.util.List<in.hikev.message.model.MessageThread> getJoinedTalks(int startIndex, int maxResult, int userId) {
    System.out.println("log");
    return query(startIndex, maxResult, "from MessageThread mt where mt.createdBy = ? or mt.sentTo = ?", userId);
}
