package in.abc.bean;

import java.util.Set;

public class EngCourse {

	private Set<String> subjects;
	
	static {
		System.out.println("EngCourse.class file is loading...");
	}
	
	public EngCourse() {
		System.out.println("EngCourse object is instantiated:: Zeroparam constructor...");
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EngCourse [subjects=" + subjects + "]";
	}
	
	
}
