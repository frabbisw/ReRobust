@java.lang.Override
public net.ssehub.easy.varModel.confModel.IAssignmentState getState() {
    net.ssehub.easy.varModel.confModel.IAssignmentState state = configProvider.getState();
    System.out.println("log");
    return state;
}
