package com.kodilla.testing.array;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int solution(int[] A) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }
        int i = 1;
        while (a.contains(i)) {
            i++;
        }
        return i;
    }

//    Wynikiem powinna być najmniejsza dodatnia liczba, która nie występuje w tablicy A.
//
//     Przykład:
//    A = [1, 3, 6, 4, 1, 2] - metoda powinna zwrócić 5
//    A = [1, 2, 3] - metoda powinna zwrócić 4
//    A = [-3, -1] - metoda powinna zwrócić 1


    public static void main(String[] args) {
        int[] lista = new int[] {1, 2, 4, 5};
        int result = solution(lista);
        wyswietlWynik(lista, result);

        int[] lista2 = new int[] {1, 4, 8, 3, 2};
        int result2 = solution(lista2);
        wyswietlWynik(lista2, result2);

        int[] lista3 = new int[] {-3, -1};
        int result3 = solution(lista3);
        wyswietlWynik(lista3, result3);

        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2};
        int result4 = solution(lista4);
        wyswietlWynik(lista4, result4);
    }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }
}
