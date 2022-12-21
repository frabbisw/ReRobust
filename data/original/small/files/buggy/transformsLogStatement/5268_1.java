private void onRoundEnd() {
    java.util.ArrayList<values.TournamentParticipant> participants = new java.util.ArrayList<>();
    ++(_round);
    System.out.println("log");
    for (values.TournamentParticipant participant : _matchedOpponents) {
        participants.add(participant);
    }
    matchOpponents(participants);
}
