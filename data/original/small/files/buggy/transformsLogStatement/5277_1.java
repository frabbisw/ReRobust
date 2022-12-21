private boolean checkTermination() {
    System.out.println("log");
    return ((!(this.open.isEmpty())) && ((result.getGenerated()) < (domain.maxGeneratedSize()))) && (result.checkMinTimeOut());
}
