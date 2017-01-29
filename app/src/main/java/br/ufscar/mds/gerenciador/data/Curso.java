package br.ufscar.mds.gerenciador.data;

/**
 * Created by gabri on 29/01/2017.
 */

public class Curso {
    private int id;
    private String nome;
    private String horario1;
    private String horario2;
    private int semestreId;

    public Curso() {
    }

    public Curso(int id, String nome, String horario1, String horario2) {
        this.id = id;
        this.nome = nome;
        this.horario1 = horario1;
        this.horario2 = horario2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario1() {
        return horario1;
    }

    public void setHorario1(String horario1) {
        this.horario1 = horario1;
    }

    public String getHorario2() {
        return horario2;
    }

    public void setHorario2(String horario2) {
        this.horario2 = horario2;
    }

    public int getSemestreId() {
        return semestreId;
    }

    public void setSemestreId(int semestreId) {
        this.semestreId = semestreId;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", horario1='" + horario1 + '\'' +
                ", horario2='" + horario2 + '\'' +
                ", semestreId=" + semestreId +
                '}';
    }
}
