public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        String resultado = "";
        if (numeroif<0){
            resultado = "El nùmero es negativo";
        } else if (numeroif>0) {
            resultado = "El nùmero es positivo";
        }else{
            resultado = "El nùmero es cero";
        }
        System.out.println(resultado);

        int numeroWhile = 0;

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile<3);

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