/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Customer {
    
    int ID, age, phone;
    String name, gender, ic, email; 
    String path = "customer.csv";
    
    Customer () {
        
    }
    
    Customer (int ID, String name, int age, String gender, String ic, String email, int phone) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ic = ic;
        this.email = email;
        this.phone = phone;
    }
    
    public boolean add () {
        boolean boo = false;
        
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            if (ID == 1) {
                pw.print("\n"+ID+","+name+","+age+","+gender+","+ic+","+email+","+phone+"\n");
            } else if (ID > 1) {
                pw.print(ID+","+name+","+age+","+gender+","+ic+","+email+","+phone+"\n");
            }
            pw.flush();
            pw.close();
            boo = true;
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return boo;
    }
    
    public boolean delete (String id) {
        boolean boo = false;
        String tempFile = "temp.txt";
        File oldFile = new File(path);
        File newFile = new File(tempFile);
        
        String currentLine;
        String data[];
        
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile, true)));
            
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            while ((currentLine = br.readLine()) != null ) {
                data = currentLine.split(",");
                if (!(data[0].equals("ID")) && !(data[0].equals(id))) {
                    pw.println(currentLine);
                }
            }
            
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);
            boo = true;
            
        } catch (Exception e) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return boo;
    }
    
    public boolean update (String id) {
        boolean boo = false;
        String tempFile = "temp.txt";
        File oldFile = new File(path);
        File newFile = new File(tempFile);
        
        String currentLine;
        String data[];
        
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile, true)));
            
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            while ((currentLine = br.readLine()) != null ) {
                data = currentLine.split(",");
                if (data[0].equals(id)) {
                    pw.println(id+","+name+","+age+","+gender+","+ic+","+email+","+phone);
                } else {
                    pw.println(currentLine);
                }
            }
            
            pw.flush();
            pw.close();
            br.close();
            
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);
            
            boo = true;
        } catch (Exception e) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, e);
        }
        return boo;
    }
}
