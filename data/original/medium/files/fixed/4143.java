public void setTopic ( java.lang.String topic ) throws java.io.IOException { this . topic = topic ; for ( com.rbruno.irc.templates.Client current : clients ) current . getConnection () . send ( Reply.RPL_TOPIC , current , ( ( ( this . getName () ) + " " ) + ( this . getTopic () ) ) ) ; } 
