@net.java.html.json.Function
static void changeSP(final web.aprendiendola.dictionaryweb.aprendiendola.dictionary.DiccionarioDeJava.Dictionary model, final java.lang.String data) {
    try {
        if (!("".equals(data))) {
            model.setSearchPhrase(data);
            web.aprendiendola.dictionaryweb.aprendiendola.dictionary.DiccionarioDeJava.DataModel.changeFP(model);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
