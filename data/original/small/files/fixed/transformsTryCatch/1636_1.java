public de.thm.ap.openfit.model.sugarORM.records.Activity add(de.thm.ap.openfit.model.ISubActivity subActivity) {
    try {
        subActivity.setActivity(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    subActivities.add(((de.thm.ap.openfit.model.sugarORM.records.SubActivity) (subActivity)));
    return this;
}
