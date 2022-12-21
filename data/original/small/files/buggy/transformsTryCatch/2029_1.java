@org.junit.Test
public void testForceCompleteFromPending() {
    assertTrue(block.isPending());
    block.forceComplete();
    try {
        org.mockito.Mockito.when(mockReconciler.isReconciled()).thenReturn(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertTrue(block.isComplete());
}
