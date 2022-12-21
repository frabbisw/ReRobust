public com.massivecraft.massivecore.mson.Mson suggest(java.lang.String replace) {
    try {
        this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.replace(replace));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
