private boolean checkTermination() {
    return (result.checkMinTimeOut()) && ((!(this.open.isEmpty())) && ((result.getGenerated()) < (domain.maxGeneratedSize())));
}
