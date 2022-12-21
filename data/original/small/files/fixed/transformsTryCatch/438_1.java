@org.junit.Test
public void ifThereAreJsFilesThenRequestsWillBeGeneratedInProd() throws java.lang.Exception {
    given(aspect).indexPageRequires("appns/Class").and(aspect).hasClass("appns/Class");
    try {
        then(aspect).prodRequestsForContentPluginsAre("js", "js/prod/closure-advanced/bundle.js", "js/prod/closure-simple/bundle.js", "js/prod/closure-whitespace/bundle.js", "js/prod/combined/bundle.js");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
