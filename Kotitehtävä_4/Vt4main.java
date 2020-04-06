

import java.util.Scanner;


public class Vt4main{
    
    
    public static void main(String[] args){    
        
        Property taloA = new Property("Omakotitalo", "Oulu");
        Property taloB = new Property("Rivitalo", "Helsinki");
        Property taloC = new Property("Kerrostaloasunto", "Rovaniemi");
        Property taloD = new Property("Kesämökki", "Kuusamo");
        Property taloE = new Property("Omakotitalo", "Espoo");
        
        InsuranceInfo vakuutusA = new InsuranceInfo(taloA, 240000.0);
        InsuranceInfo vakuutusB = new InsuranceInfo(taloB, 390000.0);
        InsuranceInfo vakuutusC = new InsuranceInfo(taloC, 20000.0);
        InsuranceInfo vakuutusD = new InsuranceInfo(taloD, 55600.0);
        InsuranceInfo vakuutusE = new InsuranceInfo(taloE, 845000.0);
        
        InsInfoContainer vakuutukset = new InsInfoContainer();
        
        vakuutukset.addInsurance(vakuutusA);
        vakuutukset.addInsurance(vakuutusB);
        vakuutukset.addInsurance(vakuutusC);
        vakuutukset.addInsurance(vakuutusD);
        vakuutukset.addInsurance(vakuutusE);
        
        vakuutukset.printAll();
        System.out.println("");
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Syötä arvo. Vakuutusrvoltaan pienemmät kiinteistöt tulostetaan: ");
        
        while(true){
            try{
                vakuutukset.printLowerValues(Double.valueOf(sc.nextLine()));
                System.out.println("");
                break;
            }catch (Exception e){
                System.out.println("");
                System.out.print("Virheellinen arvo. Yritä uudelleen: ");
            }
        }
        
        System.out.print("Syötä arvo. Vakuutusrvoltaan suuremmat kiinteistöt tulostetaan: ");
        
        while(true){
            try{
                vakuutukset.printHigherValues(Double.valueOf(sc.nextLine()));
                System.out.println("");
                break;
            }catch (Exception e){
                System.out.println("");
                System.out.print("Virheellinen arvo. Yritä uudelleen: ");
            }
        }
        
    }
    
}