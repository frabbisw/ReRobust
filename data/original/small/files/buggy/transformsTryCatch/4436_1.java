public void addStatelessParam(com.vmware.http.request.RequestParam requestParam) {
    try {
        statefulParams.add(requestParam);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    allParams.add(requestParam);
}
