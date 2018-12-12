
package boletin3;

public class Consumo {
    private float km = 80f;
    private float litros = 5f;
    private float vMed = 120f;
    private float pGas = 1.57f;
    //Constructores
    public Consumo(){
        
    }
    public Consumo(float k, float l, float v, float p){
        km = k;
        litros = l;
        vMed = v;
        pGas = p;
    }
    public float tempo(){
        float tempo;
        tempo = vMed/km;
        return tempo;
    }
    public float consumoMedio(){
        float consumoMedio;
        consumoMedio = litros*100/km;
        return consumoMedio;
    }
    public float consumoEuros(){
        float consumoEuros;
        consumoEuros = litros * pGas;
        return consumoEuros;
    }
    public void setKms(float k){
        km = k;
    }
    public void setLitros(float l){
        litros = l;
    }
    public void setvMed(float v){
        vMed = v;
    }
    public void setpGas(float p){
        pGas = p;
    }
    public float getKms(){
        return this.km;
    }
    public float getLitros(){
        return this.litros;
    }
    public float getvMed(){
        return this.vMed;
    }
    public float getpGas(){
        return this.pGas;
    }
}
    
