package org.hanyang.wsb;

public class JanghakObject {
	
	private String foundation;
	private Integer payamount;
	private String allgrade;
	private String lastgrade;
	private String region;
	private String school;
	private String major;
	private String sex;
	private String incomerank;
	private String meritman;
	private String startdate;
	private String enddate;
	
	// Must have no-argument constructor
	public JanghakObject() {

	}

	public JanghakObject(String fd, Integer pa) {
		this.foundation = fd;
		this.payamount = pa;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation ;
	}

	public String getFoundation() {
		return this.foundation;
	}
	
	public void setPayamount(Integer payamount) {
		this.payamount = payamount ;
	}

	public Integer getPayamount() {
		return this.payamount;
	}
	
	
	@Override
	public String toString() {
		return new StringBuffer(" Foundation : ").append(this.foundation)
				.append(" Payamount : ").append(this.payamount).toString();
	}


}
