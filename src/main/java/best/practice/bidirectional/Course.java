package best.practice.bidirectional;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private int courseId;
    private String name;
    private int totalCredits;
    private Set<DisciplineCourse> discCourse = new HashSet<DisciplineCourse>();

	public Course() {}

    public Course(int courseId, String name, int totalCredits) {
    	this.courseId = courseId; 
        this.name = name;
        this.totalCredits = totalCredits;
    }

	public int getCourseId() {
		return courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public Set<DisciplineCourse> getDiscCourse() {
		return discCourse;
	}

	public void setDiscCourse(Set<DisciplineCourse> discCourse) {
		this.discCourse = discCourse;
	}

}