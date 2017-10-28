package com.serverless.mstar.domain;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MarketMovers {
	@JsonProperty("Outcome")
	private String Outcome;
	@JsonProperty("Message")
	private String Message;
	@JsonProperty("Identity")
	private String Identity;
	@JsonProperty("Delay")
	private double Delay;
	@JsonProperty("MarketMoverType")
	private String MarketMoverType;
	@JsonProperty("Symbol")
	private String Symbol;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("InstrumentClass")
	private String InstrumentClass;
	@JsonProperty("Market")
	private String Market;
	@JsonProperty("MarketIdentificationCode")
	private String MarketIdentificationCode;
	@JsonProperty("Date")
	private String Date;
	@JsonProperty("Time")
	private String Time;
	@JsonProperty("UTCOffset")
	private int UTCOffset;
	@JsonProperty("Last")
	private double Last;
	@JsonProperty("ChangeFromPreviousClose")
	private double ChangeFromPreviousClose;
	@JsonProperty("PercentChangeFromPreviousClose")
	private double PercentChangeFromPreviousClose;
	@JsonProperty("Volume")
	private int Volume;
	@JsonProperty("Currency")
	private String Currency;
	public String getOutcome() {
		return Outcome;
	}
	public void setOutcome(String outcome) {
		Outcome = outcome;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public double getDelay() {
		return Delay;
	}
	public void setDelay(double delay) {
		Delay = delay;
	}
	public String getMarketMoverType() {
		return MarketMoverType;
	}
	public void setMarketMoverType(String marketMoverType) {
		MarketMoverType = marketMoverType;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getInstrumentClass() {
		return InstrumentClass;
	}
	public void setInstrumentClass(String instrumentClass) {
		InstrumentClass = instrumentClass;
	}
	public String getMarket() {
		return Market;
	}
	public void setMarket(String market) {
		Market = market;
	}
	public String getMarketIdentificationCode() {
		return MarketIdentificationCode;
	}
	public void setMarketIdentificationCode(String marketIdentificationCode) {
		MarketIdentificationCode = marketIdentificationCode;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getUTCOffset() {
		return UTCOffset;
	}
	public void setUTCOffset(int uTCOffset) {
		UTCOffset = uTCOffset;
	}
	public double getLast() {
		return Last;
	}
	public void setLast(double last) {
		Last = last;
	}
	public double getChangeFromPreviousClose() {
		return ChangeFromPreviousClose;
	}
	public void setChangeFromPreviousClose(double changeFromPreviousClose) {
		ChangeFromPreviousClose = changeFromPreviousClose;
	}
	public double getPercentChangeFromPreviousClose() {
		return PercentChangeFromPreviousClose;
	}
	public void setPercentChangeFromPreviousClose(double percentChangeFromPreviousClose) {
		PercentChangeFromPreviousClose = percentChangeFromPreviousClose;
	}
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		Volume = volume;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	
}
