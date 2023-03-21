import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        int op=0;
        Scanner teclado = new Scanner(System.in);
        
        while (op < 5)   // CICLO WHILE SE EJECUTARA 
        {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. SUMA");
        System.out.println("2. MULTIPLICACION");
        System.out.println("3. DIVISION");
        System.out.println("4. RESTA");
        System.out.println("5. SALIR");
        System.out.println("SELECCIONE UNA OPCION...");
        
        op=teclado.nextInt();
        
        switch(op) // EVALUANDO OPCION EN VARIABLE OP
            {      // AQUI ESTAN MIS FUNCIONES
                case 1: suma();
                break;
                case 2: multiplicacion();
                break;
                case 3: division();
                break;
                case 4: resta();
                break;
            }
        }
    }

        public static void suma()
        {
            int a,b,c=0;
            Scanner t = new Scanner(System.in);
            
            System.out.println("INGRESE PRIMER NUMERO: ");
            a=t.nextInt();
            System.out.println("INGRESE SEGUNDO NUMERO: ");
            b=t.nextInt();
            c=a+b;
            System.out.println("EL RESULTADO ES :" + c);
            
        }
        
        public static void multiplicacion()
        {
            int a,b,c=0;
            Scanner t = new Scanner(System.in);
            
            System.out.println("INGRESE PRIMER NUMERO: ");
            a=t.nextInt();
            System.out.println("INGRESE SEGUNDO NUMERO: ");
            b=t.nextInt();
            c=a*b;
            System.out.println("EL RESULTADO ES :" + c);
            
        }

        public static void division()
        {
            int a,b,c=0;
            Scanner t = new Scanner(System.in);
            
            System.out.println("INGRESE PRIMER NUMERO: ");
            a=t.nextInt();
            System.out.println("INGRESE SEGUNDO NUMERO: ");
            b=t.nextInt();
            c=a/b;
            System.out.println("EL RESULTADO ES :" + c);
            
        }

        public static void resta()
        {
            int a,b,c=0;
            Scanner t = new Scanner(System.in);
            
            System.out.println("INGRESE PRIMER NUMERO: ");
            a=t.nextInt();
            System.out.println("INGRESE SEGUNDO NUMERO: ");
            b=t.nextInt();
            c=a-b;
            System.out.println("EL RESULTADO ES :" + c);
            
        }

    }
        

