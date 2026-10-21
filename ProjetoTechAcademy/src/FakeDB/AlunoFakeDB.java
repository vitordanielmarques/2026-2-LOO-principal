package FakeDB;

import java.util.ArrayList;

import Dominio.Aluno;

public class AlunoFakeDB extends AbsGenericFakeDB<Aluno> {
    
    @Override
    protected void autoPreencher(){
        this.dados.add(new Aluno(201, "Ana Pseudo", "1236", "20261111"));
        this.dados.add(new Aluno(202, "Antonio Donizete", "1237", "20261112"));
        this.dados.add(new Aluno(203, "Pedro Cabalheiro", "1238", "20261113"));
        this.dados.add(new Aluno(204, "Kemy Akamine", "1239", "20261114"));
        this.dados.add(new Aluno(205, "Vitor Daniel", "1240", "20261115"));
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
