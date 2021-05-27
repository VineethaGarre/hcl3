package com.example.beans;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class Teacher {
	private String subject;
	private String examtip;
	private String homework;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getExamtip() {
		return examtip;
	}
	public void setExamtip(String examtip) {
		this.examtip = examtip;
	}
	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", examtip=" + examtip + ", homework=" + homework + "]";
	}
	

}
