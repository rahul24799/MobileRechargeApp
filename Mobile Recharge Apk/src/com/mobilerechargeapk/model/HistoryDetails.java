package com.mobilerechargeapk.model;

import java.util.Date;
import java.util.Objects;

public class HistoryDetails {
	
	private int userId;
	private int operatorId;
	private long mobileNumber;
	private int planId;
	private Date rechargeDate;
	
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public Date getRechargeDate() {
		return rechargeDate;
	}
	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	
	
	public HistoryDetails(int userId, int operatorId, long mobileNumber, int planId, Date rechargeDate) {
		super();
		this.userId = userId;
		this.operatorId = operatorId;
		this.mobileNumber = mobileNumber;
		this.planId = planId;
		this.rechargeDate = rechargeDate;
	}
	public HistoryDetails() {
		super();
		
	}
	@Override
	public String toString() {
		return "HistoryDetails [userId=" + userId + ", operatorId=" + operatorId + ", mobileNumber=" + mobileNumber
				+ ", planId=" + planId + ", rechargeDate=" + rechargeDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber, operatorId, planId, rechargeDate, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoryDetails other = (HistoryDetails) obj;
		return mobileNumber == other.mobileNumber && operatorId == other.operatorId && planId == other.planId
				&& Objects.equals(rechargeDate, other.rechargeDate) && userId == other.userId;
	}
	
	
	
}
