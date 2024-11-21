import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class OpenFrameDemo extends JFrame {
    public OpenFrameDemo(File f1) {
        JTextArea jta = new JTextArea();
        StringBuilder content = new StringBuilder();
        try {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String msg;
            while ((msg = br.readLine()) != null) {
                content.append(msg).append("\n");
            }
            jta.setText(content.toString());
            add(jta);
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
