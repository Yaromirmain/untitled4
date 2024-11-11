public class Teacher {
    private String firstName;
    private String lastName;
    private String department;
    private int experience;

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
}

class Assistant extends Teacher {
    private int hoursPerWeek;

    public int getHoursPerWeek() { return hoursPerWeek; }
    public void setHoursPerWeek(int hoursPerWeek) { this.hoursPerWeek = hoursPerWeek; }
}
