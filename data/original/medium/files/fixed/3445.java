public final void moveItem ( T item , int toPosition ) { int fromPosition = mItems . indexOf ( item ) ; mItems . remove ( fromPosition ) ; mItems . add ( toPosition , item ) ; com.github.gfranks.dynamiccard.adapter.DynamicCardAdapter . notifyItemMoved ( fromPosition , toPosition ) ; if ( ( mCallback ) != null ) { mCallback . onDynamicCardPositionChanged ( this , fromPosition , toPosition ) ; } } 
