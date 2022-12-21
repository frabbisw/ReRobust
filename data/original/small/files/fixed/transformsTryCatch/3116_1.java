public void setUpsResponses(java.lang.String upsResponses) {
    try {
        this.upsResponses.add(upsResponses);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (this.upsResponseCounter)++;
}
