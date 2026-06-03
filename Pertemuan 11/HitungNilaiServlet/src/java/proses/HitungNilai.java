package proses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HitungNilai")
public class HitungNilai extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String hadir = request.getParameter("hadir");
        String pertemuan = request.getParameter("pertemuan");
        String tugas = request.getParameter("tugas");
        String uts = request.getParameter("uts");
        String uas = request.getParameter("uas");

        if (hadir == null) hadir = "";
        if (pertemuan == null) pertemuan = "";
        if (tugas == null) tugas = "";
        if (uts == null) uts = "";
        if (uas == null) uas = "";

        int jumlahHadir = 0;
        int jumlahPertemuan = 0;

        double nilaiTugas = 0;
        double nilaiUts = 0;
        double nilaiUas = 0;
        double nilaiAkhir;

        String grade;
        String status;

        try {
            jumlahHadir = Integer.parseInt(hadir);
        } catch (Exception e) {
        }

        try {
            jumlahPertemuan = Integer.parseInt(pertemuan);
        } catch (Exception e) {
        }

        try {
            nilaiTugas = Double.parseDouble(tugas);
        } catch (Exception e) {
        }

        try {
            nilaiUts = Double.parseDouble(uts);
        } catch (Exception e) {
        }

        try {
            nilaiUas = Double.parseDouble(uas);
        } catch (Exception e) {
        }

        if (jumlahPertemuan == 0) {
            nilaiAkhir = 0;
        } else {
            nilaiAkhir =
                    (10 * (double) jumlahHadir / jumlahPertemuan)
                    + (0.2 * nilaiTugas)
                    + (0.3 * nilaiUts)
                    + (0.4 * nilaiUas);
        }

        if (nilaiAkhir >= 80) {
            grade = "A";
            status = "Lulus";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
            status = "Lulus";
        } else if (nilaiAkhir >= 60) {
            grade = "C";
            status = "Lulus";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
            status = "Tidak Lulus";
        } else {
            grade = "E";
            status = "Tidak Lulus";
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hitung Nilai</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Menghitung Nilai</h1>");

        out.println("<form action='HitungNilai' method='post'>");

        out.println("<table>");

        out.println("<tr><td>Jumlah hadir</td>");
        out.println("<td><input type='text' name='hadir' value='" + hadir + "'></td></tr>");

        out.println("<tr><td>Jumlah pertemuan</td>");
        out.println("<td><input type='text' name='pertemuan' value='" + pertemuan + "'></td></tr>");

        out.println("<tr><td>Nilai tugas</td>");
        out.println("<td><input type='text' name='tugas' value='" + tugas + "'></td></tr>");

        out.println("<tr><td>Nilai UTS</td>");
        out.println("<td><input type='text' name='uts' value='" + uts + "'></td></tr>");

        out.println("<tr><td>Nilai UAS</td>");
        out.println("<td><input type='text' name='uas' value='" + uas + "'></td></tr>");

        out.println("<tr><td>Nilai Akhir</td>");
        out.println("<td><input type='text' readonly value='" + nilaiAkhir + "'></td></tr>");

        out.println("<tr><td>Grade</td>");
        out.println("<td><input type='text' readonly value='" + grade + "'></td></tr>");

        out.println("<tr><td>Status</td>");
        out.println("<td><input type='text' readonly value='" + status + "'></td></tr>");

        out.println("<tr>");
        out.println("<td colspan='2'>");
        out.println("<input type='submit' value='Hitung'>");
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}