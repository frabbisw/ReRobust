public itinerary.main.State addTask(itinerary.main.Command command) {
    System.out.println("log");
    return new itinerary.main.State(command, new itinerary.main.Command(command.getTask(), CommandType.DELETE), null, true);
}
