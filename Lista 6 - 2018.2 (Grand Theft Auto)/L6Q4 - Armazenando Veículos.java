import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaVeiculos listaAvioes = new ListaVeiculos();
        ListaVeiculos listaBicicletas = new ListaVeiculos();
        ListaVeiculos listaCarros = new ListaVeiculos();
        ListaVeiculos listaMotos = new ListaVeiculos();
        ListaVeiculos listaTanques = new ListaVeiculos();
        ListaVeiculos listaSubmarinos = new ListaVeiculos();
        String aux;

        while (in.hasNext()) {
            String tipoEntrada = in.next();
            String tipoVeiculo = in.next();
            if (tipoEntrada.equals("VERIFICAR")) {
                if (tipoVeiculo.substring(0, 2).equals("65")) {
                    if (listaAvioes.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("66")) {
                    if (listaBicicletas.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("67")) {
                    if (listaCarros.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("77")) {
                    if (listaMotos.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("84")) {
                    if (listaTanques.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                } else {
                    if (listaSubmarinos.procurar(tipoVeiculo).equals(tipoVeiculo)) {
                        System.out.println("EXISTE");
                    } else {
                        System.out.println("AINDA NAO");
                    }
                }
            } else if (tipoEntrada.equals("IMPRIMIR")) {
                if (tipoVeiculo.substring(0, 2).equals("65")) {
                    aux = listaAvioes.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("66")) {
                    aux = listaBicicletas.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("67")) {
                    aux = listaCarros.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("77")) {
                    aux = listaMotos.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("84")) {
                    aux = listaTanques.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                } else {
                    aux = listaSubmarinos.toString();
                    if (aux.equals("")) {
                        System.out.println("A GARAGEM ESTA VAZIA :(");
                    } else {
                        System.out.println(aux);
                    }
                }
            } else if (tipoEntrada.equals("VEICULO!!!")) {
                if (tipoVeiculo.substring(0, 2).equals("65")) {
                    listaAvioes.inserir(tipoVeiculo);
                } else if (tipoVeiculo.substring(0, 2).equals("66")) {
                    listaBicicletas.inserir(tipoVeiculo);
                } else if (tipoVeiculo.substring(0, 2).equals("67")) {
                    listaCarros.inserir(tipoVeiculo);
                } else if (tipoVeiculo.substring(0, 2).equals("77")) {
                    listaMotos.inserir(tipoVeiculo);
                } else if (tipoVeiculo.substring(0, 2).equals("83")) {
                    listaSubmarinos.inserir(tipoVeiculo);
                } else if (tipoVeiculo.substring(0, 2).equals("84")) {
                    listaTanques.inserir(tipoVeiculo);
                } else {
                    System.out.println("VERIFICAR TIPO DE VEICULO");
                }
            } else {
                if (tipoVeiculo.substring(0, 2).equals("65")) {
                    String aux1 = listaAvioes.repeticao("");
                    if (!aux1.equals("")) {
                        System.out.println(aux1.substring(0, aux1.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("66")) {
                    String aux2 = listaBicicletas.repeticao("");
                    if (!aux2.equals("")) {
                        System.out.println(aux2.substring(0, aux2.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("67")) {
                    String aux3 = listaCarros.repeticao("");
                    if (!aux3.equals("")) {
                        System.out.println(aux3.substring(0, aux3.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("77")) {
                    String aux4 = listaMotos.repeticao("");
                    if (!aux4.equals("")) {
                        System.out.println(aux4.substring(0, aux4.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                } else if (tipoVeiculo.substring(0, 2).equals("84")) {
                    String aux5 = listaTanques.repeticao("");
                    if (!aux5.equals("")) {
                        System.out.println(aux5.substring(0, aux5.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                } else {
                    String aux6 = listaSubmarinos.repeticao("");
                    if (!aux6.equals("")) {
                        System.out.println(aux6.substring(0, aux6.length() - 1));
                    } else {
                        System.out.println("NADA REPETIDO POR ENQUANTO :)");
                    }
                }
            }
        }
    }
}

class ListaVeiculos {
    private String veiculo;
    private ListaVeiculos proximo;

    ListaVeiculos() {
        this.veiculo = "";
        this.proximo = null;
    }

    public void inserir(String veiculo) {
        if (this.veiculo.equals("")) {
            this.veiculo = veiculo;
            this.proximo = new ListaVeiculos();
        } else if (Integer.parseInt(this.veiculo) > Integer.parseInt(veiculo)) {
            String aux = this.veiculo;
            this.veiculo = veiculo;
            this.proximo.inserir(aux);
        } else {
            this.proximo.inserir(veiculo);
        }
    }

    public void remover(String veiculo) {
        if (!this.veiculo.equals("")) {
            if (this.veiculo.equals(veiculo)) {
                this.veiculo = veiculo;
                this.veiculo = this.proximo.veiculo;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(veiculo);
            }
        }
    }

    public String procurar(String veiculo) {
        if (!this.veiculo.equals("")) {
            if (this.veiculo.equals(veiculo)) {
                return veiculo;
            } else {
                return this.proximo.procurar(veiculo);
            }
        } else {
            return "";
        }
    }

    public String repeticao(String veiculo) {
        if (this.veiculo.equals("")) {
            return "";
        } else {
            if (this.veiculo.equals(this.proximo.procurar(this.veiculo))) {
                this.remover(this.veiculo);
                return this.veiculo + " " + this.repeticao(this.proximo.veiculo);
            } else {
                return this.proximo.repeticao(this.proximo.veiculo);
            }
        }
    }

    public String toString() {
        String resposta = "" + this.veiculo;
        if (this.proximo != null) {
            if (this.proximo.proximo != null) {
                resposta = resposta + " " + this.proximo.toString();
            } else {
                resposta = resposta + this.proximo.toString();
            }
        }
        return resposta;
    }
}
