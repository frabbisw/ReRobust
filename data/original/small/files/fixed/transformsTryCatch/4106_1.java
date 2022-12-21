@org.junit.Test
public void getActiveInstrumentBoxes() {
    java.util.List<gui.styling.StyledCheckbox> list = org.mockito.Mockito.mock(java.util.List.class);
    try {
        detailViewController.setActiveInstrumentBoxes(list);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(list, detailViewController.getActiveInstrumentBoxes());
}
