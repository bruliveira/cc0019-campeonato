public class Clube implements Comparable<Clube>{ 
    // Variáveis
    public String nome;
    public int pontos;
    public int saldoGols;

    Clube(String nome, int pontos, int saldoGols){
        this.nome = nome;
        this.pontos = pontos;
        this.saldoGols = saldoGols;
    }

    public String toString() {
		return "\nNome:  " + nome + "\tPontos: " + pontos + "\tSaldo de Gols: " + saldoGols;
		//return clube;
	}
    
    public int ganhar(int saldoGols){
        this.pontos = pontos + 3;
        this.saldoGols = this.saldoGols + saldoGols;
        return pontos;
    }
    
    public int empatar(){
        this.pontos = this.pontos + 1;
        //this.saldoGols = this.saldoGols;
        return pontos;
    }
    
    public int perder(int saldoGols){
        this.pontos = this.pontos + 0;
        this.saldoGols = this.saldoGols + saldoGols;
        return pontos;
    }

    // Metódos get's
    public String getNome(){
        return nome;
    }
    public int getPontos(){
        return pontos;
    }
    public int getSaldoGols(){
        return saldoGols;
    }
    
    //Metódos set's
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    public void setSaldoGols(int saldoGols){
        this.saldoGols = saldoGols;
    }

    // Ordena em relação a pontuação de maneira decrescente
    @Override
    public int compareTo(Clube clube) {
        if (this.pontos > clube.getPontos()){
            return -1;
        }if (this.pontos < clube.getPontos()){
            return 1;
        }
        return 0;
    }  
}