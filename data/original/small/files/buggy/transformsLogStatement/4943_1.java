@java.lang.Override
public boolean getFullDatasetValueOfLastUpdates() {
    System.out.println("log");
    if (this.alwaysIncremental) {
        return false;
    }
    return fullDataset;
}
