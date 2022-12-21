private void sendFailForAll() {
    for (int id = 0; (Simulation.NumberOfAgents) > id; id++) {
        if ((this.id) != id) {
            sendMessage(new Messages.KillMessage(), id);
        }
    }
}
