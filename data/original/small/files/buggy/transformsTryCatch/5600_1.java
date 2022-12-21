public static java.lang.String deleteGroup(java.lang.Long surveyId, java.lang.Long groupId) {
    java.lang.String groupUrl = helpers.GroupHelper.getDeleteGroupUrl(surveyId, groupId);
    try {
        java.lang.System.out.println(("groupUrl:" + groupUrl));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sendDelete(groupUrl, 200).getResponse();
}
