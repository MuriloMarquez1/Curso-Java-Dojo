package br.com.tqi.introducao;

public class ConditionalsSwitch {
    public static void testeSwitch(int numero){
        switch(numero){
            case 1:
                System.out.println("Domingo: Final de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia Util");
                break;
            case 3:
                System.out.println("Terca: Dia Util");
                break;
            case 4:
                System.out.println("Quarta: Dia Util");
                break;
            case 5:
                System.out.println("Quinta: Dia Util");
                break;
            case 6:
                System.out.println("Sexta: Dia Util");
                break;
            case 7:
                System.out.println("Sabado: Fim de semana");
                break;
            default:
                System.out.println("Dia invalido");
                break;

        }
    }
    public static void main(String[] args) {
        ConditionalsSwitch.testeSwitch(1  );

    }
}
