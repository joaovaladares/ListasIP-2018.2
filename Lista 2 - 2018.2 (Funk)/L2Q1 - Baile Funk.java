import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      int I, Anitta = 0, Ludmilla = 0, Jojo = 0, Kevinho = 0, Livinho = 0, Outros = 0;
        String artista;

        Scanner in = new Scanner(System.in);
        I = in.nextInt();

        while (I > 0){
            artista = in.next();
            if (artista.equals("Anitta")){
                Anitta += 1;
            } else if (artista.equals("Ludmilla")){
                Ludmilla += 1;
            } else if (artista.equals("Jojo")){
                Jojo += 1;
            } else if (artista.equals("Kevinho")){
                Kevinho += 1;
            } else if (artista.equals("Livinho")){
                Livinho += 1;
            } else {
                Outros += 1;
            }
            I -= 1;
        }

        if (Anitta > Ludmilla && Anitta > Jojo && Anitta > Kevinho && Anitta > Livinho && Anitta > Outros){
            System.out.print("As pessoas estao esperando por Anitta.");
        }
        
        else if (Ludmilla > Anitta && Ludmilla > Jojo && Ludmilla > Kevinho && Ludmilla > Livinho && Ludmilla > Outros){
            System.out.print("As pessoas estao esperando por Ludmilla.");
        }
        
        else if (Jojo > Ludmilla && Jojo > Anitta && Jojo > Kevinho && Jojo > Livinho && Jojo > Outros){
            System.out.print("As pessoas estao esperando por Jojo.");
        }
        
        else if (Kevinho > Ludmilla && Kevinho > Jojo && Kevinho > Anitta && Kevinho > Livinho && Kevinho > Outros){
            System.out.print("As pessoas estao esperando por Kevinho.");
        }
        
        else if (Livinho > Ludmilla && Livinho > Jojo && Livinho > Kevinho && Livinho > Anitta && Livinho > Outros){
            System.out.print("As pessoas estao esperando por Livinho.");
        }
        
        else if (Outros > Ludmilla && Outros > Jojo && Outros > Kevinho && Outros > Anitta && Outros > Livinho) {
            System.out.print("As pessoas querem ver outra pessoa");
        } else{
            if (Anitta == Ludmilla && Anitta > 0 && Ludmilla > 0){
                System.out.print("Houve um empate entre: Anitta, Ludmilla");
            } else if (Anitta == Jojo && Anitta > 0 && Jojo > 0) {
                System.out.print("Houve um empate entre: Anitta, Jojo");
            } else if (Anitta == Kevinho && Anitta > 0 && Kevinho > 0) {
                System.out.print("Houve um empate entre: Anitta, Kevinho");
            } else if (Anitta == Livinho && Anitta > 0 && Livinho > 0) {
                System.out.print("Houve um empate entre: Anitta, Livinho");
            } else if (Ludmilla == Jojo && Ludmilla > 0 && Jojo > 0) {
                System.out.print("Houve um empate entre: Jojo, Ludmilla");
            } else if (Ludmilla == Kevinho && Ludmilla > 0 && Kevinho > 0){
                System.out.print("Houve um empate entre: Kevinho, Ludmilla");
            } else if (Ludmilla == Livinho && Ludmilla > 0 && Livinho > 0){
                System.out.print("Houve um empate entre: Livinho, Ludmilla");
            } else if (Jojo == Kevinho && Jojo > 0 && Kevinho > 0){
                System.out.print("Houve um empate entre: Jojo, Kevinho");
            } else if (Jojo == Livinho && Jojo > 0 && Livinho > 0){
                System.out.print("Houve um empate entre: Jojo, Livinho");
            } else if (Kevinho == Livinho && Kevinho > 0 && Livinho > 0){
                System.out.print("Houve um empate entre: Kevinho, Livinho");
            }
        }
  }
}
