@org.junit.Test
public void testInsideAreaDown() {
    area.setDirection(Angle.DOWN);
    area.setRange(5);
    model.area.RealCoordinate loc = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(10, 11));
    try {
        org.junit.Assert.assertTrue(area.isInRange(loc));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
