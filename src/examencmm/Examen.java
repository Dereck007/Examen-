package examencmm;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Examen  {
    Scanner entrada = new Scanner(System.in);
    public int ejercicio01(){ 
    
int nota1;
int nota2;
int nota3;
int nota4;
int nota5;
int promedio=0;

System.out.println("Ingresar la Nota 01: ");        
nota1 = entrada.nextInt();

System.out.println("Ingresar la Nota 02: ");        
nota2 = entrada.nextInt();

System.out.println("Ingresar la Nota 03: ");        
nota3 = entrada.nextInt();

System.out.println("Ingresar la Nota 04: ");        
nota4 = entrada.nextInt();

System.out.println("Ingresar la Nota 05: ");        
nota5 = entrada.nextInt();

if(nota1<nota2 && nota1<nota3 && nota1<nota4 && nota1<nota5){
               promedio= (nota2+nota3+nota4+nota5 )/4;
               System.out.println("El promedio es: "+promedio);
}else{
    if (nota2<nota1 && nota2<nota3 && nota2<nota4 && nota2<nota5){
            promedio=(nota1+nota3+nota4+nota5 )/4;
               System.out.println("El promedio es: "+promedio);
    }else{
        if (nota3<nota1 && nota3<nota2 && nota3<nota4 && nota3<nota5);{
        promedio=(nota1+nota2+nota4+nota5 )/4;
               System.out.println("El promedio es: "+promedio);
    }{
        if (nota4<nota1 && nota4<nota2 && nota4<nota3 && nota4<nota5);{
            promedio=(nota1+nota2+nota3+nota5 )/4;
            System.out.println("El promedio es: "+promedio);
    }{
        if (nota5<nota1 && nota5<nota2 && nota5<nota3 && nota5<nota4);{
        promedio=(nota1+nota2+nota3+nota4 )/4;
        System.out.println("El promedio es: "+promedio);
    }    
   }
  }
 }
}               
return promedio;
    }
    
        public void ejercicio02 () {
        Scanner sc=new Scanner(System.in);
        int X=0,Y=0;
        System.out.println("Ingresa un numero ");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero ");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa un numero ");
        int numero3 = sc.nextInt();
        
        if(numero1> numero2 && numero1 > numero3 ){
            X=numero1;
        }else{
            if(numero2 > numero1 && numero2> numero3){
                X=numero2;
            }else{
                if(numero3 > numero1 && numero3 > numero2 ){
                    X=numero3;
                }
            }
        }
        if(numero1 < numero2 && numero1 < numero3 ){
            Y=numero1;
        }else{
            if(numero2 < numero1 && numero2 < numero3 ){
                Y=numero2;
            }else{
                if(numero3 < numero1 && numero3 < numero2 ){
                    Y=numero3;
                }
            }
        }
        System.out.println("El número mayor es "+X+" y el número menor es "+Y);
     }
    
    public double ejercicio03(){
    
        double cateto1;
        double cateto2;
        double hipotenusa=0;
         System.out.println("Ingresar el primer cateto: ");
         cateto1=entrada.nextDouble();
         System.out.println("Ingresar el segundo cateto: ");
         cateto2 =entrada.nextDouble();
         
        hipotenusa= (cateto1*cateto1)+(cateto2*cateto2);
        
        hipotenusa= Math.sqrt(hipotenusa);
        return hipotenusa;
}
    public void ejercicio06(){
        
        String dia;
        int numDias;
        String[] dias={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sábado"}; 
        double [] prestamo = new double[7];
        
        for (int i=0; i< dias.length;i++){
            System.out.println(i+"|"+dias[i]);
        }
        System.out.println("Ingrese el día: ");
        dia=entrada.next();
        System.out.println("Ingresar el numero del día: "+ dia);
        numDias=entrada.nextByte();
        System.out.println("Ingrese el prestamo de ese día ");
        prestamo[numDias]=entrada.nextDouble();
        
        if(prestamo[numDias]<0){
            System.out.println("No se puede reconocer este valor ");
            prestamo[numDias]=0;          
        }
        
       
    }

    public void ejercicio07(){
        
	Scanner obtener = new Scanner(System.in);
	int estudiantes,i,notaMayor,notaMenor,nota,sumaNotas;
 
	System.out.print("Ingrese los alumnos: ");
	estudiantes = obtener.nextInt();
 
	notaMayor = 0;
	notaMenor = 100;
	sumaNotas = 0;
 
 
	for(i = 1; i <= estudiantes; i++)
	{
		System.out.print("Ingrese la edad para el estudiante: " + i + " : ");
		nota = obtener.nextInt();
 
		sumaNotas = sumaNotas + nota;
		if(nota > notaMayor)
		{
			notaMayor=nota;
		}
		if(nota < notaMenor)
		{
			notaMenor=nota;
		}
	}
 
	System.out.print("La nota mayor es: " + notaMayor + "\n");
	System.out.print("La nota menor es: " + notaMenor + "\n");
    
}
    public static void main(String[] args) {
     
       Examen llamar =new Examen();
        System.out.println("El promedio de las cuatro mejores notas es: "+llamar.ejercicio01());
        
        llamar.ejercicio02();
        
        System.out.println("La hipotenusa es: "+llamar.ejercicio03());
        llamar.ejercicio06();
        llamar.ejercicio07();
      
    }
    
}
