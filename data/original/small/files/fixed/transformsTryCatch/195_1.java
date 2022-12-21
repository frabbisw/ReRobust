@org.junit.Test
public void setupMenu() {
    presenter.setupMenu();
    try {
        org.mockito.Mockito.verify(mainView, org.mockito.Mockito.times(1)).setup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
