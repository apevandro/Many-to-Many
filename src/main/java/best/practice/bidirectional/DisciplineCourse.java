package best.practice.bidirectional;

public class DisciplineCourse {

	private int id;
	private int duration;
	private String title;
	
	private Course course;
	private Discipline discipline;
	
	public DisciplineCourse() {}
	
	public DisciplineCourse(int id, int duration, String title) {
		this.id = id;
		this.duration = duration;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
		course.getDiscCourse().add(this);
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
		discipline.getDiscCourse().add(this);
	}

}