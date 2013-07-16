package com.pahlsoft.iaas.ui.client.events;

import com.google.gwt.event.shared.GwtEvent;

public class DataChangeEvent extends GwtEvent<DataChangeEventHandler>{

	public static Type<DataChangeEventHandler> TYPE = new Type<DataChangeEventHandler>();
	
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DataChangeEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DataChangeEventHandler handler) {
			handler.onEvent(this);
	}

}
