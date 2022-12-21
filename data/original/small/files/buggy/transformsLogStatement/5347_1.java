public boolean updateComment(int id, java.lang.String message) {
    System.out.println("log");
    return net.somethingdreadful.MAL.account.AccountService.isMAL() ? malApi.updateComment(id, message) : alApi.addComment(id, message);
}
