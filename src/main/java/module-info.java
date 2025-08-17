module com.mehedihasanmamun.hangmanthree {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.mehedihasanmamun.hangmanthree to javafx.fxml;
    exports com.mehedihasanmamun.hangmanthree;
}