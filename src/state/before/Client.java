package state.before;

public class Client {

    public static void main(String[] args) {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student jinyong = new Student("jinyong");
        jinyong.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(jinyong);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
