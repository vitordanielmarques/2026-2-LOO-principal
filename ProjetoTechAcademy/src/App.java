import FakeDB.AlunoFakeDB;
import FakeDB.ColaboradorFakeDB;
import FakeDB.ProfessorEfetivoFakeDB;
import FakeDB.ProfessorFakeDB;
import Dominio.AbsPessoa;
import Dominio.Aluno;
import Dominio.Colaborador;
import Dominio.Professor;
import Dominio.ProfessorEfetivo;
import DAO.ColaboradorDAO;
import DAO.AlunoDAO;
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

        AlunoDAO daoAluno = new AlunoDAO();

        ArrayList<Aluno> alunos = daoAluno.readAll();
        for (Aluno aluno : alunos) {
            aluno.exibir();
        }

        Aluno aluno01 = new Aluno(0, "Filipe", "95102", "20261116");
        daoAluno.create(aluno01);

        alunos = daoAluno.readAll();
        for (Aluno aluno : alunos) {
            aluno.exibir();
        }
    }
}