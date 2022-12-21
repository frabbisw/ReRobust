@org.junit.Test
public void setWeightWatcherSmartPoints() {
    recipeModel.setWeightWatcherSmartPoints(12);
    try {
        org.junit.Assert.assertEquals(((int) (recipeModel.getWeightWatcherSmartPoints())), 12);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
