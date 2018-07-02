
import java.sql.Time;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[] args) {
        Time t= new Time(0);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(t);
        System.out.println(s);
    }
}
