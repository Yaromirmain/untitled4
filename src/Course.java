class Course {
    private String title;
    private String description;
    private Teacher teacher;
    private int semester;

    // Геттеры и сеттеры
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
}