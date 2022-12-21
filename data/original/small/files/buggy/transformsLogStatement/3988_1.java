@org.junit.Before
public void setup() {
    broadcaster = new com.space.server.engine.impl.Broadcaster();
    engine = org.mockito.Mockito.Mockito.mock(com.space.server.engine.api.GameEngine.class);
    broadcaster.setEngine(engine);
    System.out.println("log");
    broadcaster.setPlayerId(1);
    broadcaster.setWorldId(0);
}
