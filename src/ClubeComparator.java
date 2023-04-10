import java.util.Comparator;

public class ClubeComparator implements Comparator<Clube>{

    // Ordena em relação a saldo de gols de forma decrescente
    @Override
    public int compare(Clube clube1, Clube clube2) {
        if (clube1.saldoGols > clube2.getSaldoGols()){
            return -1;
        }if (clube1.saldoGols < clube2.getSaldoGols()){
            return 1;
        }
        return 0;
    }   
}