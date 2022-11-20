public class Main {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        // Задание 2.
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет, пора искать первую работу");
        }
        // Задание 3.
        int capacityWagon = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacityWagon - seatingPlaces;

        int freeSeatingPlaces = 23;
        int freeStandingPlaces = 17;

        if (freeSeatingPlaces < seatingPlaces) {
            System.out.println("Ёще есть свободных " + (seatingPlaces - freeSeatingPlaces) + " сидячих мест");
        }
        if (freeSeatingPlaces == seatingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (freeStandingPlaces < standingPlaces) {
            System.out.println("Есть ещё стоячих " + (standingPlaces - freeStandingPlaces) + " мест");
        }
        if (standingPlaces == freeStandingPlaces) {
            System.out.println("Стоячих мест нет");
        }
        //Домашнее задание - 2. Задание 1.
        System.out.println("Домашнее задание - 2.Задание 1");
        int newAge = 18;
        if (newAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        // Задание 2.
        System.out.println("Задание 2");
        if (newAge >= 7 && newAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (newAge >= 18 && newAge < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else if (newAge > 24) {
            System.out.println("Человек окончил университет, пора искать первую работу");
        }
        // Задание 3.
        int allCapacityWagon = 102;
        int allSeatingPlaces = 60;
        int allStandingPlaces = capacityWagon - seatingPlaces;

        int allFreeSeatingPlaces = 23;
        int allFreeStandingPlaces = 100;

        if (allFreeSeatingPlaces < allSeatingPlaces) {
            System.out.println("Ёще есть свободных " + (allSeatingPlaces - allFreeSeatingPlaces) + " сидячих мест");
        }
        if (allFreeSeatingPlaces == allSeatingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (allFreeStandingPlaces < allStandingPlaces) {
            System.out.println("Есть ещё стоячих " + (allStandingPlaces - allFreeStandingPlaces) + " мест");

        } else {
            System.out.println("Стоячих мест нет");
        }
        // Домашнее задание 3. Задание 1.
        System.out.println("Домашнее задание 3.Задание 1");
        int ageYearsOld = 22;
        if (ageYearsOld <= 6 || ageYearsOld <= 2) {
            System.out.println("Если возраст человека равен " + ageYearsOld + " то ему нужно ходить в садик");
        } else if (ageYearsOld >= 7 && ageYearsOld <= 18) {
            System.out.println("Если возраст человека равен " + ageYearsOld + " то ему нужно ходить в школу");
        } else if (ageYearsOld >= 18 && ageYearsOld <= 24) {
            System.out.println("Если возраст человека равен " + ageYearsOld + " то ему нужно ходить в университет");
        } else if (ageYearsOld > 24) {
            System.out.println("Если возраст человека равен " + ageYearsOld + " то ему нужно идти на работу");
        }
        // Задание 2.
        System.out.println("Задание 2");
        int ageAttraction = 13;
        if (ageAttraction <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе если ему " + ageAttraction + " лет!");
        } else if (ageAttraction > 5 && ageAttraction < 14) {
            System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого если ему " + ageAttraction + " лет!");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого ");
        }
        // Задание 3.
        System.out.println("Задание 3");
        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("Наибольшее число " + a);
        } else if (b > a && b > c) {
            System.out.println("Наибольшее число " + b);
        } else {
            System.out.println("Наибольшее число " + c);
        }
    }
}







