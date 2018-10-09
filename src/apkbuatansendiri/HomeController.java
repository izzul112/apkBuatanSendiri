/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkbuatansendiri;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HomeController implements Initializable {

    @FXML
    private CheckBox m1;
    @FXML
    private CheckBox m2;
    @FXML
    private CheckBox m3;
    @FXML
    private CheckBox m4;
    @FXML
    private CheckBox m5;
    @FXML
    private CheckBox m6;
    @FXML
    private CheckBox m7;
    @FXML
    private Label hm1;
    @FXML
    private Label hm2;
    @FXML
    private Label hm3;
    @FXML
    private Label hm4;
    @FXML
    private Label hm5;
    @FXML
    private Label hm6;
    @FXML
    private Label hm7;
    @FXML
    private TextField j1;
    @FXML
    private TextField j2;
    @FXML
    private TextField j3;
    @FXML
    private TextField j4;
    @FXML
    private TextField j5;
    @FXML
    private TextField j6;
    @FXML
    private TextField j7;
    @FXML
    private Button btnCetak1;
    @FXML
    private TextField inAn;
    @FXML
    private Label total;
    @FXML
    private TextField jumlahUang;
    @FXML
    private Button btnCetak;
    @FXML
    private TextArea hasilPesanan;

     int jumlah;
    int hargatotal1, hargatotal2, hargatotal3, hargatotal4, hargatotal5, hargatotal6, hargatotal7;
    String menu1, menu2, menu3, menu4, menu5, menu6, menu7;
    String menu = " ";
    String kasir = "Zul";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, jumlahUangBayar;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Hitung(ActionEvent event) {
         if (m1.isSelected()) {
            harga = 2000;
            menu += m1.getText() + ", ";
            jumlah = Integer.parseInt(j1.getText());
            hargatotal1 = harga * jumlah;
            System.out.println(hargatotal1);
        }
        if (m2.isSelected()) {
            harga = 2500;
            menu += m2.getText() + ", ";
            jumlah = Integer.parseInt(j2.getText());
            hargatotal2 = harga * jumlah;
            System.out.println(hargatotal2);
        }
        if (m3.isSelected()) {
            harga = 2000;
            menu += m3.getText() + ", ";
            jumlah = Integer.parseInt(j3.getText());
            hargatotal3 = harga * jumlah;
            System.out.println(hargatotal3);
        }
        if (m4.isSelected()) {
            harga = 4000;
            menu += m4.getText() + ", ";
            jumlah = Integer.parseInt(j4.getText());
            hargatotal4 = harga * jumlah;
            System.out.println(hargatotal4);
        }
        if (m5.isSelected()) {
            harga = 4000;
            menu += m5.getText() + ", ";
            jumlah = Integer.parseInt(j5.getText());
            hargatotal5 = harga * jumlah;
            System.out.println(hargatotal5);
        }
        if (m6.isSelected()) {
            harga = 3000;
            menu += m6.getText() + ", ";
            jumlah = Integer.parseInt(j6.getText());
            hargatotal6 = harga * jumlah;
            System.out.println(hargatotal6);
        }
        if (m7.isSelected()) {
            harga = 500;
            menu += m7.getText() + ", ";
            jumlah = Integer.parseInt(j7.getText());
            hargatotal7 = harga * jumlah;
            System.out.println(hargatotal7);
        }

    }

    @FXML
    private void CetakPemesanan(ActionEvent event) {
         totalbayar = hargatotal1 + hargatotal2 + hargatotal3 + hargatotal4 + hargatotal5 + hargatotal6 + hargatotal7;
        tampilTotalBayar = String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
        atasnama=inAn.getText();
         jumlahUangBayar = Integer.parseInt(jumlahUang.getText());
        kembalian = jumlahUangBayar - totalbayar;
        hasilPesanan.setText("Nama Pemesanan: " + atasnama + "\n" + "Menu yang Dipesan : " + menu + "\n" + "Total Pembayaran : Rp. " + totalbayar + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + jumlahUangBayar + "\n" + "Uang Kembali : Rp. " + kembalian + "\n" + "Kasir : " + kasir);
    }
    
}
