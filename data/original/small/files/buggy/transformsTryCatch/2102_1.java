@org.junit.Test
public void testLoadView() {
    try {
        org.junit.Assert.assertTrue(viewController.loadView("test", mockHomeView, mockHomePresenter));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.mockito.Mockito.verify(mockHomePresenter, org.mockito.Mockito.times(1)).setViewParent(org.mockito.ArgumentMatchers.any(ch.imedias.rsccfx.ViewController.class));
}
