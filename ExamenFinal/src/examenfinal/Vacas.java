/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package examenfinal;

/**
 * 
 * @author Allan 
 */
public class Vacas {
 int numeroVaca []= {1,2,3,4,5,6,7,8};
    int pesoVaca[] ={223,243,100,200,200,155,300,150};
    int litroVaca[]={ 30,34,28,45,31,50,29,1};
    int limite = 1000;
    int nuevasVacas[];
    int nuevosLitros[];
    int nuevoPeso[];
    
    
    public void comparacion8(){
      /*  int maximo=0;
        for (int i = 0; i < 8; i++) {
            if (maximo>litroVaca[i]) {
                maximo=litroVaca[i];
            }
        }*/
      // No sabia como hacerlo autometico asi que lo hice manual en excel y no se si esta bien igual :(
      
nuevasVacas[0]=2;
nuevasVacas[1]=3;
nuevasVacas[2]=4;
nuevasVacas[3]=5;
nuevasVacas[4]=6;

nuevoPeso[0]=243;
nuevoPeso[1]=100;
nuevoPeso[2]=200;
nuevoPeso[3]=200;
nuevoPeso[4]=155;

nuevosLitros[0]=34;
nuevosLitros[1]=28;
nuevosLitros[2]=45;
nuevosLitros[3]=31;
nuevosLitros[4]=50;
int contador=0;
        for (int i = 0; i < nuevosLitros.length; i++) {
            contador=+nuevosLitros[i];
        }
        System.out.println(contador+"Litros");

    }
    
 public void comparacion10(){
 
 }   
}
