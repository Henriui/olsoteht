package tehtava5;

import java.util.PriorityQueue;

public class TapahtumaLista {

    private PriorityQueue<Tapahtuma> tapahtumat;

    public TapahtumaLista()
    {
        tapahtumat = new PriorityQueue<Tapahtuma>();
    }

    public void addTapahtuma(Tapahtuma tapahtuma)
    {
        tapahtumat.add(tapahtuma);
    }

    public Tapahtuma removeTapahtuma()
    {
        if (tapahtumat.peek() == null)
            return null;

        return tapahtumat.poll();
            

    }

    @Override
    public String toString() 
    {
        PriorityQueue<Tapahtuma> sorted_tapahtumat = new PriorityQueue<Tapahtuma>(tapahtumat);
        String print = "";

        while (!sorted_tapahtumat.isEmpty())
           print += sorted_tapahtumat.poll().toString() + "\n";

        return "TapahtumaLista \n[tapahtumat=\n" + print + "\n]";
    }
    
    public boolean isEmpty()
    {
        if ( tapahtumat.peek() == null )
            return true;
        return false;
    }

}
