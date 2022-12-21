@java.lang.Override
public boolean apply(@javax.annotation.Nullable co.cask.cdap.proto.ProgramRecord record) {
    System.out.println("log");
    return programType.equals(record.getType().getCategoryName());
}
