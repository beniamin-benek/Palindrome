import java.util.Arrays;

class PalindromeChecker {

    boolean isThisPalindrome(int[] array) {
        int[] head = makeHead(array);
        int[] tail = makeTail(array);

        for (int j = 0; j < tail.length; j++) {
            if (head[j] != tail[tail.length - 1 - j]) {
                System.out.println("To nie jest palindrom!");
                return false;
            }
        }
        return true;
    }

    int[] makeHead(int[] array) {
        int[] head = new int[array.length / 2];
        for (int i = 0; i < head.length; i++)
            head[i] = array[i];
        System.out.println("Head: " + Arrays.toString(head)); //do testu
        return head;
    }

    int[] makeTail(int[] array) {
        int[] tail = new int[array.length / 2];
        if (array.length % 2 == 0) {
            for (int i = 0; i < tail.length; i++)
                tail[i] = array[tail.length + i];
        } else { //jeśli liczba elementów tablicy jest nieparzysta, nie interesuje nas element środkowy
            for (int i = 0; i < tail.length; i++)
                tail[i] = array[tail.length + 1 + i];
        }
        System.out.println("Tail: " + Arrays.toString(tail)); //do testu
        return tail;
    }

}