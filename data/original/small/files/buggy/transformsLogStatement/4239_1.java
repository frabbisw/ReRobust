@com.google.common.eventbus.Subscribe
private void handleLocalModelChangedEvent(seedu.jobs.commons.events.model.TaskBookChangedEvent abce) throws seedu.jobs.model.task.UniqueTaskList.IllegalTimeException {
    System.out.println("log");
    latestTaskAddressBook = new seedu.jobs.model.TaskBook(abce.data);
}
