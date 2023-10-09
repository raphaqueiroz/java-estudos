public class Lampada {
    private boolean acesa; // atributo
    
    public Lampada(boolean acesa) { // método construtor da classe
        this.acesa = acesa;
    }
    
    public void acender () { // metodo público
        this.acesa = true;
    }
    public void apagar () { // metodo público
        this.acesa = false;
    }
    public boolean isAcesa () { // "getter" é "is" para boolean
        return acesa;
    }
    public void setAcesa (boolean acesa) { // setter
        this.acesa = acesa;
    }

    
        public static  void main(String[]args){

            int cont = 1; // variável local
            Lampada lamp1 = new Lampada(true); // instanciando objeto 1
            Lampada lamp2 = new Lampada(false); // insatanciando objeto 2

            while (cont < 5) {
                System.out.println("-- Iteração (repetição): " + cont);
                System.out.println("Lâmpada[lamp1] = " + (lamp1.isAcesa() ?"acesa" : "apagada"));
                System.out.println("Lâmpada[lamp2] = " + (lamp2.isAcesa() ?"acesa" : "apagada"));
                System.out.println();
                lamp1.setAcesa(!(lamp1.isAcesa())); // troca o estado da lamp1;
                lamp2.setAcesa(!(lamp2.isAcesa())); // troca o estado da lamp2;
                cont ++;

            }
        
        }
    }