import java.util.Scanner;

public class PankkitiliMain{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);        
        Pankkitili tili = new Pankkitili();
        System.out.println("Luotiin uusi pankkitili. Anna seuraavat tiedot:");       
        
        System.out.print("Tilin omistaja: ");
        tili.setOmistaja(sc.nextLine());
        
        System.out.print("Tilinumero: ");
        tili.setTilinumero(sc.nextLine());  
        
        System.out.print("Tilin saldo: ");
        tili.setSaldo(Integer.valueOf(sc.nextLine()));
        System.out.println("");
        
        tili.tulostaTili();
        
        tili.otto(500);
        
        tili.tulostaTili();
    }
}
