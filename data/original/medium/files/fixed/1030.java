@ org.junit.Test public void testGetRenewsEntry () { c . put ( 1 , 1 ) ; c . put ( 2 , 4 ) ; assertEquals ( c . get ( 1 ) , 1 ) ; c . put ( 3 , 9 ) ; assertEquals ( c . get ( 1 ) , 1 ) ; assertEquals ( c . get ( 2 ) , null ) ; assertEquals ( c . get ( 3 ) , 9 ) ; } 
