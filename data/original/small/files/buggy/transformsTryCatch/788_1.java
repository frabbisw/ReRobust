public void setData(java.util.Map<java.lang.String, java.util.List<com.runningracehisotry.models.Race>> mRacesDetail) {
    this.mHistories = new java.util.LinkedHashMap<java.lang.String, java.util.List<com.runningracehisotry.models.Race>>(mRacesDetail);
    notifyDataSetInvalidated();
    try {
        this.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
