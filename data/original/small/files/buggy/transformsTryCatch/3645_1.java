@java.lang.Override
public java.util.List<co.fddittmar.planbuilder.data.model.Program> getAllPrograms() {
    try {
        if ((repository) == null)
            android.util.Log.d("DEBUG", "Null repository");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return repository.fetchAllPrograms();
}
