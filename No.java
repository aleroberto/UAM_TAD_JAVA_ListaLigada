public class No {
    String dado;
    No proximoNo;
    No anteriorNo;
    
    public No(String dado) {
        this.dado = dado;
        this.proximoNo = null;
    }
    void inserir(String novoDado) {
        No novoNo = new No(novoDado);
        novoNo.proximoNo = null;
    }
}