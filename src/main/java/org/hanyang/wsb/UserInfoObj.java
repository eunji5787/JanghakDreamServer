package org.hanyang.wsb;

public class UserInfoObj {
	
	public String school;
	public Integer year;
	public Integer sex;
	public String grade;
	public Integer scoretype;
	public String incomerank;
	public Integer meritman;
	
	public UserInfoObj(String school, Integer year, Integer sex,
			String grade, Integer scoretype, String incomerank, Integer meritman){
		
		this.school = school;
		this.year = year;
		this.sex = sex;
		this.grade = grade;
		this.scoretype = scoretype;
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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getScoretype() {
		return scoretype;
	}

	public void setScoretype(Integer scoretype) {
		this.scoretype = scoretype;
	}

	public String getIncomerank() {
		return incomerank;
	}

	public void setIncomerank(String incomerank) {
		this.incomerank = incomerank;
	}

	public Integer getMeritman() {
		return meritman;
	}

	public void setMeritman(Integer meritman) {
		this.meritman = meritman;
	}
}
