
class ListaLigada {
    No first;
    No last;

    public ListaLigada() {
        first = last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFront(String info) {
        No novoNo = new No(info);
        if(isEmpty()) {
            first = last = novoNo;
        } else {
            first.anteriorNo = novoNo;
            novoNo.proximoNo = first;
            first = novoNo;
        }
    }

    public void insertBack(String info) {
        No novoNo = new No(info);
        if(isEmpty()) {
            first = last = null;
        } else {
            last.proximoNo = novoNo;
            novoNo.anteriorNo = last;
            last = novoNo;
        }
    }


}