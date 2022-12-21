@java.lang.Override
public void onClick(android.view.View v) {
    ma.groupsCompiled.clear();
    ma.getInstituteList();
    try {
        ma.compileInstituteList(ma.institute);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showInstituteChooseDialog();
}
