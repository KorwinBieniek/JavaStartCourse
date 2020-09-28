package pl.javastart.SentenceGenerator;

public class SentenceGen {
    public static void main(String[] args) {

        CreateSentence cs = new CreateSentence();

        String[] whoAdj = {"Big", "Small", "Cute", "Crazy"};
        String[] who = {"Korwin","Julia","Wonski","person"};
        String[] verb = {"loves", "hates","dislikes","likes"};
        String[] what = {"playing","eating","smoking","fighting"};
        String[] conjunction = {"with","without","because of","and"};
        String[] withWho = {"Big Jojo","Roman Smorz", "Agata Stepien", "Big Bob"};

        System.out.println(cs.createSentence(whoAdj,who,verb,what,conjunction,withWho));
    }
}
