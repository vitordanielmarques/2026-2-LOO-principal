import FakeDB.AlunoFakeDB;
import FakeDB.ColaboradorFakeDB;
import FakeDB.ProfessorEfetivoFakeDB;
import FakeDB.ProfessorFakeDB;
import Dominio.AbsPessoa;
import Dominio.Aluno;
import Dominio.Colaborador;
import Dominio.Professor;
//import Dominio.ProfessorEfetivo;
//import FakeDB.*;
import DAO.ColaboradorDAO;
import Dominio.*;
import DAO.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorDAO dao = new ColaboradorDAO();

        ArrayList<Colaborador> colab = dao.readAll();
        for (Colaborador item : colab) {
            item.exibir();
        }

        Colaborador colab01 = new Colaborador(0, "Lula", "95101", "Presidente");
        dao.create(colab01);
        //colab01.exibir(); exibe só o objeto criado.

        colab = dao.readAll();
        for (Colaborador item : colab) {
            item.exibir();
        }
    }
}