@java.lang.Override
public org.apache.http.conn.ConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) {
    System.out.println("log");
    return connectionRequest;
}
