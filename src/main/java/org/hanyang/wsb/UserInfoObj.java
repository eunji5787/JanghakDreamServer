package org.hanyang.wsb;

public class UserInfoObj {
	
	public String school;
	public Integer year;
	public Integer local;
	public Integer sex;
	public String allmark;
	public Integer scoretype1;
	public String nowmark;
	public Integer scoretype2;
	public Integer incomerank;
	public Integer meritman;

	public UserInfoObj(String school, Integer year, Integer local, Integer sex,
			String allmark, Integer scoretype1,
			String nowmark, Integer scoretype2, Integer incomerank, Integer meritman){
		
		this.school = school;
		this.year = year;
		this.local = local;
		this.sex = sex;
		this.allmark= allmark;
		this.scoretype2 = scoretype1;
		this.nowmark = nowmark;
		this.scoretype2 = scoretype2;
		this.incomerank = incomerank;
		this.meritman = meritman;
		
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getLocal() {
		return local;
	}

	public void setLocal(Integer local) {
		this.local = local;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAllmark() {
		return allmark;
	}

	public void setAllmark(String allmark) {
		this.allmark = allmark;
	}

	public Integer getScoretype1() {
		return scoretype1;
	}

	public void setScoretype1(Integer scoretype1) {
		this.scoretype1 = scoretype1;
	}

	public String getNowmark() {
		return nowmark;
	}

	public void setNowmark(String nowmark) {
		this.nowmark = nowmark;
	}

	public Integer getScoretype2() {
		return scoretype2;
	}

	public void setScoretype2(Integer scoretype2) {
		this.scoretype2 = scoretype2;
	}

	public Integer getIncomerank() {
		return incomerank;
	}

	public void setIncomerank(Integer incomerank) {
		this.incomerank = incomerank;
	}

	public Integer getMeritman() {
		return meritman;
	}

	public void setMeritman(Integer meritman) {
		this.meritman = meritman;
	}
}
