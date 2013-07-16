package com.pahlsoft.iaas.ui.client;

public class Enums {
	public enum CategoryType {
	    X_LARGE("X_LARGE"), LARGE("LARGE"), MEDIUM("MEDIUM"), SMALL("SMALL"), X_SMALL("X_SMALL");

	    private String name;

	    CategoryType(String name) {
	        this.name = name;
	    }

	    public String toString() {
	        return name;
	    }
	}
	
	public enum StatusType {
	    ARCHIVING("ARCHIVING"),
	    BUILD("BUILD"),
	    DEPLOY("DEPLOY"),
	    OFFLINE("OFFLINE"),
	    ONLINE("ONLINE"),
	    PROVISION("PROVISION");
	   
	    private String name;

	    StatusType(String name) {
	        this.name = name;
	    }

	    public String toString() {
	        return name;
	    }
	}
	
	public enum OperatingSystemType {
		AIX71("AIX7.1"),
		AIX61("AIX6.1"),
		AIX53("AIX5.3"),
		WIN2003("WIN2003"),
		WIN2008("WIN2008"),
		WIN7("WIN7"),
		WINXP("WINXP"),
		SOLARIS("Solaris"),
		RHEL61("RHEL6.1"),
		RHEL55("RHEL5.5");
		
		private String osName;
		
		OperatingSystemType(String osName) {
			this.osName = osName;
		}
		
		public String toString() {
			return osName;
		}
		
	}
	
	public enum ReportType {
		TODAY("TODAY"),
		YESTERDAY("YESTERDAY"),
		LASTWEEK("LASTWEEK"),
		LASTMONTH("LASTMONTH");
		
		private String reportType;
		
		ReportType(String reportType) {
			this.reportType=reportType;
		}
		
		public String toString() {
			return reportType;
		}
		
	}
}
