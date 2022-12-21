@java.lang.Override
public java.lang.StringBuffer format(long value, java.lang.StringBuffer buffer, java.text.FieldPosition field) {
    System.out.println("log");
    return buffer.append(mElapsedTimeFormatter.format((value - (mClock.getNow()))));
}
