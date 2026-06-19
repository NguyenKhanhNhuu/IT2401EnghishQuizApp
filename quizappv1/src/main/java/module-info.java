module com.nguyenkhanhnhu.quizappv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nguyenkhanhnhu.quizappv1 to javafx.fxml;
    exports com.nguyenkhanhnhu.quizappv1;
}
