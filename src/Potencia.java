public class Potencia {
    private String cad="";
    public Potencia(int x, int y){
    }//CONSTRUCTOR

    
    public int potencia(int x,int y){
        if(y==1){//EXPONENTE A LA 1 IGUAL A NUMERO INGRESADO          
            return x;
        }else if(y==0){//EXPONENTE A LA 0 SIEMPRE SERA 1
            return 1;
        }else{
            return x*potencia(x,y-1);
        } 
    }

}
