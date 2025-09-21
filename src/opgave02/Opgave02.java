package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();
        String vokaler = "aeiouyæøå";
        int[] vokalerCount = new int[vokaler.length()];
        beautiPrint(vokalerCount,vokaler,characterArray);
        leetSpeak(characterArray);
    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    public static int[] vokalscanner(char[] characterArray, String vokaler, int[] vokalerCount) {
        for (char c : characterArray) {

            c = Character.toLowerCase(c);
            int position = vokaler.indexOf(c);

            if (position != -1) {
                vokalerCount[position]++;
            }
        }
        return vokalerCount;
    }

    public static void beautiPrint(int[] vokalerCount, String vokaler, char[] characterArray) {
       vokalscanner(characterArray,vokaler,vokalerCount);
        for (int i = 0; i < vokaler.length(); i++) {
            System.out.println(vokaler.charAt(i) + ": " + vokalerCount[i]);
        }
    }

    public static void leetSpeak(char[] characterArray) {
        for (int index = 0; index < characterArray.length; index++) {
            switch (Character.toLowerCase(characterArray[index])) {
                case 'a':
                    characterArray[index] = '4';
                    break;
                case 'b':
                    characterArray[index] = '6';
                    break;
                case 'g':
                    characterArray[index] = '9';
                    break;
                case 'l':
                    characterArray[index] = '1';
                    break;
                case 's':
                    characterArray[index] = '5';
                    break;
                case 't':
                    characterArray[index] = '+';
                    break;
            }
        }
        for(char c : characterArray){
            System.out.print(c);
        }
        System.out.println();
    }
}

