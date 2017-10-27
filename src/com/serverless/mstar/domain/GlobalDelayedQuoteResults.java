package com.serverless.mstar.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalDelayedQuoteResults {
	@JsonProperty("Outcome")
	private String Outcome;
	@JsonProperty("Message")
	private String Message;
	@JsonProperty("Identity")
	private String Identity;
	@JsonProperty("Delay")
	private double Delay;
	@JsonProperty("Date")
	private String Date;
	@JsonProperty("Time")
	private String Time;
	@JsonProperty("UTCOffset")
	private int UTCOffset;
	@JsonProperty("Open")
	private double Open;
	@JsonProperty("Close")
	private String Close;
	@JsonProperty("High")
	private double High;
	@JsonProperty("Low")
	private double Low;
	@JsonProperty("Last")
	private double Last;
	@JsonProperty("LastSize")
	private int LastSize;
	@JsonProperty("Volume")
	private int Volume;
	@JsonProperty("PreviousClose")
	private double PreviousClose;
	@JsonProperty("PreviousCloseDate")
	private String PreviousCloseDate;
	@JsonProperty("ChangeFromPreviousClose")
	private double ChangeFromPreviousClose;
	@JsonProperty("PercentChangeFromPreviousClose")
	private double PercentChangeFromPreviousClose;
	@JsonProperty("Bid")
	private double Bid;
	@JsonProperty("BidSize")
	private int BidSize;
	@JsonProperty("BidDate")
	private String BidDate;
	@JsonProperty("BidTime")
	private String BidTime;
	@JsonProperty("Ask")
	private int Ask;
	@JsonProperty("AskSize")
	private int AskSize;
	@JsonProperty("AskDate")
	private String AskDate;
	@JsonProperty("AskTime")
	private String AskTime;
	@JsonProperty("High52Weeks")
	private double High52Weeks;
	@JsonProperty("Low52Weeks")
	private double Low52Weeks;
	@JsonProperty("Currency")
	private String Currency;
	@JsonProperty("TradingHalted")
	private boolean TradingHalted;
	@JsonProperty("Securities")
	private List<GlobalDelayedSecurities> Securities;
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
	public double getOpen() {
		return Open;
	}
	public void setOpen(double open) {
		Open = open;
	}
	public String getClose() {
		return Close;
	}
	public void setClose(String close) {
		Close = close;
	}
	public double getHigh() {
		return High;
	}
	public void setHigh(double high) {
		High = high;
	}
	public double getLow() {
		return Low;
	}
	public void setLow(double low) {
		Low = low;
	}
	public double getLast() {
		return Last;
	}
	public void setLast(double last) {
		Last = last;
	}
	public int getLastSize() {
		return LastSize;
	}
	public void setLastSize(int lastSize) {
		LastSize = lastSize;
	}
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		Volume = volume;
	}
	public double getPreviousClose() {
		return PreviousClose;
	}
	public void setPreviousClose(double previousClose) {
		PreviousClose = previousClose;
	}
	public String getPreviousCloseDate() {
		return PreviousCloseDate;
	}
	public void setPreviousCloseDate(String previousCloseDate) {
		PreviousCloseDate = previousCloseDate;
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
	public double getBid() {
		return Bid;
	}
	public void setBid(double bid) {
		Bid = bid;
	}
	public int getBidSize() {
		return BidSize;
	}
	public void setBidSize(int bidSize) {
		BidSize = bidSize;
	}
	public String getBidDate() {
		return BidDate;
	}
	public void setBidDate(String bidDate) {
		BidDate = bidDate;
	}
	public String getBidTime() {
		return BidTime;
	}
	public void setBidTime(String bidTime) {
		BidTime = bidTime;
	}
	public int getAsk() {
		return Ask;
	}
	public void setAsk(int ask) {
		Ask = ask;
	}
	public int getAskSize() {
		return AskSize;
	}
	public void setAskSize(int askSize) {
		AskSize = askSize;
	}
	public String getAskDate() {
		return AskDate;
	}
	public void setAskDate(String askDate) {
		AskDate = askDate;
	}
	public String getAskTime() {
		return AskTime;
	}
	public void setAskTime(String askTime) {
		AskTime = askTime;
	}
	public double getHigh52Weeks() {
		return High52Weeks;
	}
	public void setHigh52Weeks(double high52Weeks) {
		High52Weeks = high52Weeks;
	}
	public double getLow52Weeks() {
		return Low52Weeks;
	}
	public void setLow52Weeks(double low52Weeks) {
		Low52Weeks = low52Weeks;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public boolean isTradingHalted() {
		return TradingHalted;
	}
	public void setTradingHalted(boolean tradingHalted) {
		TradingHalted = tradingHalted;
	}
	public List<GlobalDelayedSecurities> getSecurities() {
		return Securities;
	}
	public void setSecurities(List<GlobalDelayedSecurities> securities) {
		Securities = securities;
	}

}
