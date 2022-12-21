@java.lang.Override
public void onClick(android.view.View v) {
    try {
        submitCheckin();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    displaySummary();
    setView(com.flaredown.flaredownApp.Checkin.CheckinActivity.Views.SUMMARY);
}
