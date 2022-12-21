private boolean isValidDescription(com.softserve.edu.schedule.dto.MeetingDTO meetingDTO) {
    try {
        if ((meetingDTO.getDescription()) == null) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return meetingDTO.getDescription().matches(ValidationCriteria.PATTERN_FOR_MEETING_DESCRIPTION);
}
