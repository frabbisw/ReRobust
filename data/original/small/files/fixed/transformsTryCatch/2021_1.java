public de.thm.ap.openfit.model.sugarORM.records.SubActivity add(de.thm.ap.openfit.model.IValue value) {
    try {
        value.setSubActivity(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    values.add(((de.thm.ap.openfit.model.sugarORM.records.Value) (value)));
    return this;
}
