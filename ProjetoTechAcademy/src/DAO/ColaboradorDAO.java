package DAO;

import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class ColaboradorDAO extends AbsGenericDAO<Colaborador> {

    @Override
    public Colaborador create(Colaborador novo) {
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1; //recurso do auto incremento. soma 1.
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo); //adiciona o novo colaborador no repositório
        return novo; //devolve o novo registro com o código atualizado
    }

    @Override
    public Colaborador delete(Colaborador apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Colaborador readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Colaborador update(Colaborador alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    public ColaboradorDAO() {
        this.repositorio = new ColaboradorFakeDB().getDados();
}   


    
}
