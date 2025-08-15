package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributos
    private List<Pessoa> pessoaList;
    //construtor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ornedacaoPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura,new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println(ordenacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacaoPessoas.ornedacaoPorAltura());

    }
}
