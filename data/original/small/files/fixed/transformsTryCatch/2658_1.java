@java.lang.Override
protected void onPostExecute(java.util.List<com.example.davidberg.androidkurs.VasttrafikJourney> journeys) {
    try {
        updateJourneyList(journeys);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
