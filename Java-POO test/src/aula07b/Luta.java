
package aula07b;
public class Luta {
  private Lutador desafiado;  
  private Lutador desafiante;
  private int runds;
  private boolean aprovada;
  //--metodos

  public void marcarLuta(Lutador l1,Lutador l2){
      if(l1.getCategoria() == l2.getCategoria()&& l1 != l2){
         this.aprovada = true; 
         this.desafiado=l1;
         this.desafiante=l2;
      }else{
          this.aprovada =false;
          this.desafiado=null;
          this.desafiante=null;
      }
  }

    public  void lutar(){
        if(this.aprovada){
            System.out.println("+Desafiado+");
            this.desafiante.apresentar();
            System.out.println("+-Desafiante+-");
            this.desafiante.apresentar();
            Radom aleatorio = new Radom();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:    
                   System.out.println("Venceu o:" + this.desafiado.getNome()); 
                   this.desafiado.ganhaLuta();
                   this.desafiante.perderLuta();
                   break;
                case 2:    
                    System.out.println("Venceu o:" + this.desafiado.getNome()); 
                   this.desafiado.perderLuta();
                   this.desafiante.ganhaLuta();
                    break;
            }   
        }else{
           System.out.println("A luta nao pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRunds() {
        return runds;
    }

    public void setRunds(int runds) {
        this.runds = runds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
