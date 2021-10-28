import java.time.LocalDate;

public class Saco {
    private int numLote,cod;
    private double peso;
    private LocalDate fechaProduccion;
    private String categoria;

    public Saco(int id){
        this.cod=id;
        fechaProduccion = LocalDate.now();
        categoria();
        peso();
    }

    private void peso(){
        this.peso = (int)(Math.random()*25)+25;
        switch(this.categoria){
            case "super":{
                this.peso=this.peso+(this.peso*0.2);
                break;
            }
            case "extra":{
                this.peso=this.peso+(this.peso*0.25);
                break;
            }
        }
    }

    private void categoria(){
        int random = (int)(Math.random()*100)+1;
        if(random<=60){
            categoria="normal";
        }
        else if(random>60 && random<=85){
            categoria="super";
        }
        else{
            categoria="extra";
        }
    }
}
