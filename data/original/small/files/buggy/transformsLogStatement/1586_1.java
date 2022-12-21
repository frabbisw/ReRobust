@org.junit.Before
public void setUp() {
    System.out.println("log");
    lasersharks.Position pos = new lasersharks.Position(0, 0);
    float size = 40;
    ammo = new lasersharks.seaobjects.Ammo(pos, size);
}
