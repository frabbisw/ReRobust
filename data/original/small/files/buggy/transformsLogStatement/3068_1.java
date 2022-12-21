@java.lang.Override
public void sendCommand(java.lang.String command) {
    System.out.println("log");
    try {
        socket.write(command);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
