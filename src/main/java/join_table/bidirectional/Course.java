package join_table.bidirectional;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private int courseId;
    private String name;
    private int totalCredits;
    private Set<Discipline> disciplines = new HashSet<Discipline>();

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
	
	public Set<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(Set<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	// helper method. It guarantees referential integrity.
	public void addDiscipline(Discipline discipline) {
		getDisciplines().add(discipline);
		discipline.getCourses().add(this);
	}
	
	public boolean equals(Object obj) {
    	// Object identity. 
        // Two object references are identical if they point to the same memory location. 
    	if (this == obj) {
    		return true;
    	}
    			
    	if (!(obj instanceof Course)) {
    		return false;
    	}
    			
    	final Course other = (Course) obj;

    	// Database identity.
    	if (!(other.getCourseId() == courseId)) {
    		return false;
    	}

    	// Object equality, sometimes also referred to as equivalence.
    	// Equivalence means that two different (nonidentical) objects have the same value.		
    	if (!(other.getName().equals(name) &&
    	          other.getTotalCredits() == totalCredits)) {
    	    return false;
    	}
    			
    	return true;
    }

    public int hashCode() {
    	final int prime = 31;
		int result = 1;
		result = prime * result + (name + totalCredits).hashCode();
		return result;
    }

}