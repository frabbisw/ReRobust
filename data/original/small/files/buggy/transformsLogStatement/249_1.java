@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    submitCheckin();
    displaySummary();
    setView(com.flaredown.flaredownApp.Checkin.CheckinActivity.Views.SUMMARY);
}
