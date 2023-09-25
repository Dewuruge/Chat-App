package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainFormController {
    public AnchorPane root;
    public TextArea txtChat;
    public TextField txtMessage;
    public Button btnSend;
    private ObjectOutputStream oos;
    Socket remoteSocket;

    public void initialize(){
//        try {
//            remoteSocket = new Socket("192.168.8.179", 5050);
//            OutputStream os = remoteSocket.getOutputStream();
//            BufferedOutputStream bos = new BufferedOutputStream(os);
//            oos = new ObjectOutputStream(bos);
//            System.out.println("Connected...!");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void btnSendOnAction(ActionEvent actionEvent) throws IOException {
        remoteSocket = new Socket("192.168.8.179", 5051);
        String text = txtMessage.getText();
        remoteSocket.getOutputStream().write(text.getBytes());

    }
}
