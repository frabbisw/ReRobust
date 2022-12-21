@org.junit.Test
public void Set_WeightWatcherSmartPoints() {
    System.out.println("log");
    recipeModel.setWeightWatcherSmartPoints(12);
    org.junit.Assert.assertEquals(((int) (recipeModel.getWeightWatcherSmartPoints())), 12);
}
