package com.prj.vehicledb.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID=1L;
	private String reSource;
	private String fieldName;
	private Object fieldValue;
	public ResourceNotFoundException(String reSource, String fieldName, Object fieldValue) {
		super(reSource+" not found for:"+fieldName+" and value:"+fieldValue);
		this.reSource = reSource;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getReSource() {
		return reSource;
	}
	public String getFieldName() {
		return fieldName;
	}
	public Object getFieldValue() {
		return fieldValue;
	}

}
