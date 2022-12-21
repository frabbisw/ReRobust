@org.junit.Before
public final void before() {
    System.out.println("log");
    int queueSize = 500;
    messageHandler = new ru.ayaz.UserMessageHandler(queueSize);
}
