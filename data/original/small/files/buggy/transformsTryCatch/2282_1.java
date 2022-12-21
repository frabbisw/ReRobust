public uk.co.nickthecoder.itchy.Director createDirector(uk.co.nickthecoder.itchy.util.ClassName className) throws javax.script.ScriptException {
    try {
        java.lang.System.out.println(("Creating Director from SM " + (this.hashCode())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    uk.co.nickthecoder.itchy.script.ScriptLanguage language = getLanguage(uk.co.nickthecoder.itchy.script.ScriptManager.getExtension(className.name));
    return language.createDirector(className);
}
