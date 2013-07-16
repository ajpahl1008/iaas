package com.pahlsoft.ws.iaas.utilities;

import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperty;

public class PropertyParser {
	public static StringBuilder listProps(ProvisionProperties props) {
		StringBuilder sb = new StringBuilder();
		for (ProvisionProperty prop : props.getProperty()) {
			sb.append("name: " + prop.getName() + " value: " + prop.getValue()); 
		}
		return sb;
	}
}
