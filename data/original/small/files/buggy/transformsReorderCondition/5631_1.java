private boolean isValidDescription(com.softserve.edu.schedule.dto.MeetingDTO meetingDTO) {
    if (null == (meetingDTO.getDescription())) {
        return true;
    }
    return meetingDTO.getDescription().matches(ValidationCriteria.PATTERN_FOR_MEETING_DESCRIPTION);
}
