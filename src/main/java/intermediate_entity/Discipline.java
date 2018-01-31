package intermediate_entity;

import java.util.HashSet;
import java.util.Set;

public class Discipline {

    private int discId;
    private String name;
    private int credits;
    private Set<DisciplineCourse> discCourse = new HashSet<DisciplineCourse>();

    public Discipline() {}

    public Discipline(int discId, String name, int credits) {
    	this.discId = discId;
    	this.name = name;
        this.credits = credits;
    }

    public int getDiscId() {
		return discId;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<DisciplineCourse> getDiscCourse() {
		return discCourse;
	}

	public void setDiscCourse(Set<DisciplineCourse> discCourse) {
		this.discCourse = discCourse;
	}

	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

		if (!this.getClass().equals(obj.getClass())) {
            return false;
        }

        Discipline obj2 = (Discipline)obj;

        if (this.discId == obj2.getDiscId() &&
               this.name.equals(obj2.getName()) &&
                   this.credits == obj2.getCredits()) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return (discId + name + credits).hashCode();
    }

}