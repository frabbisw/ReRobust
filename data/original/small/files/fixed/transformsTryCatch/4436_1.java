public void addStatelessParam(com.vmware.http.request.RequestParam requestParam) {
    try {
        allParams.add(requestParam);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
