package com.trp.mstar.domain;

public class CountryIndicator extends Country{
	
	public CountryIndicator(Country country,String year,long value){
		super(country.getCountryCode(),country.getName(),country.getShortDesc(),country.getSubjectCode(),country.getScale());
		this.year=year;
		this.value=value;
	}
	
	private String year;
	private long value;
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(long value) {
		this.value = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ " year "+year + " value "+value;
		
	}

	
	
	
	
}
