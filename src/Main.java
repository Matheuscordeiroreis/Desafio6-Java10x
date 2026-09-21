import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner entradasDeDados = new Scanner(System.in);
        int input = 0;

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        listDeNinjas.add(new Ninja(1,"Naruto Uzumaki", 17, "Folha"));
        listDeNinjas.add(new Ninja(2,"Sasuke Uchiha", 18, "Konoha"));
        listDeNinjas.add(new Ninja(3,"Sakura Haruno", 19, "Konoha"));
        listDeNinjas.add(new Ninja(4,"Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja(5,"Gaara", 20, "Areia"));
        listDeNinjas.add(new Ninja(6,"Shikamaru Nara", 21, "Konoha"));
        listDeNinjas.add(new Ninja(7,"Temari", 22, "Areia"));

        while (input !=8){
            System.out.println("========== MENU =========");
            System.out.println("1. Ver lista de ninjas.");
            System.out.println("2. Adicionar um novo ninja a lista");
            System.out.println("3. Remover o primeiro ninja da lista");
            System.out.println("4. Ver informações de um ninja.");
            System.out.println("5. Ver ninja por nome em ordem alfabetica.");
            System.out.println("6. Ver ninja por ordem de idade.");
            System.out.println("7. Ver ninja por vila em ordem alfabetica.");
            System.out.println("8. Sair");
            input = entradasDeDados.nextInt();

            switch (input){
                case 1:
                    System.out.println("=============== Lista de ninja ==============");
                    for (Ninja ninja : listDeNinjas){
                        System.out.println(ninja);
                    }break;

                case 2:
                    int idInput;
                    String nomeInput;
                    int idadeInput;
                    String vilaInput;

                    System.out.println("====== Adicionar um ninja na primeira posição. ======");
                    System.out.println("Digite o id do ninja: ");
                    idInput = entradasDeDados.nextInt();
                    entradasDeDados.nextLine();
                    System.out.println("Digite o nome do ninja: ");
                    nomeInput = entradasDeDados.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    idadeInput = entradasDeDados.nextInt();
                    entradasDeDados.nextLine();
                    System.out.println("Digite a vila que o ninja pertence: ");
                    vilaInput = entradasDeDados.nextLine();
                    listDeNinjas.addFirst(new Ninja(idInput,nomeInput, idadeInput, vilaInput));
                    break;

                case 3:
                    System.out.println("====== Remover o primeiro ninja =======");
                    listDeNinjas.removeFirst();
                    break;

                case 4:
                    int idBusca;
                    System.out.println("======= Pesquisa do ninja =======");
                    for (Ninja ninja : listDeNinjas){
                        System.out.println("Nome: "+ ninja.getIdNinja() + ninja.getNome());
                    }
                    System.out.println("Digite o id do ninja: ");
                    idBusca = entradasDeDados.nextInt();
                    idBusca -= 1;
                    Ninja buscarninjaNinja = listDeNinjas.get(idBusca);
                    System.out.println("As informações do ninja pedido e : "+ buscarninjaNinja);
                    break;

                case 5:
                    System.out.println("=============== Listar por nome ==================");
                    listDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                    System.out.println(listDeNinjas);
                    break;

                case 6:
                    System.out.println("=============== Listar por idade ==================");
                    listDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                    System.out.println(listDeNinjas);
                    break;

                case 7:
                    System.out.println("============== Listar por vila ====================");
                    listDeNinjas.sort(Comparator.comparing(Ninja::getVila));
                    System.out.println(listDeNinjas);
                    break;

                default:
                    break;


            }
        }

    }

}

