
package aula07b;
public class Aula07b {
    public static void main(String[] args) {
      Lutador l[]= new Lutador[6];
      l[0]= new Lutador("Carinha","Franca",31,1.75f,68.7f,11,2,1);
      l[1]= new Lutador("Putstrip","Brazel",32,1.76f,68.7f,14,6,4);
      l[2]= new Lutador("Segionho","Italy",39,1.85f,67.7f,11,5,9);
      l[3]= new Lutador("Blegan tlg","Justinopolis",24,2.75f,78.7f,41,5,11);
      l[4]= new Lutador("Joao cuzirto","Mato grosso",32,1.55f,48.7f,51,11,12);
      
      Luta UEC = new  Luta();
      UEC.marcarLuta(l[1], l[3]);
      UEC.lutar();
    }
    
}
