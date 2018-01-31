package intermediate_entity;

import java.io.Serializable;

public class DisciplineCourse {

	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;

		private int time;
		private Integer courseId;
		private Integer discId;

		public Id() {}

		public Id(int courseId, int discId) {
			this.courseId = courseId;
			this.discId = discId;
		}
		
		public boolean equals(Object obj) {
	        if (obj != null && obj instanceof Id) {
	        	final Id other = (Id)obj;
	            return other.courseId.equals(courseId) && other.discId.equals(discId);	
	        } else {
	        	return false;
	        }
	    }

	    public int hashCode() {
	    	Integer i = Integer.valueOf(courseId + discId);
	    	return i.hashCode();
	    }
	}

	private Id id = new Id();
	private String title;
	private Course course;
	private Discipline discipline;
	
	public DisciplineCourse() {}
	
	public DisciplineCourse(int time, String title, Course course, Discipline discipline) {
		this.id.time = time;
		this.title = title;
		this.course = course;
		this.discipline = discipline;
		this.id.courseId = this.course.getCourseId();
		this.id.discId = this.discipline.getDiscId();
		course.getDiscCourse().add(this);      // guarantee referential integrity
		discipline.getDiscCourse().add(this);  // guarantee referential integrity
	}
	
	public int getTime() {
		return this.id.time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

}