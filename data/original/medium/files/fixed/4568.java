@ java.lang.Override public void handleEvent ( org.matsim.api.core.v01.events.PersonLeavesVehicleEvent event ) { if ( ! ( event . getVehicleId () . toString () . contains ( "_" ) ) ) { inVehicle . put ( event . getVehicleId () , false ) ; travelTimes . remove ( event . getPersonId () ) ; } } 
