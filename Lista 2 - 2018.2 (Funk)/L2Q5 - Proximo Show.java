import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      int diaAtual, mesAtual, anoAtual, diaShow, mesShow, anoShow, quantidadeDiasMes ,diasAteOShow = 0, ano, mes, dias;

        Scanner in = new Scanner(System.in);
        diaAtual = in.nextInt();
        mesAtual = in.nextInt();
        anoAtual = in.nextInt();
        diaShow = in.nextInt();
        mesShow = in.nextInt();
        anoShow = in.nextInt();

        for(ano = anoAtual; ano <=  anoShow; ano++){
            for(mes = mesAtual; mes <= 12; mes++){
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        quantidadeDiasMes = 31;

                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        quantidadeDiasMes = 30;

                        break;
                    default:
                        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                            quantidadeDiasMes = 29;
                        } else {
                            quantidadeDiasMes = 28;
                        }
                        break;
                }
                        for (dias = diaAtual; dias <= quantidadeDiasMes; dias++){
                            if (dias == diaShow && mes == mesShow && ano == anoShow){
                                break;
                        } else {
                    diasAteOShow += 1;
                    }
                }
                diaAtual = 1;
                if (mes == mesShow && ano == anoShow){
                    break;
                }
            }
            
            mesAtual = 1;
        }
        System.out.printf("%d", diasAteOShow);
  }
}
