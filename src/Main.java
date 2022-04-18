public class Main {
    public static void main(String[] args) {
//Задача №1
        byte varByte = 1;
        short varShort = 2;
        int varInteger = 3;
        long varLong = 4L;
        float varFloat = 3.14159f;
        double varDouble = 2.72;
//Задача №2
        float weightFirstFighter = 78.2f;
        float weightSecondFighter = 82.7f;
        System.out.println("Взвешивание");
        System.out.println("Общий вес обоих боксеров - "+ weightFirstFighter + weightSecondFighter + "кг.");
        System.out.println("Разница в весе боксеров - "+ (weightSecondFighter - weightFirstFighter) +"кг");
        System.out.println("-------------------------------------------");
//Задача №3
        System.out.println("Завтрак спортсмена");
        short bananaWeight = 80;
        float milkWeight = 1.05f;
        short icecreamWeight = 100;
        short eggWeight = 70;
        float totalWeight;
        short qtyBanana = 5;        //Введены переменные количества
        short qtyMilkInML = 200;    //каждого продукта с целью
        short qtyIcecream = 2;      //облегчения вычислений при их изменении
        short qtyegg = 4;
        totalWeight = qtyBanana*bananaWeight + qtyMilkInML*milkWeight + qtyIcecream*icecreamWeight + qtyegg*eggWeight;
        System.out.println("Общий вес ингридиентов в граммах - "+ totalWeight + " г.");
        System.out.println("Общий вес ингридиентов в килограммах - " + totalWeight/1000 + " кг." );
        System.out.println("-------------------------------------------"); //Время выполнения задания - 14 минут
//Задача №4
        System.out.println("График похудения. Цель - сбросить 7 кг.");
        int lostWeightSlow = 250;
        int lostWeightFast = 500;
        System.out.println("При похудении на 250 граммов ежедневно потребуется " + 7000/lostWeightSlow + "дней.");
        System.out.println("При похудении на 500 граммов ежедневно потребуется " + 7000/lostWeightFast + "дней.");
        System.out.println("В среднем потребуется "+ (7000/lostWeightSlow + 7000/lostWeightFast)/2 + "дней.");
        System.out.println("-------------------------------------------"); //На задачу ушло 9 минут
//Задача №5
        System.out.println("Расчет повышения зарплат");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Зарплата Маши после повышения: " + salaryMasha*1.1 + " руб.");
        System.out.println("Годовой доход Маши увеличился на " + salaryMasha*1.2 + " руб.");
        System.out.println();                                //salaryMasha*0.1*12
        System.out.println("Зарплата Дениса после повышения: " + salaryDenis*1.1 + " руб.");
        System.out.println("Годовой доход Дениса увеличился на " + salaryDenis*1.2 + " руб.");
        System.out.println();
        System.out.println("Зарплата Кристины после повышения: " + salaryKristina*1.1 + " руб.");
        System.out.println("Годовой доход Кристины увеличился на " + salaryKristina*1.2 + " руб.");
        System.out.println("ПОЗДРАВЛЯЕМ!"); //На задачу ушло 13 минут.

    }
}