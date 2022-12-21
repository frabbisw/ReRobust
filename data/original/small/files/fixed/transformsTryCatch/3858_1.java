@org.junit.Before
public void setUp() throws java.lang.Exception {
    try {
        org.mockito.MockitoAnnotations.initMocks(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    presenter.attachView(mockView);
}
