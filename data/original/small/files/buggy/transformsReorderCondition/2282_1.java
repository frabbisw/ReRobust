public uk.co.nickthecoder.itchy.Director createDirector(uk.co.nickthecoder.itchy.util.ClassName className) throws javax.script.ScriptException {
    java.lang.System.out.println(((this.hashCode()) + "Creating Director from SM "));
    uk.co.nickthecoder.itchy.script.ScriptLanguage language = getLanguage(uk.co.nickthecoder.itchy.script.ScriptManager.getExtension(className.name));
    return language.createDirector(className);
}
