package com.company;

public class SLR extends DataSet {
    public int Valor;
    public int Beta0;
    public int Beta1;
    public int Resultado;


    double  SumX=0,       // ΣXi                  Sumatoria de Xi
            SumY=0,       // ΣYi                  Sumatoria de Yi
            SumXY=0,      // ΣXi*Yi               Sumatoria de Xi * Yi
            SumXCuad=0,   // ΣXi ∧ 2 === (Xi*Xi)  Sumatoria de Xi al cuadrado
            nSumXCuad=0,  // n * ΣXi ∧ 2          Multiplicacion de n por sumatoria de xi al cuadrado
            SumX_Cuad=0,  // (ΣXi)∧ 2             Todas las Sumatoria Xi al cuadrado
            nSumXY=0;     // n * ΣXi*Yi           Multiplicacion de por Sumatoria de Xi * Yi

    double SumatoriaX(int[] x){
            //Ciclo para ir haciendo operaciones respectivas
            SumX=0;
            for( i=0; i<n; i++){
                SumX+=x[i];
            }
            return SumX;
    }

    double SumatoriaY(int[] y){
        //Ciclo para ir haciendo operaciones respectivas
        SumY=0;

        for( i=0; i<n; i++){
            SumY+=y[i];
        }
        return SumY;
    }

    double SumatoriaXY(int[] x, int[] y){
        SumXY=0;
        //Ciclo para ir haciendo operaciones respectivas
        for( i=0; i<n; i++){
            SumXY+=x[i]*y[i];
        }
        return SumXY;
    }

    double SumatoriaXCuad(int[] x){
        //Ciclo para ir haciendo operaciones respectivas
        SumXCuad=0;
        for( i=0; i<n; i++){
            SumXCuad+=x[i]*x[i];
        }
        return SumXCuad;
    }


    double DS = (n*SumatoriaXCuad(x)) - (SumatoriaX(x) * SumatoriaX(x));
    double DB0 = (SumatoriaY(y)*SumatoriaXCuad(x))-(SumatoriaX(x)*SumatoriaXY(x, y));   //DB0: DETERMINANTE DE BETA 0
    double DB1= (n*SumatoriaXY(x,y))-(SumatoriaX(x)*SumatoriaY(y));

    //--------------------Set And Get Beta1----------//
    public void setBeta0(int Beta0){
        this.Beta0=Beta0;
    }
    double getBeta0(){
        return  (DB0/DS);
    }
    //--------------------------------------------------------------------//

    //--------------------Set And Get Beta1----------//
    public void setBeta1(int Beta1){
        this.Beta1=Beta1;
    }
    double getBeta1(){
        return  (DB1/DS);
    }
    //--------------------------------------------------------------------//

    //--------------------Set And Get valor ingresado del usuario----------//
    public void setValor(int Valor){

        this.Valor=Valor;
    }
    double getValor(){
        return (Valor);
    }
    //--------------------------------------------------------------------//

     //--------------------Set And Get Resultado de la operacion----------//
    public void setResultado(int Resultado){

        this.Resultado=Resultado;
    }
    double getResultado(){

        return (getBeta0()+getBeta1()*Valor);
     }
    //-----------------------------------------------------------------//

    }


