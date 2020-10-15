package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Car {
   
    int ID, year;
    String make, model, plate, transmission, color, type;
    boolean availability;
    double rate;
    
    String path = "cars.csv";
    
    Car () {
    
    }
    
    Car (int ID, String make, String model, int year, String plate, String transmission, double rate, String color, String type) {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.transmission = transmission;
        this.rate = rate;
        this.color = color;
        this.availability = true;
        this.type = type;
    }
    
    public boolean add () {
        boolean boo = false;
        
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            if (ID == 1) {
                pw.print("\n"+ID+","+make+","+model+","+year+","+plate+","+transmission+","+rate+","+color+","+","+availability+","+type+"\n");
            } else if (ID > 1) {
                pw.print(ID+","+make+","+model+","+year+","+plate+","+transmission+","+rate+","+color+","+availability+","+type+"\n");
            }
            pw.flush();
            pw.close();
            boo = true;
        } catch (Exception e) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, e);
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
                    pw.println(id+","+make+","+model+","+year+","+plate+","+transmission+","+rate+","+color+","+availability+","+type);
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
    
    public static boolean rentCar (String id) {
        
        String path = "cars.csv";
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
                    pw.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]+","+data[6]+","+data[7]+","+false+","+data[9]);
                } else {
                    pw.println(currentLine);
                }
            }
            
            boo = true;
            
            pw.flush();
            pw.close();
            br.close();
            
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);
            
            
        } catch (Exception e) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, e);
        }
        return boo;
    }
    
    public static boolean returnCar (String plate) {
        
        String path = "cars.csv";
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
                if (data[4].equals(plate)) {
                    pw.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]+","+data[6]+","+data[7]+","+true+","+data[9]);
                } else {
                    pw.println(currentLine);
                }
            }
            
            boo = true;
            
            pw.flush();
            pw.close();
            br.close();
            
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);
            
            
        } catch (Exception e) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, e);
        }
        return boo;
    }
}


