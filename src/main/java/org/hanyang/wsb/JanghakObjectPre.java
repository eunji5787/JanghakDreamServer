package org.hanyang.wsb;

public class JanghakObjectPre {
	
public String janghakname;
public String foundation;
public String weblink;
public String payamount;
public String allmark;
public String lastmark;
public String local;
public String school;
public String startsemester;
public String endsemester;
public String major;
public String sex;
public String incomerank;
public String meritman;
public String startdate;
public String enddate;
public String dday;


// Must have no-argument constructor
public JanghakObjectPre() {

}

public JanghakObjectPre(String janghakname, String foundation, String payamount,
                     String weblink,String startsemester, String endsemester,
                     String allmark, String lastmark, String local, String school,
                     String major, String sex, String incomerank, String meritman,
                     String startdate, String enddate, String dday)
{
    this.janghakname = janghakname;
    this.foundation = foundation;
    this.payamount = payamount;
    this.weblink = weblink;
    this.allmark = allmark;
    this.lastmark = lastmark;
    this.local = local;
    this.school = school;
    this.major = major;
    this.sex = sex;
    this.startsemester = startsemester;
    this.endsemester = endsemester;
    this.incomerank = incomerank;
    this.meritman = meritman;
    this.startdate = startdate;
    this.enddate = enddate;
    this.dday = dday;
}

public String getJanghakname() {
	return janghakname;
}

public void setJanghakname(String janghakname) {
	this.janghakname = janghakname;
}

public String getFoundation() {
	return foundation;
}

public void setFoundation(String foundation) {
	this.foundation = foundation;
}

public String getWeblink() {
	return weblink;
}

public void setWeblink(String weblink) {
	this.weblink = weblink;
}

public String getPayamount() {
	return payamount;
}

public void setPayamount(String payamount) {
	this.payamount = payamount;
}

public String getAllmark() {
	return allmark;
}

public void setAllmark(String allmark) {
	this.allmark = allmark;
}

public String getLastmark() {
	return lastmark;
}

public void setLastmark(String lastmark) {
	this.lastmark = lastmark;
}

public String getLocal() {
	return local;
}

public void setLocal(String local) {
	this.local = local;
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school = school;
}

public String getStartsemester() {
	return startsemester;
}

public void setStartsemester(String startsemester) {
	this.startsemester = startsemester;
}

public String getEndsemester() {
	return endsemester;
}

public void setEndsemester(String endsemester) {
	this.endsemester = endsemester;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public String getIncomerank() {
	return incomerank;
}

public void setIncomerank(String incomerank) {
	this.incomerank = incomerank;
}

public String getMeritman() {
	return meritman;
}

public void setMeritman(String meritman) {
	this.meritman = meritman;
}

public String getStartdate() {
	return startdate;
}

public void setStartdate(String startdate) {
	this.startdate = startdate;
}

public String getEnddate() {
	return enddate;
}

public void setEnddate(String enddate) {
	this.enddate = enddate;
}

public String getDday() {
	return dday;
}

public void setDday(String dday) {
	this.dday = dday;
}

}
