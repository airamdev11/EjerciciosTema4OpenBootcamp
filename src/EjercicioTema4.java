public class EjercicioTema4 {






    public static void main(String[] args) {
        //Primera parte
        int numeroIf = 4;
        if(numeroIf<0){
            System.out.println("El numero es negativo");
        }
        else if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es un 0");
        }

        //Segunda parte
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);

        //Tercera parte
        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "VERANO";

        switch (estacion){
            case "VERANO":System.out.println("Estas en la estacion de VERANO.");
                break;
            case "OTOÑO":System.out.println("Estas en la estacion de OTOÑO.");
                break;
            case "PRIMAVERA":System.out.println("Estas en la estacion de PRIMAVERA.");
                break;
            case "INVIERNO":System.out.println("Estas en la estacion de INVIERNO.");
                break;
            default:System.out.println("No se ingreso una estación valida.");
                break;
        }
    }
}


