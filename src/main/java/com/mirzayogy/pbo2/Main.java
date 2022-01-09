package com.mirzayogy.pbo2;

import com.mirzayogy.pbo2.libs.Pref;
import com.mirzayogy.pbo2.model.Barang;
import com.mirzayogy.pbo2.model.JenisBarang;
import com.mirzayogy.pbo2.model.Pengguna;
import com.mirzayogy.pbo2.view.LoginFrame;
import com.mirzayogy.pbo2.view.MainPublic;
import com.mirzayogy.pbo2.view.admin.BarangViewFrame;
import com.mirzayogy.pbo2.view.admin.JenisBarangViewFrame;
import com.mirzayogy.pbo2.view.admin.MainAdminFrame;
import com.mirzayogy.pbo2.view.kasir.MainKasirFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
//        Pref pref = new Pref();
//        Pengguna pengguna = pref.ambil();
//        
//        if(pengguna.getId() == 0){
//            LoginFrame loginFrame = new LoginFrame();
//            loginFrame.setVisible(true);
//        } else {
//            if(pengguna.isIsAdmin()){
//                MainAdminFrame mainAdminFrame = new MainAdminFrame();
//                mainAdminFrame.setVisible(true);
//            } else {
//                MainKasirFrame mainKasirFrame = new MainKasirFrame();
//                mainKasirFrame.setVisible(true);
//            }
//        }
//        BarangViewFrame barangViewFrame = new BarangViewFrame();
//        barangViewFrame.setVisible(true);
//        
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
