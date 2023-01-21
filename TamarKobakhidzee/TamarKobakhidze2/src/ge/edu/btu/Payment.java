package ge.edu.btu;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.lang.module.Configuration;

public class Payment {

    public static Logger logger=LogManager.getLogger(Payment.class);


    public static void main(String[] args) {
        Electricity electricity=new Electricity("tako",4);
        Water water=new Water("beka",32);
        genericPrint(electricity);
        genericPrint(water);





    }


    public static  <T> void genericPrint(T a) {
        logger.log(Level.INFO,"კომუნალურები გახადილია:"+a.toString());

    }

}
