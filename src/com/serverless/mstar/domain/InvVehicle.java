package com.serverless.mstar.domain;

import java.math.BigInteger;

public class InvVehicle {

	private String fundId;
	private String fundLegalName;
	private long fundNetAssets;
	private String globalCategoryName;
	private String globalCategoryAssetClass;
	private String registrationCompany;

	private double actualManagementFee;
	private String morningstarCategory;

	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public String getFundLegalName() {
		return fundLegalName;
	}

	public void setFundLegalName(String fundLegalName) {
		this.fundLegalName = fundLegalName;
	}

	public String getGlobalCategoryName() {
		return globalCategoryName;
	}

	public void setGlobalCategoryName(String globalCategoryName) {
		this.globalCategoryName = globalCategoryName;
	}

	public String getGlobalCategoryAssetClass() {
		return globalCategoryAssetClass;
	}

	public void setGlobalCategoryAssetClass(String globalCategoryAssetClass) {
		this.globalCategoryAssetClass = globalCategoryAssetClass;
	}

	public String getRegistrationCompany() {
		return registrationCompany;
	}

	public void setRegistrationCompany(String registrationCompany) {
		this.registrationCompany = registrationCompany;
	}

	public double getActualManagementFee() {
		return actualManagementFee;
	}

	public void setActualManagementFee(double actualManagementFee) {
		this.actualManagementFee = actualManagementFee;
	}

	public String getMorningstarCategory() {
		return morningstarCategory;
	}

	public void setMorningstarCategory(String morningstarCategory) {
		this.morningstarCategory = morningstarCategory;
	}

	/**
	 * @return the fundNetAssets
	 */
	public long getFundNetAssets() {
		return fundNetAssets;
	}

	/**
	 * @param fundNetAssets
	 *            the fundNetAssets to set
	 */
	public void setFundNetAssets(long fundNetAssets) {
		this.fundNetAssets = fundNetAssets;
	}
}
