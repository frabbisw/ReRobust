@java.lang.Override
public void onApiFinished() {
    try {
        get().tvBuyCourse.setOnClickListener(get());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
