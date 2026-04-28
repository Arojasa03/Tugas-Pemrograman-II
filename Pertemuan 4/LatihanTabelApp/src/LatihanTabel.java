import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class LatihanTabel extends JFrame {

    JTextField txtNim, txtNama, txtNilai;
    JButton btnTambah;
    JTable tabel;
    DefaultTableModel model;

    public LatihanTabel() {

        setTitle("Latihan JTable Pertemuan 4");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // LABEL
        JLabel lblNim = new JLabel("NIM");
        lblNim.setBounds(30, 20, 100, 25);
        add(lblNim);

        JLabel lblNama = new JLabel("Nama Mahasiswa");
        lblNama.setBounds(30, 60, 120, 25);
        add(lblNama);

        JLabel lblNilai = new JLabel("Nilai");
        lblNilai.setBounds(30, 100, 100, 25);
        add(lblNilai);

        // TEXTFIELD
        txtNim = new JTextField();
        txtNim.setBounds(160, 20, 150, 25);
        add(txtNim);

        txtNama = new JTextField();
        txtNama.setBounds(160, 60, 150, 25);
        add(txtNama);

        txtNilai = new JTextField();
        txtNilai.setBounds(160, 100, 150, 25);
        add(txtNilai);

        // BUTTON
        btnTambah = new JButton("TABEL");
        btnTambah.setBounds(330, 20, 100, 30);
        add(btnTambah);

        // TABLE
        model = new DefaultTableModel();
        tabel = new JTable(model);

        model.addColumn("NIM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Nilai");

        JScrollPane scroll = new JScrollPane(tabel);
        scroll.setBounds(30, 150, 420, 180);
        add(scroll);

        // EVENT BUTTON
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nim = txtNim.getText();
                String nama = txtNama.getText();
                String nilai = txtNilai.getText();

                model.addRow(new Object[]{nim, nama, nilai});

                txtNim.setText("");
                txtNama.setText("");
                txtNilai.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new LatihanTabel().setVisible(true);
    }
}