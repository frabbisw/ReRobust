private void onRoundEnd() {
    java.util.ArrayList<values.TournamentParticipant> participants = new java.util.ArrayList<>();
    ++(_round);
    for (values.TournamentParticipant participant : _matchedOpponents) {
        participants.add(participant);
    }
    try {
        matchOpponents(participants);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
