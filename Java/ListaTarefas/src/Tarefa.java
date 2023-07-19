class Tarefa {
    private static int proximoId = 1;
    private int id;
    private String descricao;
    private String dataConclusao;

    public Tarefa(String descricao, String dataConclusao) {
        this.id = proximoId++;
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }
}