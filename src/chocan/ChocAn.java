/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocan;

import entities.Admin;
import entities.Members;
import entities.Provider;
import entities.ProviderDir;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import utility.Utils;

/**
 *
 * @author LP
 */
public class ChocAn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = Utils.getSession();
        session.beginTransaction();
//        
//        Admin admin = new Admin();
//        admin.setUsername("lav");
//        admin.setPassword("password");
//        
//        session.save(admin);
       
//        ProviderDir providerdir = new ProviderDir();
//        providerdir.setServiceCode(123451);
//        providerdir.setServiceName("Dietician");
//        providerdir.setProviderNumber(876543210);
//        providerdir.setProviderName("Irfan");
//        providerdir.setFees(200);
//        
//        session.save(providerdir);
//        
//        ProviderDir providerdir1 = new ProviderDir();
//        providerdir1.setServiceCode(123452);
//        providerdir1.setServiceName("Trainer");
//        providerdir1.setProviderNumber(876543211);
//        providerdir1.setProviderName("Jay");
//        providerdir1.setFees(350);
//        
//        session.save(providerdir1);
//        
//        ProviderDir providerdir2 = new ProviderDir();
//        providerdir2.setServiceCode(123453);
//        providerdir2.setServiceName("Yoga Instructor");
//        providerdir2.setProviderNumber(876543212);
//        providerdir2.setProviderName("Rishu");
//        providerdir2.setFees(250);
//        
//        session.save(providerdir2);


        
        
        session.getTransaction().commit();
        session.close();
        //Utils.closeSessionFactory();
        
    }
    
}
