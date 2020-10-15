package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arrays {

    static String carPath = "cars.csv";
    static String customerPath = "customer.csv";
    static String reservationPath = "reservation.csv";
    
    public static ArrayList getAllCarRecord () {
        ArrayList value = new ArrayList();
        String line = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(carPath));
            int j = 0;
            try {
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (!values[0].equals("ID")) {
                        for (int i = 0; i < values.length; i++) {
                            value.add(values[i]);
                        }
                    }
                }
                
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }
    
    public static int getNewCarId () {
        
        ArrayList all = getAllCarRecord();
        int j = all.size()/10;
        int id = 0;
        
        if (j == 1) {
            id = Integer.parseInt((String) all.subList(0, 9).get(0)) + 1;
        } else if (j == 0) {
            id = 1;
        } else {
            int start = (j-1)*10;
            id = Integer.parseInt((String) all.subList(start, start+10).get(0)) + 1;
        }
        
        
        return id;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList getAllCustomerRecord () {
        ArrayList value = new ArrayList();
        String line = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(customerPath));
            int j = 0;
            try {
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (!values[0].equals("ID")) {
                        for (int i = 0; i < values.length; i++) {
                            value.add(values[i]);
                        }
                    }
                }
                
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }
    
    public static int getNewCustomerId () {
        
        ArrayList all = getAllCustomerRecord();
        int j = all.size()/7;
        int id = 0;
        
        if (j == 1) {
            id = Integer.parseInt((String) all.subList(0, 7).get(0)) + 1;
        } else if (j == 0) {
            id = 1;
        } else {
            int start = (j-1)*7;
            id = Integer.parseInt((String) all.subList(start, start+7).get(0)) + 1;
        }
        
        
        return id;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList getAllReservationRecord () {
        ArrayList value = new ArrayList();
        String line = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(reservationPath));
            int j = 0;
            try {
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (!values[0].equals("ID")) {
                        for (int i = 0; i < values.length; i++) {
                            value.add(values[i]);
                        }
                    }
                }
                
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }
    
    public static int getNewReservationId () {
        
        ArrayList all = getAllReservationRecord();
        int j = all.size()/10;
        int id = 0;
        
        if (j == 1) {
            id = Integer.parseInt((String) all.subList(0, 10).get(0)) + 1;
        } else if (j == 0) {
            id = 1;
        } else {
            int start = (j-1)*10;
            id = Integer.parseInt((String) all.subList(start, start+10).get(0)) + 1;
        }
        
        return id;
    }
    
    public static List getReservationInfo (String ID) {
        ArrayList all = getAllReservationRecord();
        List info = null;
        int j = 0;
        
        for (int i = 0; i < all.size(); i++ ) {
            if (all.subList(j, j+10).get(0).equals(ID)){
                info = all.subList(j, j+10);
                break;
            } else {
                j+=10;
            }
        }
        
        return info;
    }
}
