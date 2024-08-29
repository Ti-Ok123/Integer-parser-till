import utils.List;

public class Scanner {
    private boolean fehler;
    private String eingabe;
    private Token aktuellesToken;
    private List<Token> tokenliste;

    public Scanner(String pEingabe, List<Token> pTokenliste) {
        eingabe = pEingabe;
        tokenliste = pTokenliste;
    }

    public void scanne() {
        char zeichen;
        int pos = 0;

        while (eingabe.charAt(pos) != '#') {
            zeichen = eingabe.charAt(pos);

            switch (zeichen) {
                case '0':
                    aktuellesToken = new Token("Int", "0");
                    break;
                case '1':
                    aktuellesToken = new Token("Int", "1");
                    break;
                case '2':
                    aktuellesToken = new Token("Int", "2");
                    break;
                case '3':
                    aktuellesToken = new Token("Int", "3");
                    break;
                case '4':
                    aktuellesToken = new Token("Int", "4");
                    break;
                case '5':
                    aktuellesToken = new Token("Int", "5");
                    break;
                case '6':
                    aktuellesToken = new Token("Int", "6");
                    break;
                case '7':
                    aktuellesToken = new Token("Int", "7");
                    break;
                case '8':
                    aktuellesToken = new Token("Int", "8");
                    break;
                case '9':
                    aktuellesToken = new Token("Int", "9");
                    break;
                case '+':
                    aktuellesToken = new Token("Vorzeichen", "+");
                    break;
                case '-':
                    aktuellesToken = new Token("Vorzeichen", "-");
                    break;
                default:
                    fehler = true;
                    break;
            }
            pos++;
            tokenliste.append(aktuellesToken);
        }
        ausgabe(fehler);
    }

    private void ausgabe(boolean pFehler){
        if(pFehler) {
            System.out.println("Es gab einen Fehler");
        }
    }

    public List<Token> getTokenliste(){
        return tokenliste;
    }
}
