import java.util.Scanner;

public class Vt3main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
        
        StandingSubscription kestotilaus = new StandingSubscription();
        System.out.println("Luodaan uusi kestotilaus.");
        System.out.print("Syötä lehden nimi: ");
        kestotilaus.setLehden_nimi(sc.nextLine());
        System.out.print("Syötä tilaajan nimi: ");
        kestotilaus.setTilaajan_nimi(sc.nextLine());
        System.out.print("Syötä toimitusosoite: ");
        kestotilaus.setToimitusosoite(sc.nextLine());
        while(true){
            System.out.print("Syötä kuukausihinta: ");
            try{
                kestotilaus.setKuukausihinta(Double.valueOf(sc.nextLine()));  
                break;
            }catch(Exception e){
                System.out.println("Virheellinen syöte!");
            }
        }
        while(true){
            System.out.print("Syötä alennusprosentti: ");
            try{
                kestotilaus.setAlennusprosentti(Integer.valueOf(sc.nextLine()));
                break;
            }catch(Exception e){
                System.out.println("Virheellinen syöte!");
            }
        } 
        
        RegularSubscription kuukausitilaus = new RegularSubscription();
        System.out.println("");
        System.out.println("Luodaan uusi kuukausitilaus.");
        System.out.print("Syötä lehden nimi: ");
        kuukausitilaus.setLehden_nimi(sc.nextLine());
        System.out.print("Syötä tilaajan nimi: ");
        kuukausitilaus.setTilaajan_nimi(sc.nextLine());
        System.out.print("Syötä toimitusosoite: ");
        kuukausitilaus.setToimitusosoite(sc.nextLine());
        while(true){
            System.out.print("Syötä kuukausihinta: ");
            try{
                kuukausitilaus.setKuukausihinta(Double.valueOf(sc.nextLine()));
                break;
            }catch(Exception e){
                System.out.println("Virheellinen syöte!");
            }
        }        
        while(true){
            System.out.print("Syötä tilauksen kesto kuukausina: ");
            try{
                kuukausitilaus.setTilauksen_kesto(Integer.valueOf(sc.nextLine()));
                break;
            }catch(Exception e){
                System.out.println("Virheellinen syöte!");
            }
        }
        
        printSubscriptionInvoice(kestotilaus);
        printSubscriptionInvoice(kuukausitilaus);
           
    }
    
    static void printSubscriptionInvoice(Subscription subs){
           subs.printInvoice();        
    }
        
}