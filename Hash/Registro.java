package Hash;

public class Registro {

    private int key;
    private String value;
    private Registro proximo;

    public Registro() {
        this.proximo = null;
    }

    public Registro(int key, String value) {
        this.key = key;
        this.value = value;
        this.proximo = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int HashCode() {
        return (key % 13) ;
    }

    public Registro getProximo() {
        return proximo;
    }

    public void setProximo(Registro proximo) {
        this.proximo = proximo;
    }

}
