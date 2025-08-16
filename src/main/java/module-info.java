module com.mehedihasanmamun.hangman3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mehedihasanmamun.hangman3 to javafx.fxml;
    exports com.mehedihasanmamun.hangman3;
}