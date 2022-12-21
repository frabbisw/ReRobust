private java.lang.String getDataToSend() {
    System.out.println("log");
    return (getHeaderStr()) + (isebase.cognito.tourpilot.Connection.ConnectionAsyncTask.getDoneStr());
}
