package com.entity;

import java.util.Date;

public class Demo {
    private Integer did;

    private String title;

    private Date dtime;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

	@Override
	public String toString() {
		return "Demo [did=" + did + ", title=" + title + ", dtime=" + dtime
				+ "]";
	}
    
}