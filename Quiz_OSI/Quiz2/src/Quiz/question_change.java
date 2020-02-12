//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Quiz;

public class question_change {
    static String ri_frage = null;
    static String op1 = null;
    static String op2 = null;
    static String op3 = null;
    static String op4 = null;
    static int lösung = 0;
    static Quiz_Fenster quiz;
    static Ask frage_klasse;
    static String akt_Frage;

    public question_change() {
        quiz = new Quiz_Fenster();
        neueFrage();
    }

    public static void neueFrage() {
        frage_klasse = new Ask();
        akt_Frage = Ask.frage;
        parser();
        aendereText();
    }

    public static void parser() {
        String[] frage = akt_Frage.split("\\$");

        for(int x = 0; x < frage.length; ++x) {
            switch(x) {
                case 0:
                    ri_frage = frage[x];
                    break;
                case 1:
                    op1 = frage[x];
                    break;
                case 2:
                    op2 = frage[x];
                    break;
                case 3:
                    op3 = frage[x];
                    break;
                case 4:
                    op4 = frage[x];
                    break;
                case 5:
                    lösung = Integer.parseInt(frage[x]);
            }
        }

    }

    public static void aendereText() {
        quiz.ChangeLabelText(ri_frage);
        quiz.lösung = lösung;
        quiz.ChangeButtonText(1, op1);
        quiz.ChangeButtonText(2, op2);
        quiz.ChangeButtonText(3, op3);
        quiz.ChangeButtonText(4, op4);
    }
}
