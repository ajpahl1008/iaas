package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.widget.Info;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.event.shared.UmbrellaException;


public class CustomUncaughtExceptionHandler implements UncaughtExceptionHandler {
	public void onUncaughtException( Throwable e ) {
	    // Get rid of UmbrellaException
	    Throwable exceptionToDisplay = getExceptionToDisplay( e );
	    // Replace with your favorite message dialog, e.g. GXT's MessageBox
	    //Window.alert( exceptionToDisplay.getMessage() );
	    Info.display("Uncaught Exception", exceptionToDisplay.getMessage());
	  }

	  private static Throwable getExceptionToDisplay( Throwable throwable ) {
	    Throwable result = throwable;
	    if (throwable instanceof UmbrellaException && ((UmbrellaException) throwable).getCauses().size() == 1) {
	      result = ((UmbrellaException) throwable).getCauses().iterator().next();
	    }
	    return result;
	  }
}
