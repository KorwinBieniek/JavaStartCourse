package pl.javastart.KlasyWewnetrzne_Ex1;

public class Main {
    public static void main(String[] args) {
        int[] tab = {2,4,6,1,3,7,9,8,5};
        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < n - 1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int temp = tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = temp;
                        }
                    }
                    n--;
                }while(n > 1);
            }
        };

        sortable.sort(tab);

        for (int i : tab) {
            System.out.printf("%d ", i);
        }
    }
}
