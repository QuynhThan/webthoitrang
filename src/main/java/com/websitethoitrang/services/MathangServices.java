package com.websitethoitrang.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.websitethoitrang.dao.MathangHome;
import com.websitethoitrang.entities.Mathang;
import com.websitethoitrang.entities.Nhanhieu;

@Component
@Service
public class MathangServices extends MathangHome {
	
	@Autowired
	SessionFactory factory;
	
	@Autowired
	QueryServices<Mathang> queryMathang;
	
	public List<Mathang> getInListID(List<String> ids){
		
		return queryMathang.getInListID("Mathang", "maMH", Mathang.class, ids);
	}
	
	public List<Mathang> getAll(){
		return queryMathang.getAll("Mathang", Mathang.class);
	}
	
	public List<String> getRecommendation(String maMH){
		String s = null;
		List<String> strs = null;
        try {

            // run the Unix "ps -ef" command
            // using the Runtime exec method:
        	String cmd = "python d:/ThanNgocQuynh/TNQ_IV_HKI/PHAT-TRIEN-HE-THONG-THONG-MINH/Project_Gr/DemoIntel/test.py "+ maMH;
            Process p = Runtime.getRuntime().exec(cmd);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            
            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);

                s = s.substring(1, s.length() - 1);
                String[] strss = s.split(",");
                strs = Arrays.asList(strss);
                System.out.println(strs);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            //System.exit(0);
        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            //System.exit(-1);
        }
		return strs;
		
	}
	
	@Override
	public void persist(Mathang transientInstance) {
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		try {
			session.save(transientInstance);
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
			System.out.println("Exception from persist mathang : " + e.getMessage());
		}
	}
	
	@Override
	public Mathang merge(Mathang detachedInstance) {
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		try {
			session.update(detachedInstance);
			tran.commit();
			return detachedInstance;
		} catch (Exception e) {
			tran.rollback();
			System.out.println("Exception from merge mathang : " + e.getMessage());
			return null;
		}
		
	}
	
}
