class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private Faculty faculty;

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }

    @Override
    public String toString() {
        return "Студент: " + firstName + " " + lastName + ", ID: " + studentId;
    }
}