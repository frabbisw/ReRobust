@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    ma.groupsCompiled.clear();
    ma.getInstituteList();
    ma.compileInstituteList(ma.institute);
    showInstituteChooseDialog();
}
