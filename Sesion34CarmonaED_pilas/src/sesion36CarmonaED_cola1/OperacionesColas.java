//clase para logica de negocio - programacion contiene los metodos de operaciones de las colas
package sesion36CarmonaED_cola1;

import javax.swing.JOptionPane;

public class OperacionesColas {//inicia clase
    //atributos y caracteristicas de las colas principales
    
    private int frente;
    private int fin;
    protected Object[] listaCola;
    //constructor que inicializa los componentes principales de las colas

    public OperacionesColas(int tamMax) {
        this.frente = 0;
        this.fin = -1; 
        listaCola = new Object[tamMax];
    }//termina constructor
    
    //metodologia insertar los elementos de la estructura cola
    public void insertar(Object dato)throws Exception{
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
        } else {
            JOptionPane.showMessageDialog(null, "Error 1 al insertar");
        }
    }//termina metodo para insertar
    
    public boolean colaLlena(){//metodo para identificar cola llena
        return fin == tamMax() - 1;
    }//metodo para identiicar cola llena, termina
    
    //tamaño de la ED cola
        public int tamMax(){
            return listaCola.length;
        }
    
    
    //metodo para imprimir cola
    public void imprimirCola(){
        
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];
            if(datoActual != null){
                JOptionPane.showMessageDialog(null, datoActual+"    :   ");
            }
        }
    }//termina clase
    
    
    
    
}//termina clase
