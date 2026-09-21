public class Ninja {

    private int idNinja;
    private String Nome;
    private int idade;
    private String Vila;

    public Ninja(int idNinja, String nome, int idade, String vila) {
        this.idNinja = idNinja;
        this.Nome = nome;
        this.idade = idade;
        this.Vila = vila;
    }



    public int getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(int idNinja) {
        this.idNinja = idNinja;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return Vila;
    }

    public void setVila(String vila) {
        Vila = vila;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "idNinja=" + idNinja +
                ", Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", Vila='" + Vila + '\'' +
                '}';
    }
}
