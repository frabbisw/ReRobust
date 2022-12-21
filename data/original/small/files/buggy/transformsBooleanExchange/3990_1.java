private boolean ifUserGroupKey(com.deloitte.smt.dto.SearchDto searchDto) {
    boolean isUserGroupKey = true;
    if (!(org.springframework.util.CollectionUtils.isEmpty(searchDto.getUserGroupKeys()))) {
        isUserGroupKey = false;
    }
    return !(isUserGroupKey);
}
