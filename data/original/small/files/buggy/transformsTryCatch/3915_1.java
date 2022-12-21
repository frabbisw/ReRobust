@org.junit.Before
public void buildingSetup() {
    mList = new java.util.ArrayList<com.softwareengineeringapp.kamys.findmean.buildingObject>();
    try {
        mList.add(new com.softwareengineeringapp.kamys.findmean.buildingObject(true, true, (-89.4067), 43.0755, true, true, "Van Hise"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    MapsActivity.buildings = mList;
}
