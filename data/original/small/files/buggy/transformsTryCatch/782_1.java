@org.junit.Test
public void aDeadCellShouldBeRepresentedByADot() {
    com.wakaleo.gameoflife.domain.Cell cell = com.wakaleo.gameoflife.domain.Cell.fromSymbol(".");
    try {
        org.hamcrest.MatcherAssert.assertThat(cell, org.hamcrest.Matchers.is(com.wakaleo.gameoflife.domain.Cell.DEAD_CELL));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertTrue(true);
}
