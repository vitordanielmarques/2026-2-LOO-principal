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
import DAO.ProfessorDAO;
import DAO.ProfessorEfetivoDAO;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorDAO dao = new ColaboradorDAO();

        ArrayList<Colaborador> colab = dao.readAll();
        for (Colaborador itemColab : colab) {
            itemColab.exibir();
        }

        Colaborador colab01 = new Colaborador(0, "Lula", "95101", "Presidente");
        dao.create(colab01);
        //colab01.exibir(); exibe só o objeto criado.

        colab = dao.readAll();
        for (Colaborador itemColab : colab) {
            itemColab.exibir();
        }

        AlunoDAO daoAluno = new AlunoDAO();

        ArrayList<Aluno> alunos = daoAluno.readAll();
        for (Aluno itemAluno : alunos) {
            itemAluno.exibir();
        }

        Aluno aluno01 = new Aluno(0, "Filipe", "95102", "20261116");
        daoAluno.create(aluno01);

        alunos = daoAluno.readAll();
        for (Aluno itemAluno : alunos) {
            itemAluno.exibir();
        }

        ProfessorDAO daoProfessor = new ProfessorDAO();

        ArrayList<Professor> professores = daoProfessor.readAll();
        for (Professor itemProfessor : professores) {
            itemProfessor.exibir();
        }


    }
}