package hashing;

import java.util.Set;
import java.util.HashSet;

public class HashingComPorao implements EstruturaDeDados {
    private Set<Integer> conjuntoDeChaves;

    public HashingComPorao() {
        conjuntoDeChaves = new HashSet<>();
    }

    @Override
    public void insert(int chave) {
        conjuntoDeChaves.add(chave);
    }

    @Override
    public void delete(int chave) {
        conjuntoDeChaves.remove(chave);
    }

    @Override
    public boolean search(int chave) {
        return conjuntoDeChaves.contains(chave);
    }
}