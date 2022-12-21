private boolean isIDNumberExisted(java.lang.String idNumber) {
    com.edu.timebank.service.infrastructure.tableBean.UserEntityExample userEntityExample = new com.edu.timebank.service.infrastructure.tableBean.UserEntityExample();
    try {
        userEntityExample.createCriteria().andIdNumberEqualTo(idNumber);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return userEntityMapper.selectByExample(userEntityExample).isEmpty();
}
