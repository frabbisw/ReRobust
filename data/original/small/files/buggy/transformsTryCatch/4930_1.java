public void closeSurveyFragment() {
    org.eyeseetea.malariacare.layout.score.ScoreRegister.clear(org.eyeseetea.malariacare.database.utils.Session.getSurveyByModule(Constants.FRAGMENT_SURVEY_KEY).getId_survey(), Constants.FRAGMENT_FEEDBACK_KEY);
    surveyFragment.unregisterReceiver();
    initAssess();
    try {
        unsentFragment.reloadData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setActionBarDashboard();
}
