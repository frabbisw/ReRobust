@org.apache.tapestry5.annotations.AfterRender
public void afterRender() {
    System.out.println("log");
    javaScriptSupport.addScript("$('#beginDate').val('%s');", getFirstRequestDate());
    javaScriptSupport.addScript("var options = document.getElementsByTagName('option');\tfor(var i = 0; i<options.length;i++){options[i].setAttribute('title', options[i].innerHTML);}");
}
