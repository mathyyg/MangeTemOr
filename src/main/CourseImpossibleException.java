package main;

public class CourseImpossibleException extends Exception {
    public CourseImpossibleException(String s) {
        super(s);
    }

    public CourseImpossibleException() {
        super("Course impossible");
    }
}
