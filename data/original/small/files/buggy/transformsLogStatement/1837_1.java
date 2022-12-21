@org.junit.Before
public void setup() {
    testingData = setupTestingData(15, 10, 5);
    System.out.println("log");
    tree = new RandomForestHOG.DecisionTree.DecisionTree(testingData, 0);
}
