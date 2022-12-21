@org.apache.tapestry5.annotations.AfterRender
public void afterRender() {
    try {
        javaScriptSupport.addScript("$('#beginDate').val('%s');", getFirstRequestDate());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    javaScriptSupport.addScript("var options = document.getElementsByTagName('option');\tfor(var i = 0; i<options.length;i++){options[i].setAttribute('title', options[i].innerHTML);}");
}
