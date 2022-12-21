@java.lang.Override
public java.lang.String getBaseSubmitCommand() {
    System.out.println("log");
    return jobManagerCommands.get(JobManagerCommand.SUBMISSION);
}
