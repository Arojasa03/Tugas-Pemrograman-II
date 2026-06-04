<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Informasi Nilai Mahasiswa</title>

<style>

body{
    margin:0;
    padding:0;
    background:#d9d5d5;
    font-family:"Times New Roman";
}

.container{
    width:1050px;
    height:730px;
    margin:auto;
    background:#f4f0f0;
    border:2px solid #555;
    overflow:hidden;
}

.header{
    width:100%;
    text-align:center;
    background:#f8f5f5;
    padding-top:8px;
    padding-bottom:8px;
}

.header h2{
    margin:0;
    font-size:20px;
}

.header h1{
    margin:0;
    font-size:45px;
    font-weight:bold;
}

.header h3{
    margin-top:3px;
    font-size:14px;
}

.sidebar{
    width:170px;
    height:500px;
    background:#e8eee0;
    float:left;
}

.menu-box{
    width:115px;
    background:#d8d3d3;
    margin:auto;
    margin-top:18px;
    padding:12px;
    border-radius:14px;
    box-shadow:3px 3px 10px gray;
}

.menu-title{
    font-size:15px;
    font-weight:bold;
    margin-top:5px;
    margin-bottom:10px;
}

.menu{
    width:100px;
    background:#8faa4c;
    text-align:center;
    padding:6px;
    margin-bottom:15px;
}

.menu a{
    color:#d291ff;
    text-decoration:none;
    font-size:13px;
}

.content{
    margin-left:170px;
    height:500px;
    background:#f4f0f0;
    padding-top:15px;
}

.navbar{
    width:500px;
    height:40px;
    background:#d8d3d3;
    margin:auto;
    border-radius:18px;
    text-align:center;
    padding-top:15px;
    box-shadow:3px 3px 10px gray;
}

.navbar a{
    text-decoration:none;
    color:#666;
    margin:12px;
    font-size:14px;
}

.judul{
    text-align:center;
    margin-top:15px;
    margin-bottom:10px;
    font-size:22px;
    font-weight:bold;
}

.form-area{
    width:560px;
    margin:auto;
}

table{
    width:100%;
    font-size:14px;
}

table td{
    padding:2px;
}

.label{
    width:180px;
}

input[type=text]{
    width:220px;
    height:20px;
    font-size:13px;
}

.kecil{
    width:25px !important;
}

.btn-kecil{
    width:45px;
    height:25px;
    font-size:12px;
}

.btn{
    width:80px;
    height:28px;
    font-size:14px;
    margin-top:5px;
}

.footer{
    width:100%;
    text-align:center;
    background:#d8d0ff;
    padding-top:8px;
    padding-bottom:8px;
    font-size:13px;
    clear:both;
    margin-top:-35px;
}

</style>

</head>

<body>

<div class="container">

    <div class="header">

        <h2>Informasi Nilai Mahasiswa</h2>

        <h1>UNIVERSITAS PAMULANG</h1>

        <h3>
            Jl. Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten
        </h3>

    </div>

    <div class="sidebar">

        <div class="menu-box">

            <div class="menu-title">Master Data</div>

            <div class="menu">
                <a href="#">Mahasiswa</a>
            </div>

            <div class="menu">
                <a href="#">Mata Kuliah</a>
            </div>

            <br>

            <div class="menu-title">Transaksi</div>

            <div class="menu">
                <a href="#">Nilai</a>
            </div>

            <br>

            <div class="menu-title">Laporan</div>

            <div class="menu">
                <a href="#">Nilai</a>
            </div>

            <br><br>

            <div class="menu">
                <a href="#">Logout</a>
            </div>

        </div>

    </div>

    <div class="content">

        <div class="navbar">

            <a href="#">Home</a>
            <a href="#">Master Data</a>
            <a href="#">Transaksi</a>
            <a href="#">Laporan</a>
            <a href="#">Logout</a>

        </div>

        <div class="judul">
            Input Nilai Mahasiswa
        </div>

        <div class="form-area">

        <form method="post">

            <table>

                <tr>
                    <td class="label">NIM</td>

                    <td>
                        <input type="text" name="nim">
                    </td>

                    <td>
                        <input type="button" value="Cari" class="btn-kecil">
                    </td>

                    <td>
                        <input type="button" value="Lihat" class="btn-kecil">
                    </td>
                </tr>

                <tr>
                    <td class="label">Nama</td>

                    <td colspan="3">
                        <input type="text" name="nama" style="width:280px;">
                    </td>
                </tr>

                <tr>
                    <td class="label">Semester</td>

                    <td colspan="3">
                        <input type="text" class="kecil" name="semester">
                    </td>
                </tr>

                <tr>
                    <td class="label">Kelas</td>

                    <td colspan="3">
                        <input type="text" class="kecil" name="kelas">
                    </td>
                </tr>

                <tr>
                    <td class="label">Kode Mata Kuliah</td>

                    <td>
                        <input type="text">
                    </td>

                    <td>
                        <input type="button" value="Cari" class="btn-kecil">
                    </td>

                    <td>
                        <input type="button" value="Lihat" class="btn-kecil">
                    </td>
                </tr>

                <tr>
                    <td class="label">Nama Mata Kuliah</td>

                    <td colspan="3">
                        <input type="text" style="width:280px;">
                    </td>
                </tr>

                <tr>
                    <td class="label">Jumlah SKS</td>

                    <td colspan="3">
                        <input type="text" class="kecil">
                    </td>
                </tr>

                <tr>
                    <td class="label">Nilai Tugas</td>

                    <td colspan="3">
                        <input type="text" class="kecil">
                    </td>
                </tr>

                <tr>
                    <td class="label">Nilai UTS</td>

                    <td colspan="3">
                        <input type="text" class="kecil">
                    </td>
                </tr>

                <tr>
                    <td class="label">Nilai UAS</td>

                    <td colspan="3">
                        <input type="text" class="kecil">
                    </td>
                </tr>

                <tr>
                    <td></td>

                    <td colspan="3">

                        <input type="submit" value="Simpan" class="btn">

                        <input type="reset" value="Hapus" class="btn">

                    </td>
                </tr>

            </table>

        </form>

        </div>

    </div>

    <div class="footer">

        Copyright © 2014 Universitas Pamulang
        <br>
        Jl. Surya Kencana No. 1 Pamulang Tangerang Selatan, Banten

    </div>

</div>

</body>
</html>