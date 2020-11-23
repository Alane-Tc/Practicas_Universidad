package tecmilenio.alantamez;
import java.util.*;

public class Deck {
    private HashMap<String,String> palos = new HashMap<String, String>();
    private ArrayList<Card> juego = new ArrayList<Card>();
    private String strFormat = "Quedan %s";

    public ArrayList<Card> getJuego() {
        return juego;
    }
    Deck(){
      initPalos();
      init();
    }

    public void reset_game() throws Exception{
        if(juego.size()>=1 && juego.size()<=52)
            throw new Exception("No se puede reiniciar el juego, hasta que se agoten las cartas");
        initPalos();
        init();
        shuffle_head();
        System.out.println("Se reinicio el juego");
    }
    public void initPalos(){
        palos.put("Diamante","Rojo");
        palos.put("Trebol","Negro");
        palos.put("Pica","Negro");
        palos.put("Corazon","Rojo");
    }

    public void init(){
        for (Map.Entry<String,String> palo:palos.entrySet()){
            for (int i=1;i <= 13;i++){
                Card card = new Card(palo.getKey(), palo.getValue());
                card.setValor(i);
                juego.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(juego);
        System.out.println("Se mezcló el Deck");
    }

    public void head() throws Exception{
        if (juego.isEmpty())
            throw new Exception("Se han agotado las cartas");

        var card = juego.get(juego.size()-1);
        juego.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,juego.size()));
    }

    public void shuffle_head(){
        Collections.shuffle(juego);
    }

    public void pick() throws Exception{
        if (juego.isEmpty())
            throw new Exception("Se han agotado las cartas");
        var card = randomCard();
        juego.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,juego.size()));
    }

    public void hand()throws Exception{
         if (juego.isEmpty())
            throw new Exception("No hay cartas suficientes para continuar el juego");
        if(juego.size() <=5)//{

            throw new Exception("No hay cartas suficientes para continuar el juego");

        /*}else {*/
            var cards = new ArrayList<Card>();
            Card card;
            for (int i=1;i<=5;i++){
                card = randomCard();
                juego.remove(card);
                cards.add(card);
            }
            printHand(cards);
            System.out.println(String.format(strFormat,juego.size()));
        //}
    }

    private void printHand(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }

    private Card randomCard(){
        var rnd = (int)Math.floor(Math.random()*(1-juego.size()+1)+juego.size());
        return juego.get(rnd);
    }
}
