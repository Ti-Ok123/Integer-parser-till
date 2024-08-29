import utils.List;

public class Parser {
    private List<Token> tokenliste;
    private Token aktuellesToken;


    public Parser(List<Token> pTokenliste) {
        tokenliste = pTokenliste;
        tokenliste.toFirst();
        aktuellesToken = tokenliste.getContent();
    }

    public Token nextToken(){
        tokenliste.next();
        return tokenliste.getContent();
    }

    public boolean parse(){
        if(tokenliste.hasAccess() && pruefeS()) {
            return true;
        }
        else {
            ausgabe(true);
            return false;
        }
    }
    public boolean pruefeS(){
        if(tokenliste.hasAccess() && aktuellesToken.getTyp().equals("Vorzeichen") || aktuellesToken.getTyp().equals("Zahl")) {
            aktuellesToken = nextToken();
            return pruefeZahl();
        }
        else {
            return false;
        }
    }

    public boolean pruefeZahl() {
        if(tokenliste.hasAccess() && aktuellesToken.getTyp().equals("Zahl") || aktuellesToken.getTyp().equals("Zahl")) {
            aktuellesToken = nextToken();
            return pruefeZahl();
        } else if (aktuellesToken.getTyp().equals("Zahl")) {
            return true;
        } else {
            return false;
        }
    }

}
