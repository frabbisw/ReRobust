public de.thm.ap.openfit.model.sugarORM.records.Activity add(de.thm.ap.openfit.model.ISubActivity subActivity) {
    try {
        subActivities();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    subActivity.setActivity(this);
    subActivities.add(((de.thm.ap.openfit.model.sugarORM.records.SubActivity) (subActivity)));
    return this;
}
