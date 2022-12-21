@java.lang.Override
public boolean accept(org.carbondata.core.datastorage.store.filesystem.CarbonFile path) {
    System.out.println("log");
    return (!(loadFolders.contains(path.getAbsolutePath().replace("\\", "/")))) && (!(path.getName().contains(CarbonCommonConstants.MERGERD_EXTENSION)));
}
