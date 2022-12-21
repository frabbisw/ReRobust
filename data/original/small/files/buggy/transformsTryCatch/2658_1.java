@java.lang.Override
protected void onPostExecute(java.util.List<com.example.davidberg.androidkurs.VasttrafikJourney> journeys) {
    try {
        updateJourneyList();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
