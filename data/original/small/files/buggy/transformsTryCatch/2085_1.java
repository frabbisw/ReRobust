public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.cloudml.deployer2.workflow.ConcurrentDeployment deployment = new org.cloudml.deployer2.workflow.ConcurrentDeployment("c:\\Users\\Maksym\\Dropbox\\Documents\\Master thesis papers\\ec2.json");
    try {
        java.lang.System.out.println(org.cloudml.deployer2.workflow.util.ActivityBuilder.getActivity().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
