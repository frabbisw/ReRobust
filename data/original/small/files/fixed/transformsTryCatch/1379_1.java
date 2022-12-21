private boolean setCalendarList(org.apache.wicket.core.request.handler.IPartialPageRequestHandler target) {
    type = org.apache.openmeetings.web.user.calendar.CalendarDialog.DIALOG_TYPE.SYNC_CALENDAR;
    org.apache.openmeetings.service.calendar.caldav.AppointmentManager appointmentManager = calendarPanel.getAppointmentManager();
    try {
        cals = appointmentManager.getCalendars();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    appointmentManager.createHttpClient();
    calIndex = 0;
    setButtons(target);
    return setFormModelObject();
}
