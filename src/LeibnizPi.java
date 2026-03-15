import java.util.Scanner;

/**
 * 11. Używając pętli for() napisz program LeibnizPi, który na podstawie wzoru Leibnitza
 * będzie wyliczał liczbę Pi:
 * Zauważ, że:
 * • w pętli for() zwiększenie będzie wyglądało następująco: i = i + 2;
 * • aby mianownik był na przemian dodatni i ujemny należy zadeklarować zmienną
 * np. o nazwie znak=1 i w każdej iteracji pętli przemnażać ją przez wartość
 * -1:
 * znak = znak * (-1);
 * Zmienna mianownik będzie wtedy wyliczana:
 * mianownik = znak * i;
 * Dzięki temu zmienna mianownik będzie miała w kolejnych iteracjach na przemian
 * znak dodatni lub znak ujemy.
 * Sprawdź ile iteracji trzeba wykonać aby zwracany wynik dał wartość 3.14
 */

public class LeibnizPi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dokładność liczby PI (1-10000): ");
        int dokladnosc = scanner.nextInt();
        float suma = 0.0F;
        int znak = 1;
        for (int i = 1; i <= dokladnosc; i += 2) {
            suma += (1F / i * znak);// przemnażam przez znak, aby 1/i była na przemian dodawane i ode
            znak *= (-1);// po każdej iteracji pętli będzie raz 1 a następnie -1
        }
        suma *= 4;
        System.out.printf("Liczba PI wynosi %f", suma);
    }
}