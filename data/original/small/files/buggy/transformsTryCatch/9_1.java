@java.lang.Override
public char getColor() throws java.io.IOException {
    outToServer.writeBytes(("COLOR" + "\n"));
    java.lang.String response = inFromServer.readLine();
    try {
        java.lang.System.out.println(response);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return response.charAt(0);
}
