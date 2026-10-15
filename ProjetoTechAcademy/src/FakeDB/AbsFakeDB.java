package FakeDB;

import java.util.ArrayList;

import Dominio.AbsPessoa;
//usa generic.
public abstract class AbsFakeDB {
    protected ArrayList<AbsPessoa> dados;

    public ArrayList<AbsPessoa> getDados(){
        return this.dados;
    }

    protected abstract void autoPreencher();
}
