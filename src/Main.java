public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        String resultado = "";
        if (numeroif<0){
            resultado = "la variable numeroif "+ numeroif + " es negativa";
        } else if (numeroif>0) {
            resultado = "la variable numeroif "+ numeroif + " es positiva";
        }else{
            resultado = "la variable numeroif "+ numeroif + " es cero";
        }
        System.out.println(resultado);

        int numeroWhile = 0;

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile<3);

        for (int i=0;i<=3;i++){
            System.out.println(i);
        }

        String mjs="Estación";
        var estacion = "Primavera";
        switch (estacion)
        {
            case "Verano":
                mjs+=" Verano";
                break;
            case "Primavera":
                mjs+=" Primavera";
                break;
            case "Invierno":
                mjs+="Invierno";
                break;
            case "Otoño":
                mjs+=" Otoño";
                break;
            default:
                mjs+=" Errada";
        }
        System.out.println(mjs);
    }
}