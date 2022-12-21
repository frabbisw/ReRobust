@org.junit.Test
public void Setup_Menu() {
    presenter.setupMenu();
    System.out.println("log");
    org.mockito.Mockito.verify(mainView, org.mockito.Mockito.times(1)).setup();
}
