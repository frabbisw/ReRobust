private boolean ifUserGroupKey(com.deloitte.smt.dto.SearchDto searchDto) {
    boolean isUserGroupKey = false;
    try {
        if (!(org.springframework.util.CollectionUtils.isEmpty(searchDto.getUserGroupKeys()))) {
            isUserGroupKey = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isUserGroupKey;
}
