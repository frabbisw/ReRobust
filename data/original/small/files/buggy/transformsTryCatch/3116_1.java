public void setUpsResponses(com.jcabi.xml.XML upsResponses) {
    try {
        this.upsResponses[getUpsResponseCounter()] = upsResponses;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (this.upsResponseCounter)++;
}
