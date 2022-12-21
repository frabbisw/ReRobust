public void passInitialMessages() {
    System.out.println("log");
    double[] identityMessage = new double[] { 1, 1, 1, 1 };
    for (node.Vertex n : neighborList) {
        n.receiveMessage(new message.Message(this, identityMessage));
    }
}
