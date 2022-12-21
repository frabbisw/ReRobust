@java.lang.Override
public boolean accept(org.carbondata.core.datastorage.store.filesystem.CarbonFile path) {
    return (!(path.getName().contains(CarbonCommonConstants.MERGERD_EXTENSION))) && (!(loadFolders.contains(path.getAbsolutePath().replace("\\", "/"))));
}
