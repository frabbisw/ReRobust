private void sendFailForAll() {
    {
        int id = 0;
        while (id < (Simulation.NumberOfAgents)) {
            if ((this.id) != id) {
                sendMessage(new Messages.KillMessage(), id);
            }
            id++;
        }
    }
}
