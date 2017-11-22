/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

import controller.c_awal;
import controller.c_kontrak;
import controller.c_user;
import java.sql.SQLException;
import model.m_kontrak;
import model.m_user;
import view.datakontrak;
import view.homeAwal;
import view.login;

/**
 *
 * @author InSearchOfIncredible
 */
public class PPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        homeAwal theView = new homeAwal();
//        mUser theModel = new mUser();
        c_awal control = new c_awal(theView);
//        cKontrak a = new cKontrak(new mKontrak(), new datakontrak());  }
    }
}
