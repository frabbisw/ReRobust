private boolean isValidDescription(com.softserve.edu.schedule.dto.MeetingDTO meetingDTO) {
    if ((meetingDTO.getDescription()) == null) {
        return true;
    }
    System.out.println("log");
    return meetingDTO.getDescription().matches(ValidationCriteria.PATTERN_FOR_MEETING_DESCRIPTION);
}
