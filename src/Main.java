public class Main {
    public static void main(String[] args) {
        Professor[] professors = new Professor[3];
        professors[0] = new Professor("gianni", 152L, 5624L, "java");
        professors [1] = new Professor("andrea", 543L, 852, "story");
        professors [2] = new Professor("franco", 846L, 789L, "math");

        printJavistsDepartments(professors);
    }
    static void printJavistsDepartments(Professor[] professors) {
        for (Professor professor : professors) {
            long id = professor.getDepartmentId();
            System.out.println(professor.getDepartmentId());
            long identifier = professor.getIdentifier();
            System.out.println("identifier" + " " + professor.getIdentifier());
            if (professor.getCourse().equals("java")) {
                System.out.println(" course professor java " + professor.getDepartmentId());
            }
        }
    }
}