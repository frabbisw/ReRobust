@net.java.html.json.Function
static void changeSP(web.aprendiendola.dictionaryweb.aprendiendola.dictionary.DiccionarioDeJava.Dictionary model, java.lang.String data) {
    try {
        if (data != "") {
            model.setSearchPhrase(data);
            web.aprendiendola.dictionaryweb.aprendiendola.dictionary.DiccionarioDeJava.DataModel.changeFP(model);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
