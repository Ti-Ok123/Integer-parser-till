import utils.List;

public class Token {
    private String wert;
    private String typ;

    public Token(String pWert, String pTyp){
        this.wert = pWert;
        this.typ = pTyp;
    }

    public String getWert() {
        return wert;
    }

    public void setWert(String pWert) {
        this.wert = wert;
    }

    public void setTyp(String pTyp) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }
}