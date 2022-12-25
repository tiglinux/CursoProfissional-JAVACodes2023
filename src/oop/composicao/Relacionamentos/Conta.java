package oop.composicao.Relacionamentos;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int codigo;
    private Cliente cliente;
    private List<Transacao> transacoes = new ArrayList<Transacao>();
    private int qtdTransacoes;

}
