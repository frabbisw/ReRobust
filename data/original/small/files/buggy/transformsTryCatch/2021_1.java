public de.thm.ap.openfit.model.sugarORM.records.SubActivity add(de.thm.ap.openfit.model.IValue value) {
    values();
    value.setSubActivity(this);
    try {
        values.add(((de.thm.ap.openfit.model.sugarORM.records.Value) (value)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
