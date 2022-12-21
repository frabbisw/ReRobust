@java.lang.Override
public void onClick(android.view.View v) {
    try {
        displaySummary();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setView(com.flaredown.flaredownApp.Checkin.CheckinActivity.Views.SUMMARY);
}
