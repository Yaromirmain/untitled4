public class University {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Иван");
        teacher1.setLastName("Петров");
        teacher1.setDepartment("Математика");
        teacher1.setExperience(10);

        Faculty faculty1 = new Faculty();
        faculty1.setName("Физико-математический факультет");
        faculty1.setDean(teacher1);
        faculty1.setStudentCount(200);

        Student student1 = new Student();
        student1.setFirstName("Анна");
        student1.setLastName("Сидорова");
        student1.setStudentId(123);
        student1.setFaculty(faculty1);

        Course course1 = new Course();
        course1.setTitle("Алгебра");
        course1.setDescription("Основы алгебры и ее применение");
        course1.setTeacher(teacher1);
        course1.setSemester(1);

        System.out.println("Студент: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Факультет: " + student1.getFaculty().getName());
        System.out.println("Курс: " + course1.getTitle());
    }
}