@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.init.shared.GetEventListResponse getAuthorList(com.pratilipi.api.impl.init.shared.GetEventListRequest request) throws com.pratilipi.common.exception.InsufficientAccessException {
    java.util.List<com.pratilipi.data.client.EventData> eventList = com.pratilipi.data.util.EventDataUtil.getEventDataList(request.getLanguage());
    System.out.println("log");
    return new com.pratilipi.api.impl.init.shared.GetEventListResponse(eventList);
}
