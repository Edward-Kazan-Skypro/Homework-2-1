public class Main {
    public static void main(String[] args) {

        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Решение задачи 1:");
        System.out.println("Переменная dog = " + dog);
        System.out.println("Переменная cat = " + cat);
        System.out.println("Переменная paper = " + paper);

        System.out.println();

        //Задание 2
        System.out.println("Решение задачи 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Переменная dog = " + dog);
        System.out.println("Переменная cat = " + cat);
        System.out.println("Переменная paper = " + paper);

        System.out.println();
        //Задание 3
        System.out.println("Решение задачи 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Переменная dog = " + dog);
        System.out.println("Переменная cat = " + cat);
        System.out.println("Переменная paper = " + paper);

        System.out.println();
        //Задание 4
        System.out.println("Решение задачи 4:");

        var friend = 19;
        System.out.println("Переменная friend = " + friend);
        friend = friend + 2;
        System.out.println("Переменная friend = " + friend);
        friend = friend / 7;
        System.out.println("Переменная friend = " + friend);

        System.out.println();
        //Задание 5
        System.out.println("Решение задачи 5:");
        var frog = 3.5;
        System.out.println("Переменная frog = " + frog);
        frog = frog * 10;
        System.out.println("Переменная frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Переменная frog = " + frog);
        frog = frog - 4;
        System.out.println("Переменная frog = " + frog);

        System.out.println();
        //Задание 6
        System.out.println("Решение задачи 6:");

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        System.out.println("Общий вес двух бойцов равен " + (boxer1 + boxer2) + " кг");
        System.out.println("Разница в весе двух бойцов равна " + (boxer2 - boxer1) + " кг");

        System.out.println();
        //Задание 7
        System.out.println("Решение задачи 7:");
        System.out.println("Разница в весе двух бойцов равна " + (boxer2 - boxer1) + " кг - расчет вычитанием весов");
        System.out.println("Разница в весе двух бойцов равна " + (boxer2 % boxer1) + " кг - расчет остатком от деления");

        System.out.println();
        //Задание 8
        System.out.println("Решение задачи 8:");
        var totalTime = 640;
        var workEmployeeInDay = 8;
        System.out.println("Всего работников в компании – " + (totalTime / workEmployeeInDay) + " человек");
        var newSumEmployees = totalTime / workEmployeeInDay + 94;
        System.out.println("Если в компании работает " + newSumEmployees +  " человек, то всего "
          + newSumEmployees * workEmployeeInDay + " часов работы может быть поделено между сотрудниками");


        System.out.println();
    }
}