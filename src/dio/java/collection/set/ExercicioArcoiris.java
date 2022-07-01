package dio.java.collection.set;

import java.util.*;
import java.lang.*;


/*
Crie un conjunto contendo as cores do arco-iris e:
A. Exiba todas as cores uma abaixo da outra
B. A quantidade de cores que o arcoiris tem
C. Exiba as cores em ordem alfabetica
D. Exiba as cores na ordem inversa da que foi informada
E.Exiba todas as cores que começam com a letra "v"

*/

    public class ExercicioArcoiris {

        public static void main(String[] args) {
            //Crie un conjunto contendo as cores do arco-iris :
           Set<String> conjArcoiris = new LinkedHashSet<>();
            conjArcoiris.add("vermelho");
            conjArcoiris.add("laranja");
            conjArcoiris.add("amarelo");
            conjArcoiris.add("verde");
            conjArcoiris.add("azul");
            conjArcoiris.add("anil");
            conjArcoiris.add("violeta");
            System.out.println("Oconjunto de arcoiris é:" + conjArcoiris);


            //A. Exiba todas as cores uma abaixo da outra
            System.out.println("1. As cores do Arcoiris uma abaixo da outra :\n");
            for (String corArco : conjArcoiris) {

                System.out.println(corArco);
            }

            //B. A quantidade de cores que o arcoiris tem

            System.out.println("2. A quantidade de cores que o arcoiris tem é: " + conjArcoiris.size());

            //C. Exiba as cores em ordem alfabetica

            Set<String> ArcoAlfabetico = new TreeSet<>(conjArcoiris);

            System.out.println("3. Cores em ordem alfabetica: \n" + ArcoAlfabetico);

            //D. Exiba as cores na ordem inversa da que foi informada
            Set<String> Arcoiris = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
            List<String> Orderinverso = new ArrayList<>(Arcoiris);

            Collections.reverse(Orderinverso);
            System.out.println("Orden inverso\n: " + Orderinverso);

            // E.Exiba todas as cores que começam com a letra "v"
            System.out.println("E.Exiba todas as cores que começam com a letra v: ");
            for (String cores : conjArcoiris) {
                if (cores.startsWith("v")) {
                    System.out.println(cores);
                }

            }
            //F.Remova todas as cores que não começam com a letra v
            System.out.println("E.Exiba todas as cores que não começam com a letra v: ");
            for (String cores : conjArcoiris) {
                if (!cores.startsWith("v")) {
                    System.out.println(cores);
                }

            }
            //G.Limpe o conjunto
            System.out.println("Limpe o conjunto: ");
            conjArcoiris.clear();
            System.out.println("Conjunto Limpo ");

            //F.Confira se o conjunto esta vacio

            System.out.println("Confira se o conjunto esta vacio: ");
            if (conjArcoiris.isEmpty())
                System.out.println("O conjunto esta Vacio");


        }


    }/*
class ArcoObjeto{
        private String cor;

    public ArcoObjeto(java.lang.String cor) {
        this.cor = cor;
    }
}
*/


