package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reservation {
    
    int ID, duration;
    double deposit, extraCharges, total;
    String plate, custName;
    Date startDate, endDate, returned;
    String path = "reservation.csv";
    
    Reservation () {
    
    }
    
    Reservation (int ID, String plate, String custName, Date startDate, Date endDate, int duration, double deposit, double total) {
        
        this.ID = ID;
        this.plate = plate;
        this.custName = custName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.returned = null;
        this.duration = duration;
        this.deposit = deposit;
        this.extraCharges = 0;
        this.total = total;
        
    }
    
    public static long compare(Date start, Date end) {
        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String startDateString = sdf.format(start);
        String endDateString = sdf.format(end);
        
        LocalDate startDate = LocalDate.parse(startDateString);
        LocalDate endDate = LocalDate.parse(endDateString);
        
        Long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        return numberOfDays;
    }
    
    public static boolean isValid (Date start, Date end) {
        
        boolean valid = false;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String startDateString = sdf.format(start);
        String endDateString = sdf.format(end);
        
        LocalDate startDate = LocalDate.parse(startDateString);
        LocalDate endDate = LocalDate.parse(endDateString);
        LocalDate now = LocalDate.now();
        
        if (((ChronoUnit.DAYS.between(startDate, endDate)+1) > 0) && (ChronoUnit.DAYS.between(now, startDate)+1) > 0) {
            valid = true;
        }
        
        return valid;
    }
    
    public boolean add () {
       
        boolean boo = false;
        
        Date start = startDate;
        Date end = endDate;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String startDateString = sdf.format(start);
        String endDateString = sdf.format(end);
        
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            if (ID == 1) {
                pw.print("\n"+ID+","+plate+","+custName+","+startDateString+","+endDateString+","+returned+","+duration+","+deposit+","+extraCharges+","+total+"\n");
            } else if (ID > 1) {
                pw.print(ID+","+plate+","+custName+","+startDateString+","+endDateString+","+returned+","+duration+","+deposit+","+extraCharges+","+total+"\n");
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
    
    public boolean update (String id, Date endDate) {
        
        boolean boo = false;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String endDateString = sdf.format(endDate);
        LocalDate endDateLocal = LocalDate.parse(endDateString);
        LocalDate returnDate = LocalDate.now();
        Long numberOfDays = ChronoUnit.DAYS.between(endDateLocal, returnDate);
        double extraCharges = numberOfDays * 100;
        
        if (extraCharges > 0) {
            JOptionPane.showMessageDialog(null, "An extra charge of RM"+extraCharges+" applies");
        } else {
            extraCharges = 0;
        }
        
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
                    pw.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+returnDate+","+data[6]+","+data[7]+","+extraCharges+","+data[9]);
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
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, e);
        }
        return boo;
    }
    
}
