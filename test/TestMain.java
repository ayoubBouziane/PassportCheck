
import passportcheck.ChecksumCalculator;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntko
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChecksumCalculator cc = new ChecksumCalculator();
        String passportNumber = "12345678";
        System.out.print(cc.Checksum(passportNumber));
    }
    
}
