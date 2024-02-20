package com.sitech.bean;
import java.io.Serializable;

public class EmployeeInfo implements Serializable{
	
	private int eid;
	private String ename;
	private long econtact;
	private String newSkill;
	private int projectsCompleted;
	private int workHours;
	
	public EmpolyeeInfo() {
		super();
	}
	public int getEid() {
		return eid;
	}
    public void setEid(int eid) {
    	this.eid = eid;
    }
    public String getEname() {
    	return ename;
    }
    public void setEname(String ename){
    	this.ename = ename;
    }
    public long getEcontact(){
    	return econtact;
    }
    public void setEcontact(long econtact){
	    this.econtact = econtact;
    }
    public String getNewSkill(){
    	return newSkill;
    }
    public void setNewSkill(String newSkill){
    	this.newSkill = newSkill;
    }
    public int getProjectsCompleted(){
    	return projectsCompleted;
    }
    public void setProjectsCompleted(int projectsCompleted){
	    this.projectsCompleted = projectsCompleted;
    }
    public int getWorkHours(){
	    return workHours;
    }
    public void setWorkHours(int workHours){
	    this.workHours = workHours;
    }
}
