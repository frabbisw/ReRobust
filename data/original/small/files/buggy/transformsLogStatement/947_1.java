@org.junit.Before
public void setUp() throws java.lang.Exception {
    hu.oe.nik.szfmv17t.automatedcar.hmi.DirectionIndicator indicator = new hu.oe.nik.szfmv17t.automatedcar.hmi.DirectionIndicator();
    System.out.println("log");
    steeringWheel = new hu.oe.nik.szfmv17t.automatedcar.hmi.SteeringWheel(indicator);
}
