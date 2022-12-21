@java.lang.Override
public void fetchFilteredModules(java.util.List<de.fhws.campusapp.entity.Module> modules) {
    filteredModulesDataset = modules;
    allModulesDataset.addAll(modules);
    filter(de.fhws.campusapp.adapter.ModuleListAdapter.oldSearchTerm);
    try {
        activateProgressBar.showProgressBar(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
