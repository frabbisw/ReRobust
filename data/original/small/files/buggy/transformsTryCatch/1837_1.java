@org.junit.Before
public void setup() {
    try {
        testingData = setupTestingData(15, 10, 5);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tree = new RandomForestHOG.DecisionTree.DecisionTree(testingData, 0);
}
