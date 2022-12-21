@java.lang.Override
public void getAllTypeJob(com.hbbsolution.owner.model.TypeJobResponse typeJobResponse) {
    try {
        com.hbbsolution.owner.utils.Constants.listTypeJob = typeJobResponse.getData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
