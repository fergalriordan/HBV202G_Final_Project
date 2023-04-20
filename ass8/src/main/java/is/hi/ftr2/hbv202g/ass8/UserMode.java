package is.hi.ftr2.hbv202g.ass8;

public class UserMode {
    public static void main(String[] args) {
        System.out.println("Welcome, User!");

        System.out.println("Enter 1 for faculty, 2 for student:");

        // Faculty mode
        // User mode
        

        int userType = Integer.parseInt(System.console().readLine());
        switch (userType) {
            case 1:
                System.out.println("Name: ");
                String name = System.console().readLine();
                System.out.println("Department: ");
                String department = System.console().readLine();
                FacultyMember facultyMember = new FacultyMember(name, department);
                break;
            case 2:
                System.out.println("Name: ");
                String name1 = System.console().readLine();
                // <CHECK EXTERNAL DATABASE TO SEE IF THE STUDENT IN QUESTION HAS PAID THEIR FEES>
                Boolean feePaid = true; // placeholder -> assume paid
                Student student = new Student(name1, feePaid);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Enter 1 to borrow, 2 to return, 3 to request an extension");
        int borrowOrReturn = Integer.parseInt(System.console().readLine());
        String title;
        switch (borrowOrReturn) {
            case 1:
                System.out.println("Title: ");
                title = System.console().readLine();

                break;
            case 2:
                System.out.println("Title ");
                title = System.console().readLine();
                break;
            case 3:
                System.out.println("Title ");
                title = System.console().readLine();
                break;
        }
    }
}
