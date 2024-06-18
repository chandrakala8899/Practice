package Student.Service;

import Student.Model.Student;
import Student.Model.Subject;

public class MarksValidation {
    public static int passMarks = 35;

    public String validate( Student student) {

        for (Subject subject : student.subjects) {


            if (subject.marks >= passMarks) {
                System.out.println(" Subject is passed");

            } else {
                System.out.println(" Subject is Failed");
            }
        }
        return "";
    }
}
