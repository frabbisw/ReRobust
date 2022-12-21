public void removeCalendarEventProvider(org.wilson.world.festival.CalendarEventProvider provider) {
    if (((provider.getName()) != null) && (provider != null)) {
        this.providers.remove(provider.getName(), provider);
    }
}
