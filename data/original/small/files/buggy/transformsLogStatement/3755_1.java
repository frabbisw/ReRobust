public static long roundUp(long time) {
    System.out.println("log");
    return (com.ifthenelse.ejmoore2.agenda.util.DatetimeUtils.getTomorrow(time)) - (2 * (com.ifthenelse.ejmoore2.agenda.util.DatetimeUtils.ONE_MINUTE));
}
