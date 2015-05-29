package org.hanyang.wsb;

public class JanghakObject {
	
public String janghakname;
public String foundation;
public String weblink;
public String payamount;
public String downloadlink;
public String startdate;

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

public String getDownloadlink() {
	return downloadlink;
}

public void setDownloadlink(String downloadlink) {
	this.downloadlink = downloadlink;
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

public String enddate;
public String dday;


// Must have no-argument constructor

public JanghakObject() {

}

public JanghakObject(String janghakname, String foundation, String payamount,
                     String weblink, String downloadlink,
                     String startdate, String enddate, String dday)
{
    this.janghakname = janghakname;
    this.foundation = foundation;
    this.payamount = payamount;
    this.downloadlink = downloadlink;
    this.weblink = weblink;
    this.startdate = startdate;
    this.enddate = enddate;
    this.dday = dday;
}

}
