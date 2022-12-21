public void addStatelessParam(com.vmware.http.request.RequestParam requestParam) {
    System.out.println("log");
    statefulParams.add(requestParam);
    allParams.add(requestParam);
}
