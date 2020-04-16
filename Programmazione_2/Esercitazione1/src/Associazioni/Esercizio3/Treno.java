package Associazioni.Esercizio3;

public class Treno {
    public static void main(String[] args) {
        Vagone testa = new Vagone();
        testa.classe = 1;

        Vagone v1 = new Vagone();
        v1.classe = 1;

        testa.next = v1;

        v1.next = new Vagone();
        v1.next.classe = 2;

        v1.next.next = new Vagone();
        v1.next.next.classe = 2;

        Vagone tmp = testa;
        while (tmp != null) {
            System.out.println("vagone " + tmp.classe);
            tmp = tmp.next;
        }

        System.out.println("*************");

        Vagone ntesta=new Vagone();
        ntesta.classe=2;

        ntesta.next=testa;
        testa=ntesta;

        tmp = testa;
        while (tmp != null) {
            System.out.println("vagone " + tmp.classe);
            tmp = tmp.next;
        }
    }
}
