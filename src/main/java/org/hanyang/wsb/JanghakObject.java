package org.hanyang.wsb;

public class JanghakObject {
	
public String janghakname;
public String foundation;
public String weblink;
public String payamount;
public String allgrade;
public String lastgrade;
public String region;
public String school;
public String startsemester;
public String endsemester;
public String major;
public String sex;
public String incomerank;
public String meritman;
public String startdate;
public String enddate;


// Must have no-argument constructor
public JanghakObject() {

}

public JanghakObject(String janghakname, String foundation, String payamount,
                     String weblink,String startsemester, String endsemester,
                     String allgrade, String lastgrade, String region, String school,
                     String major, String sex, String incomerank, String meritman,
                     String startdate, String enddate)
{
    this.janghakname = janghakname;
    this.foundation = foundation;
    this.payamount = payamount;
    this.weblink = weblink;
    this.allgrade = allgrade;
    this.lastgrade = lastgrade;
    this.region = region;
    this.school = school;
    this.major = major;
    this.sex = sex;
    this.startsemester = startsemester;
    this.endsemester = endsemester;
    this.incomerank = incomerank;
    this.meritman = meritman;
    this.startdate = startdate;
    this.enddate = enddate;
}


public String getEnddate() {
    return enddate;
}

public void setEnddate(String enddate) {
    this.enddate = enddate;
}

public String getStartdate() {
    return startdate;
}

public void setStartdate(String startdate) {
    this.startdate = startdate;
}

public String getMeritman() {
    return meritman;
}

public void setMeritman(String meritman) {
    this.meritman = meritman;
}

public String getIncomerank() {
    return incomerank;
}

public void setIncomerank(String incomerank) {
    this.incomerank = incomerank;
}

public String getSex() {
    return sex;
}

public void setSex(String sex) {
    this.sex = sex;
}

public String getMajor() {
    return major;
}

public void setMajor(String major) {
    this.major = major;
}

public String getEndsemester() {
    return endsemester;
}

public void setEndsemester(String endsemester) {
    this.endsemester = endsemester;
}

public String getStartsemester() {
    return startsemester;
}

public void setStartsemester(String startsemester) {
    this.startsemester = startsemester;
}

public String getSchool() {
    return school;
}

public void setSchool(String school) {
    this.school = school;
}

public String getRegion() {
    return region;
}

public void setRegion(String region) {
    this.region = region;
}

public String getLastgrade() {
    return lastgrade;
}

public void setLastgrade(String lastgrade) {
    this.lastgrade = lastgrade;
}

public String getAllgrade() {
    return allgrade;
}

public void setAllgrade(String allgrade) {
    this.allgrade = allgrade;
}

public String getPayamount() {
    return payamount;
}

public void setPayamount(String payamount) {
    this.payamount = payamount;
}

public String getWeblink() {
    return weblink;
}

public void setWeblink(String weblink) {
    this.weblink = weblink;
}

public String getFoundation() {
    return foundation;
}

public void setFoundation(String foundation) {
    this.foundation = foundation;
}

public String getJanghakname() {
    return janghakname;
}

public void setJanghakname(String janghakname) {
    this.janghakname = janghakname;
}

	@Override
	public String toString() {
		return new StringBuffer(" Foundation : ").append(this.foundation)
				.append(" Payamount : ").append(this.payamount).toString();
	}


}
