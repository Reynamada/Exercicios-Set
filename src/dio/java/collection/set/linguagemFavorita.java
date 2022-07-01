package dio.java.collection.set;


import java.util.*;
import java.lang.*;

public class linguagemFavorita {
    public static void main(String[] args){
        //A. ORDEM DE INSERÇÃO
        System.out.println("Ordem de Inserção: ");
        System.out.println("===================");
        Set<Linguagem> linguagemSet = new LinkedHashSet<>(){{
            add(new Linguagem("Java",1991,"Intelij"));
            add(new Linguagem("Python",1989,"Visual Studio"));
            add(new Linguagem("JavaScript",1995,"AIntelij"));
        }};
        for (Linguagem lingua: linguagemSet) System.out.println(lingua.getNome()+"-"+ lingua.getAnoCriacao()+"-"+ lingua.getIde());

        //B.Ordem Natural
        System.out.println("B.Ordem Natural: ");
        System.out.println("===========================");
        Set<Linguagem> OrdemNatural= new TreeSet<>(linguagemSet);
        for (Linguagem linguaN: OrdemNatural)
            System.out.println(linguaN.getNome()+"-"+ linguaN.getAnoCriacao()+"-"+ linguaN.getIde());

        //C.Ordenar por Ide con Comparator
        System.out.println("C.Ordenar por Ide: ");
        System.out.println("===========================");
        Set<Linguagem> OrdemIde= new TreeSet<>(new compararIde());
        OrdemIde.addAll(linguagemSet);
        for (Linguagem linguaIde: OrdemIde)
            System.out.println(linguaIde);

        //D. Ordenar por Ano de criação e nome
        System.out.println("D. Ordenar por Ano de criação e Nome: ");
        System.out.println("========================================");
        Set<Linguagem> OrdemAnoNome= new TreeSet<>(new compararAnoNome());
        OrdemAnoNome.addAll(linguagemSet);
        for (Linguagem linguaAnoIde: OrdemAnoNome)
            System.out.println(linguaAnoIde);

        //E. Ordenar por Nome, Ano de criação e Ide
        System.out.println("E. Ordenar por Nome, Ano de criação e Ide: ");
        System.out.println("========================================");
        Set<Linguagem> OrdemNomeAnoIde= new TreeSet<>(new compararNomeAnoIde());
        OrdemNomeAnoIde.addAll(linguagemSet);
        for (Linguagem linguaAnoIde: OrdemNomeAnoIde)
            System.out.println(linguaAnoIde);

        //F. Exibir as lenguagens um abaixo da outra
        System.out.println("F. Exibir as lenguagens um abaixo da outra: ");
        System.out.println("========================================");
        Set<Linguagem> OrdenLingua= new TreeSet<>(linguagemSet);
        for (Linguagem ordenL: OrdenLingua)
            System.out.println(ordenL.getNome());


    }
}
class Linguagem implements Comparable<Linguagem>{
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public Linguagem(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return Objects.equals(nome, linguagem.nome) && Objects.equals(anoCriacao, linguagem.anoCriacao) && Objects.equals(ide, linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.nome.compareTo(linguagem.nome);

    }

}
class compararIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem ide1, Linguagem ide2) {
        return ide1.getIde().compareToIgnoreCase(ide2.getIde());
    }
}

class compararAnoNome implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem AnoNome1, Linguagem AnoNome2) {

         int Ano= Integer.compare(AnoNome1.getAnoCriacao(), AnoNome2.getAnoCriacao());
         if (Ano != 0) return Ano;
         return  AnoNome1.getNome().compareToIgnoreCase(AnoNome2.getNome());

    }
}
class compararNomeAnoIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem NaI1, Linguagem NaI2) {

        int  nome= NaI1.getNome().compareToIgnoreCase(NaI2.getNome());
        if (nome!=0) return nome;

        int Ano= Integer.compare(NaI1.getAnoCriacao(), NaI2.getAnoCriacao());
        if (Ano != 0) return Ano;

        return NaI1.getIde().compareToIgnoreCase(NaI2.getIde());
    }
}


