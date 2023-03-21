import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choix = 1;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");

        System.out.println("Choisir votre langue pour dire bonjour ");
        System.out.println("1 : Anglais");
        System.out.println("2 : Breton");

        choix = sc.nextInt();

        while((choix > 2) || (choix <= 0) ){
            System.out.println("Valeur invalide, merci de faire un choix entre 1 (Anglais) et 2 (Breton)");
            choix = sc.nextInt();
        }

        if(choix == 1){
            System.out.println(vAnglais.getTraduction("Bonjour"));
        }else{
            System.out.println(vBreton.getTraduction("Bonjour"));
        }


        //Fenetre f = new Fenetre();
        //f.setVisible(true);
    }
}