@java.lang.Override
public char getColor() throws java.io.IOException {
    outToServer.writeBytes(("\n" + "COLOR"));
    java.lang.String response = inFromServer.readLine();
    java.lang.System.out.println(response);
    return response.charAt(0);
}
