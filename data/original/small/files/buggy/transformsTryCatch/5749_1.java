public void removeCalendarEventProvider(org.wilson.world.festival.CalendarEventProvider provider) {
    try {
        if ((provider != null) && ((provider.getName()) != null)) {
            this.providers.remove(provider.getName(), provider);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
