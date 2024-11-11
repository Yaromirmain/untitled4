class Faculty {
    private String name;
    private Teacher dean;
    private int studentCount;

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Teacher getDean() { return dean; }
    public void setDean(Teacher dean) { this.dean = dean; }

    public int getStudentCount() { return studentCount; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }
}