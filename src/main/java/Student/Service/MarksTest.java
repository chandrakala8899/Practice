package Student.Service;

import Student.Model.Student;
import Student.Model.Subject;

public class MarksTest {
    public static void main(String[] args) {
    Student student = new Student();
    student.studentName ="Chandu";
    student.rollNumber ="12";


    Subject subject1 = new Subject();
    subject1.subjectName ="Telugu";
    subject1.marks =45;

    Subject subject2 = new Subject();
    subject2.subjectName ="English";
    subject2.marks =60;

    Subject subject3 = new Subject();
    subject3.subjectName ="Hindi";
    subject3.marks =34;

    Subject subject4 = new Subject();
    subject4.subjectName ="Maths";
    subject4.marks =65;

    Subject subject5 = new Subject();
    subject5.subjectName ="Science";
    subject5.marks =45;

    Subject subject6 = new Subject();
    subject6.subjectName ="Social";
    subject6.marks =78;

    Subject[] subjects = new Subject[6];

    student.subjects =new Subject[]{subject1,subject2,subject3,subject4,subject5,subject6};

    MarksValidation marksValidation = new MarksValidation();
        marksValidation.validate(student);
}
}

