public class Teste {
    public static void main(String[] args) {
        // Adicionando os clubes
        Clube clube1 = new Clube("Atlético", 0, 0);
        Clube clube2 = new Clube("Bahia", 0, 0);
        Clube clube3 = new Clube("Botafogo", 0, 0);
        Clube clube4 = new Clube("Brasil", 0, 0);
        Clube clube5 = new Clube("Ceará", 0, 0);
        Clube clube6 = new Clube("Cruzeiro", 0, 0);
        Clube clube7 = new Clube("Cuiabá", 0, 0);
        Clube clube8 = new Clube("Santos ", 0, 0);
        Clube clube9 = new Clube("Vitória", 0, 0);
        Clube clube10 = new Clube("Grêmio ", 0, 0);
        
        // Adicionando os clubes no ArrayList
        Campeonato campeonato = new Campeonato();
        campeonato.clubes.add(clube1);
        campeonato.clubes.add(clube2);
        campeonato.clubes.add(clube3);
        campeonato.clubes.add(clube4);
        campeonato.clubes.add(clube5);
        /*
        campeonato.clubes.add(clube6);
        campeonato.clubes.add(clube7);
        campeonato.clubes.add(clube8);
        campeonato.clubes.add(clube9);
        campeonato.clubes.add(clube10);
        */

        //Exibindo informações iniciais
        System.out.println("\n---------- CAMPEONATO INICIADO ----------");
        System.out.println("\n--> Participantes: " + campeonato.clubes);
        System.out.println("\n--> Quantidade de participantes: " + campeonato.clubes.size());
       
        //Iniciando o campeonato
        campeonato.jogarCampeonato();
    }
}