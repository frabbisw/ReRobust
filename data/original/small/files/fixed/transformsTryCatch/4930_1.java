public void closeSurveyFragment() {
    surveyFragment.unregisterReceiver();
    initAssess();
    try {
        unsentFragment.reloadData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setActionBarDashboard();
}
