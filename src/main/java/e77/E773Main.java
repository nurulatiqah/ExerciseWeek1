package e77;

public class E773Main {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
    }
}