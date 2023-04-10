import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Campeonato{
    //Variáveis
    public ArrayList<Clube> clubes = new ArrayList<Clube>();
    Random random = new Random();

    public void jogarCampeonato(){
        int t = 0;
        int qtdJogos = 0 ; 
        System.out.println("\n---------- PARTIDAS ----------");
        while (t < clubes.size()) {
            for (int i = 0; i < clubes.size(); i++) {
               if (t != i) {
                    System.out.println("--> " + (qtdJogos+1) + "º partida: " + clubes.get(t).nome + "  VS  " + clubes.get(i).nome);
                    // Chamando método jogar partida
                    jogarPartida(clubes.get(t), clubes.get(i)); 
                    qtdJogos++;
                }
            }
            t++;
        }
        getClassificacao();
        getCampeao();
    }

    private void jogarPartida(Clube m, Clube v){
        //Quantidade de gols marcados
        int qtdGolsClubeM = random.nextInt(6);
        int qtdGolsClubeV = random.nextInt(6);

        //Saldos de gols atualizados - Diferença entre os marcados e sofridos
        int mSaldoGols = qtdGolsClubeM - qtdGolsClubeV;
        int vSaldoGols = qtdGolsClubeV - qtdGolsClubeM;
        
        //System.out.println("\nResultado da partida: ");
        if (qtdGolsClubeM > qtdGolsClubeV) {
            m.ganhar(mSaldoGols);
            v.perder(vSaldoGols);
            System.out.println("-> Vencedor: " + m.getNome());
            System.out.println(m.nome + " fez " + qtdGolsClubeM + " gols");
            System.out.println(v.nome + " fez " + qtdGolsClubeV+ " gols\n");
        }else if (qtdGolsClubeM == qtdGolsClubeV) {
            m.empatar();
            v.empatar();
            System.out.println("-> Empate");
            System.out.println(m.nome + " fez " + qtdGolsClubeM + " gols");
            System.out.println(v.nome + " fez " + qtdGolsClubeV+ " gols\n");
        } else {
            v.ganhar(vSaldoGols);
            m.perder(mSaldoGols);
            System.out.println("-> Vencedor: " + v.getNome());
            System.out.println(m.nome + " fez " + qtdGolsClubeM + " gols");
            System.out.println(v.nome + " fez " + qtdGolsClubeV+ " gols\n");
        }
    }

    // Classificando os clubes
    public ArrayList<Clube> getClassificacao(){
        // Deixando ordenado de acordo com saldo de gols
        Collections.sort(clubes, new ClubeComparator());
        //Deixando ordenado de acordo com pontos.
        Collections.sort(clubes);
        return clubes;
    }

    // Anunciando o campeão
    public void getCampeao(){
        ArrayList<Clube> ganhador = getClassificacao();
        System.out.println("\nPlacar geral: " + getClassificacao());
        System.out.println("\n----- Ganhador do Campeonato -----");
        System.out.println("-> Nome: " + ganhador.get(0).nome);
        System.out.println("-> Pontuação: " + ganhador.get(0).pontos);
        System.out.println("-> Saldo de gols: " + ganhador.get(0).saldoGols);
    }
    
    // Metódo get e set
    public ArrayList<Clube> getClubes(){
        return this.clubes;
    }
    public void setClubes(ArrayList<Clube> clubes){
        this.clubes = clubes;
    }    
}
