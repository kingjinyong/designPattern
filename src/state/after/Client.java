package state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student jinyong = new Student("jinyong");

        jinyong.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(jinyong);

        student.addPrivate(onlineCourse);
        onlineCourse.addStudent(student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
