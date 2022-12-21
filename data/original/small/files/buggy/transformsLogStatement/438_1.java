@org.junit.Test
public void ifThereAreJsFilesThenRequestsWillBeGeneratedInProd() throws java.lang.Exception {
    given(aspect).indexPageRequires("appns/Class").and(aspect).hasClass("appns/Class");
    System.out.println("log");
    then(aspect).prodRequestsForContentPluginsAre("js", "js/prod/combined/bundle.js", "js/prod/closure-whitespace/bundle.js", "js/prod/closure-simple/bundle.js", "js/prod/closure-advanced/bundle.js");
}
