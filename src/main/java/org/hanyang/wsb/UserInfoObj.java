package org.hanyang.wsb;

public class UserInfoObj {
	
	public String school;
	public Integer year;
	public Boolean male;
	public Boolean female;
	public String grade;
	public Boolean pfive;
	public Boolean pthree;
	public String incomerank;
	public Boolean merityes;
	public Boolean meritno;
	
	public UserInfoObj(String school, 
			Integer year, Boolean male, Boolean female,
			String grade, Boolean pfive, Boolean pthree, 
			String incomerank, Boolean merityes, Boolean meritno){
		
		this.school = school;
		this.year = year;
		this.male = male;
		this.female = female;
		this.grade = grade;
		this.pfive = pfive;
		this.pthree = pthree;
		this.incomerank = incomerank;
		this.merityes = merityes;
		this.meritno = meritno;
		
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
	
	public Boolean getMale() {
		return male;
	}
	
	public void setMale(Boolean male) {
		this.male = male;
	}
	
	public Boolean getFemale() {
		return female;
	}
	
	public void setFemale(Boolean female) {
		this.female = female;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Boolean getPfive() {
		return pfive;
	}
	
	public void setPfive(Boolean pfive) {
		this.pfive = pfive;
	}
	
	public Boolean getPthree() {
		return pthree;
	}
	
	public void setPthree(Boolean pthree) {
		this.pthree = pthree;
	}
	
	public String getIncomerank() {
		return incomerank;
	}
	
	public void setIncomerank(String incomerank) {
		this.incomerank = incomerank;
	}
	
	public Boolean getMerityes() {
		return merityes;
	}
	
	public void setMerityes(Boolean merityes) {
		this.merityes = merityes;
	}
	
	public Boolean getMeritno() {
		return meritno;
	}
	
	public void setMeritno(Boolean meritno) {
		this.meritno = meritno;
	}

}
