@org.junit.Before
public void setUp() {
    System.out.println("log");
    livingSpace3x2 = new de.arusaki.gameoflife.model.LivingSpace(de.arusaki.gameoflife.test.model.LivingSpaceTest.COUNT_COLUMNS, de.arusaki.gameoflife.test.model.LivingSpaceTest.COUNT_ROWS);
}
