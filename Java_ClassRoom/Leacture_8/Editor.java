import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;

public class Editor extends JFrame implements ActionListener {
    JMenuBar menu;
    JMenu file, edit, view, insert, font;
    JMenuItem save, saveas, print, open, delete, rename, cut, copy, paste, ArialBlack, Calibri;

    public static void main(String[] args) {
        Editor ed = new Editor();
        ed.setVisible(true);
        ed.setSize(500, 500);
        ed.setTitle("Code Editor");
        ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ed.setLocationRelativeTo(null);
        ed.pack();
    }

    public Editor() {
        menu = new JMenuBar();
        add(menu, BorderLayout.NORTH);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        insert = new JMenu("Insert");
        font = new JMenu("Font");
        menu.add(file);
        menu.add(edit);
        menu.add(view);
        menu.add(insert);

        save = new JMenuItem("Save");
        saveas = new JMenuItem("Save as");
        print = new JMenuItem("Print");
        open = new JMenuItem("Open");
        delete = new JMenuItem("Delete");
        ArialBlack = new JMenuItem("ArialBlack");
        Calibri = new JMenuItem("Calibri");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        file.add(open);
        file.add(save);
        file.add(saveas);
        file.add(print);
        file.add(delete);
        file.add(font);
        font.add(Calibri);
        font.add(ArialBlack);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        save.addActionListener(this);
        open.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser jfc = new JFileChooser();
            int openStatus = jfc.showOpenDialog(this);
            if (openStatus == JFileChooser.APPROVE_OPTION) {
                File f1 = jfc.getSelectedFile();
                System.out.println(f1.getAbsolutePath());
                OpenFrameDemo ofd = new OpenFrameDemo(f1);
                ofd.setVisible(true);
                ofd.setSize(500,500);
                
            }
        }

        if (e.getSource() == save) {
            JFileChooser jfc = new JFileChooser();
            int saveStatus = jfc.showSaveDialog(this);

            if (saveStatus == JFileChooser.APPROVE_OPTION) {
                File f1 = jfc.getSelectedFile();
                FileWriter wr = null;
                try {
                    String content = "This is a sample text for testing file saving.";
                    wr = new FileWriter(f1);
                    wr.write(content);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        if (wr != null) {
                            wr.close();
                        }
                    } catch (IOException ref) {
                        ref.printStackTrace();
                    }
                }
            }
        }
    }
}
