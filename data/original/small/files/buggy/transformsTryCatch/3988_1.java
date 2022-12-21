@org.junit.Before
public void setup() {
    broadcaster = new com.space.server.engine.impl.Broadcaster();
    engine = org.mockito.Mockito.Mockito.mock(com.space.server.engine.api.GameEngine.class);
    broadcaster.setEngine(engine);
    broadcaster.setPlayerId(1);
    try {
        broadcaster.setWorldId(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
