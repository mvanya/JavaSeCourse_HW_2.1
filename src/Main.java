import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

        // 1. Прошелся по масиву для определния значений (воспользовался лайфхаком разбив общую концепцию массива
        //    на отдельные элементы)
        // 2. Указываю условие, при деление числа не будет остатка
        System.out.print("1. Четные значения массива: ");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

        // 1. Прошелся по масиву для определния значений
        // 2. Указываю условие, при котором будут выводиться двузначные значения из масива, все чила которые больше 9
        System.out.print("2. Двузначные значения массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9    ) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // 1. Прошелся по масиву для определния значений
        // 2. Ввожу новую переменную max до цикла, т.к. указав ее в цикле у меня будут выводится все значения массива
        // 3. Прописываю условие, при котором array[i] должно быть больше максимального значения
        // 4. Для вывода максимального значения, внутри цикла говорю что максимальное значение и есть array[i]
        System.out.print("3. Максимальное значение массива: ");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.print(array[i] + " ");
            }
        }

        // 1. Прошелся по масиву для определния значений
        // 2. Ввожу переменную sum
        // 3. Прописываю что общая сумма равна предыдущей сумме плюс слудующему значению
        System.out.print("\n4. Сумма значений массива: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;

        }
        System.out.println(sum + " ");

        // 1. Прохожусь по масиву в обратном направлении, указывая что i идет от конца массива и доходит до 0
        System.out.print("5. Написать массив в обратном порядке: ");
        for (int i = array.length - 1; i>=0; --i) {
            System.out.print(array[i] +  " ");
        }

        // 1. Прохожусь по массиву от меньшего к большему
        // 2. Указываю условие, при деление числа на два будет оставаться остаток больше либо равный
        //    единице - число не четное
        System.out.print("\n6. Не четные значения массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 >= 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];

        }
        System.out.print(""+ min);

    }
}