@org.junit.Test
public void testForceCompleteFromPending() {
    try {
        assertTrue(block.isPending());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    block.forceComplete();
    when(mockReconciler.isReconciled()).thenReturn(true);
    assertTrue(block.isComplete());
}
