package hashing;

import java.util.LinkedList;
import java.util.List;

public class HashingEncadeamentoAberto implements EstruturaDeDados {
    private List<List<Integer>> tabelaHash;
    private int capacidade;

    public HashingEncadeamentoAberto() {
        this.capacidade = 1000; // Capacidade inicial da tabela
        this.tabelaHash = new LinkedList<>();

        for (int i = 0; i < capacidade; i++) {
            tabelaHash.add(new LinkedList<>());
        }
    }

    @Override
    public void insert(int chave) {
        int indice = hash(chave);
        tabelaHash.get(indice).add(chave);
    }

    @Override
    public void delete(int chave) {
        int indice = hash(chave);
        int posicao = tabelaHash.get(indice).indexOf(chave);
        if (posicao != -1) {
            tabelaHash.get(indice).remove(posicao);
        }
    }

    @Override
    public boolean search(int chave) {
        int indice = hash(chave);
        return tabelaHash.get(indice).indexOf(chave) != -1;
    }

    private int hash(int chave) {
        return chave % capacidade;
    }
}