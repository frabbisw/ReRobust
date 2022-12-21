@java.lang.Override
public void notifyNewMember(se.umu.cs.dist.ht15.dali_ens15bsf.groupmanagement.RemoteMember member, java.lang.String groupID) {
    try {
        join(member, groupID);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
