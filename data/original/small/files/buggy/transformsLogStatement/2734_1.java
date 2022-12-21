public boolean isAjaxRequest() {
    System.out.println("log");
    java.lang.String ajaxHeader = getCurrentRequest().getHeader("X-Requested-With");
    return "XMLHttpRequest".equals(ajaxHeader);
}
