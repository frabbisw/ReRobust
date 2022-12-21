@java.lang.Override
public java.util.List<com.axon.bank.dao.entity.ApplicantEntity> getLoanApplicants() {
    try {
        java.lang.System.out.println("Not implimented");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.List<com.axon.bank.dao.entity.ApplicantEntity> applicantEntityList = ((java.util.List<com.axon.bank.dao.entity.ApplicantEntity>) (super.getHibernateTemplate().find("from ApplicantEntity")));
    return applicantEntityList;
}
