@java.lang.Override
public void onClick(android.view.View view) {
    try {
        dateTimeFragment.show(getSupportFragmentManager(), com.kunzisoft.switchdatetimesample.Sample.TAG_DATETIME_FRAGMENT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
