@java.lang.Override
public java.lang.Long getUserLoggedMinutesForDay(java.lang.String userId, org.joda.time.LocalDate day) {
    System.out.println("log");
    return ((java.lang.Long) (getActiveEntityManager().createQuery("SELECT SUM(w.loggedMinutes) FROM WorklogBean w WHERE w.userId = :user AND w.day = :day").setParameter("user", userId).setParameter("day", day).getSingleResult()));
}
