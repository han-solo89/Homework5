public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("задание 1");
        int yearsOld = 17;
        if (yearsOld >= 18) {
            System.out.println("поздравляем вас с совершеннолетием");
        }
        if (yearsOld < 18) {
            System.out.println("возврас совершеннолетия ещё не наступил, нужно ещё подождать");
        }
        //задание 2
        System.out.println("задание 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("человек ходит в университет");
        }
        if (yearsOld > 24) {
            System.out.println("человек ходит на работу");
        }
        //задание 3
        System.out.println("задание 3");
        int capasity = 102;
        int seatsCount = 60;
        int otherCount = capasity - seatsCount; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 42;
        if (seatsUsed < seatsCount) {
            System.out.println("есть ещё" + (seatsCount - seatsUsed) + "сидячих мест");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("сидячих мест нет!");
        }
        if (otherUsed < otherCount) {
            System.out.println("есть ущё" + (otherCount - otherUsed) + "стоячих мест");
        }
        if (otherUsed == otherCount) {
            System.out.println("стоячих мест нет!");
        }
        //задание 4
        System.out.println("задание 4");
        int yearsOld2 = 19;
        if (yearsOld2 >= 18) {
            System.out.println("поздравляем вас с совершеннолетием");
        } else {
            System.out.println("возврас совершеннолетия ещё не наступил, нужно ещё подождать");
        }
        //задание 5
        System.out.println("задание 5");
        if (yearsOld2 >= 7 && yearsOld2 < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (yearsOld2 >= 18 && yearsOld2 < 24) {
            System.out.println("человек ходит в университет");
        } else if (yearsOld2 > 24) {
            System.out.println("человек ходит на работу");
        }
        //задание 6
        System.out.println("задание 6");
        int capasity2 = 102;
        int seatsCount2 = 60;
        int otherCount2 = capasity - seatsCount; // стоячие места

        int seatsUsed2 = 58;
        int otherUsed2 = 40;
        if (seatsUsed2 < seatsCount2) {
            System.out.println("есть ещё" + (seatsCount2 - seatsUsed2) + "сидячих мест");
        } else {
            System.out.println("сидячих мест нет!");
        }
        if (otherUsed2 < otherCount2) {
            System.out.println("есть ущё" + (otherCount2 - otherUsed2) + "стоячих мест");
        } else {
            System.out.println("стоячих мест нет!");
        }
        //задание 7
        System.out.println("задание 7");
        int yearsOld3 = 33;
        if (yearsOld3 >= 2 && yearsOld3 <= 6) {
            System.out.println("если возраст человека равен" + yearsOld3 + ", то ему нужно ходить в детский сад");
        } else if (yearsOld3 > 6 && yearsOld3 <= 18) {
            System.out.println("если возраст человека равен" + yearsOld3 + ", то ему нужно ходить в школу");
        } else if (yearsOld3 > 18 && yearsOld3 <= 24) {
            System.out.println("если возраст человека равен" + yearsOld3 + ", то ему нужно ходить в университет");
        } else if (yearsOld3 > 24) {
            System.out.println("если возраст человека равен" + yearsOld3 + ", то ему нужно ходить на работу");
        }
        //задание 8
        System.out.println("задание 8");
        int yearsOld4 = 5;
        if (yearsOld4 < 5) {
            System.out.println("Ребенок не может кататься на атракционах");
        } else if (yearsOld4 < 14) {
            System.out.println("Ребенок может кататься на атракционах только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на атракционах");
        }
        //задание 9
        System.out.println("задание 9");
        int one = 100;
        int two = 100;
        int fhree = 100;
        if (one > two) {
            if (one >= fhree) {
                System.out.println("максимальное число" + one);
            } else {
                System.out.println("максимальное число" + fhree);
            }
        } else if (two > one) {
            if (two >= fhree) {
                System.out.println("максимальное число" + two);
            } else {
                System.out.println("максимальное число" + fhree);
            }
        } else {
            if (one > fhree) {
                System.out.println("максимальное число" + one);
            } else if (fhree > one) {
                System.out.println("максимальное число" + fhree);
            } else {
                System.out.println("все числа равны");
            }
        }
    }
}
