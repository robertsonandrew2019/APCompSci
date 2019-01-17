import java.sql.SQLOutput;

public class Main {

    public static int[] voterID = new int[250];
    public static int[] president = new int[250];
    public static int[] vicePresident = new int[250];
    public static int[] secretary = new int[250];
    public static int[] treasurer = new int[250];

    public static void main(String[] args) {
        String parse = "236392,1,4,4,4;418945,3,4,4,4;408892,2,4,2,4;248043,1,1,3,2;138645,4,3,4,3;156160,4,4,2,3;121122,3,4,3,1;102572,2,4,1,4;278579,1,3,3,1;311936,2,2,1,2;180091,4,2,4,3;131991,3,4,1,3;349678,3,2,2,1;348822,4,2,1,1;358463,4,2,2,2;142865,1,1,1,2;397632,2,2,4,2;233101,2,3,2,1;336269,3,2,1,1;139745,3,1,1,1;388694,1,4,4,2;435193,1,1,2,1;298522,4,2,2,4;463523,3,2,1,3;340719,1,1,4,3;248911,4,2,4,2;176898,3,3,4,1;176697,2,1,3,4;479451,2,4,1,3;193036,1,3,2,1;130872,4,4,2,1;440023,4,4,3,4;376006,2,2,4,3;370599,1,3,3,4;114011,4,1,3,4;333671,2,1,3,3;116340,4,4,3,3;127895,3,1,1,4;475663,3,3,3,4;308242,1,2,4,4;176660,2,1,1,4;346022,3,2,4,2;313979,4,3,2,1;135913,1,2,4,2;180578,3,2,2,3;485579,4,4,2,3;313900,2,4,2,4;188421,4,2,4,3;475741,3,1,2,3;307455,3,4,3,2;356172,1,2,1,3;176303,1,2,3,3;141175,1,3,4,1;458524,1,3,1,1;359897,3,2,4,4;164080,2,2,2,4;310114,3,4,4,4;372346,3,1,2,2;341926,2,3,3,4;455848,2,1,4,2;298914,1,1,1,3;434548,3,3,3,3;454765,1,4,1,2;111469,3,3,4,2;215916,4,2,1,2;156160,4,3,1,4;409619,4,1,3,1;189440,2,1,4,2;354588,2,4,2,4;240064,2,2,1,1;317390,2,1,2,2;452034,1,1,1,3;305126,4,1,4,3;274294,3,4,4,4;473603,4,1,3,1;369608,4,2,4,3;456720,2,3,4,1;430577,1,3,4,4;420094,4,4,1,3;238780,4,1,2,4;284283,4,3,1,2;494623,1,3,2,2;345578,3,3,4,1;136356,3,3,1,2;391631,1,2,2,1;474920,4,1,2,2;484250,3,1,1,3;238515,2,4,1,3;332342,1,3,2,3;160398,4,4,3,2;251800,2,3,1,3;458410,1,1,3,3;287110,4,1,4,3;276739,2,4,3,3;207147,1,2,3,4;146882,1,1,3,2;137548,1,3,1,2;205973,4,1,1,2;205347,2,2,1,3;407213,4,1,1,3;111757,4,2,4,4;214753,2,1,1,1;423330,3,4,3,3;346175,4,1,4,4;305046,2,2,4,1;213102,1,3,1,1;443390,2,3,3,3;244222,3,3,3,1;245179,1,1,3,4;117506,2,3,2,4;190445,2,1,2,4;176303,3,1,2,1;240771,3,3,1,4;363851,3,4,4,2;206981,1,1,4,1;299605,2,1,3,3;457468,1,2,4,3;352242,1,4,2,1;444307,2,1,3,3;160376,2,2,4,2;485431,4,2,1,2;453972,3,3,4,3;202989,2,1,1,3;438282,3,4,2,4;490054,1,1,2,2;397395,1,1,2,3;240328,4,2,2,2;499270,1,3,4,1;465025,4,2,2,3;417590,1,2,4,4;188976,2,3,1,3;272392,4,4,2,2;423927,4,4,1,4;278516,3,3,1,1;120319,4,2,4,1;445179,2,1,3,3;138408,3,2,1,3;106318,4,1,4,3;138444,1,1,3,1;145097,3,1,1,2;495854,4,4,1,4;274012,1,4,3,3;167018,4,3,2,1;218219,3,2,3,4;329419,1,2,3,2;108514,1,1,4,1;186107,4,4,2,4;369057,1,1,3,1;461062,1,4,3,3;104673,1,1,3,2;463064,3,1,2,2;228802,2,1,2,2;383179,4,4,4,1;498575,4,2,3,2;445273,3,3,2,3;144250,2,2,3,4;298522,3,2,4,2;119306,2,1,4,4;402763,2,4,2,4;156269,4,4,3,2;117512,3,4,1,1;217492,4,1,1,1;228596,1,3,4,4;303953,1,4,2,2;160440,1,3,1,2;444045,3,2,2,4;362734,4,1,2,2;457199,3,2,1,1;390175,1,3,3,3;355108,3,3,4,1;260366,3,3,1,1;217192,2,3,1,3;357978,1,2,1,4;166541,3,3,1,4;109639,2,2,2,4;125169,3,2,3,1;237380,4,3,3,4;317118,3,1,2,3;280006,2,1,2,4;410177,2,3,3,4;398208,1,4,4,3;211730,4,3,2,4;105442,4,1,2,4;266893,2,3,2,4;316151,2,2,1,4;429162,3,4,2,4;414973,3,4,2,3;373728,1,2,2,1;401535,1,2,1,3;354030,2,2,1,4;461310,1,2,2,3;496987,1,3,1,1;481665,3,2,2,1;355186,4,3,4,4;337331,4,1,3,3;123777,2,3,3,1;492661,4,1,2,1;258113,2,2,4,1;319492,1,4,1,1;399666,3,1,4,4;476970,1,1,2,4;490605,4,4,4,2;475034,3,2,1,2;321855,3,2,4,3;498697,4,4,4,1;436437,1,2,3,3;104887,1,1,3,4;407201,2,4,1,2;136806,1,1,1,3;449179,1,2,1,3;447780,2,2,4,1;112827,4,4,1,1;323141,1,1,2,2;234307,1,4,2,3;246026,1,3,1,3;219714,2,4,2,1;368650,3,4,4,1;309322,1,1,2,2;495204,1,3,1,3;141214,4,1,4,3;101951,3,1,1,3;137169,1,4,2,1;250262,2,2,2,4;294619,2,2,4,4;250540,1,3,3,1;360720,4,3,2,3;187681,1,3,2,2;143402,3,3,1,2;252362,2,3,1,1;454494,2,2,1,3;427706,1,3,1,4;359923,4,1,3,4;388976,2,1,4,1;140156,2,4,4,4;459931,2,1,3,4;477808,2,2,2,4;248205,3,3,3,4;355132,1,4,3,1;103042,1,2,3,1;481606,1,2,4,2;345578,1,1,2,3;238947,4,4,1,2;473687,2,4,2,3;159439,3,3,3,1;429067,4,3,3,4;444958,3,4,4,4;474788,2,2,1,3;159366,2,2,2,1;397544,4,4,4,1;407677,1,2,2,3";
        parse(parse);
        idCheck();
        presidents();
        vicePresidents();
        secretaries();
        treasurers();
    }

    public static void parse(String parse) {
        String[] data1 = parse.split(";");
        for (int i = 0; i < data1.length; i++) {
            String[] test = data1[i].split(",");
            voterID[i] = Integer.parseInt(test[0]);
            president[i] = Integer.parseInt(test[1]);
            vicePresident[i] = Integer.parseInt(test[2]);
            secretary[i] = Integer.parseInt(test[3]);
            treasurer[i] = Integer.parseInt(test[4]);
        }
    }

    public static void idCheck() {
        for (int i = 0; i < voterID.length; i++) {
            for (int j = 0; j < voterID.length; j++) {
                if (voterID[i] == voterID[j] && i != j) {
                    voterID[i] = 0;
                    president[i] = 0;
                    vicePresident[i] = 0;
                    secretary[i] = 0;
                    treasurer[i] = 0;
                    voterID[j] = 0;
                    president[j] = 0;
                    vicePresident[j] = 0;
                    secretary[j] = 0;
                    treasurer[j] = 0;
                }
            }
        }
    }

    public static void presidents() {
        int noVote = 0;
        int golding = 0;
        int gotshalk = 0;
        int evans = 0;
        int villalobos = 0;
        for (int i = 0; i < president.length; i++) {
            if (president[i] == 0) noVote++;
            if (president[i] == 1) golding++;
            if (president[i] == 2) gotshalk++;
            if (president[i] == 3) evans++;
            if (president[i] == 4) villalobos++;
        }
        int winner = golding;
        String champion = "Mordy Golding won.";
        if (gotshalk > winner) {
            winner = gotshalk;
            champion = "Shira Gotshalk won.";
        }
        if (evans > winner) {
            winner = evans;
            champion = "Stephanie Evans won.";
        }
        if (villalobos > winner) {
            winner = villalobos;
            champion = "Ray Villalobos won.";
        }
        System.out.printf("The presidency received %d votes.\nMordy Golding: %d\nShira Gotshalk: %d\nStephanie Evans: %d\nRay Villalobos: %d\n%s\n", 250 - noVote, golding, gotshalk, evans, villalobos, champion);
    }

    public static void vicePresidents() {
        int noVote = 0;
        int sarkar = 0;
        int ahn = 0;
        int camp = 0;
        int leblanc = 0;
        for (int i = 0; i < vicePresident.length; i++) {
            if (vicePresident[i] == 0) noVote++;
            if (vicePresident[i] == 1) sarkar++;
            if (vicePresident[i] == 2) ahn++;
            if (vicePresident[i] == 3) camp++;
            if (vicePresident[i] == 4) leblanc++;
        }
        int winner = sarkar;
        String champion = "Dona Sarkar won.";
        if (ahn > winner) {
            winner = ahn;
            champion = "Tyler Ahn won.";
        }
        if (camp > winner) {
            winner = camp;
            champion = "Joe Camp won.";
        }
        if (leblanc > winner) {
            winner = leblanc;
            champion = "Brandon LeBlanc won.";
        }
        System.out.printf("\nThe vice presidency received %d votes.\nDona Sarkar: %d\nTyler Ahn: %d\nJoe Camp: %d\nBrandon LeBlanc: %d\n%s\n", 250 - noVote, sarkar, ahn, camp, leblanc, champion);
    }

    public static void secretaries() {
        int noVote = 0;
        int howard = 0;
        int rubino = 0;
        int fisher = 0;
        int edde = 0;
        for (int i = 0; i < vicePresident.length; i++) {
            if (vicePresident[i] == 0) noVote++;
            if (vicePresident[i] == 1) howard++;
            if (vicePresident[i] == 2) rubino++;
            if (vicePresident[i] == 3) fisher++;
            if (vicePresident[i] == 4) edde++;
        }
        int winner = howard;
        String champion = "Jason Howard won.";
        if (rubino > winner) {
            winner = rubino;
            champion = "Nikki Rubino won.";
        }
        if (fisher > winner) {
            winner = fisher;
            champion = "Peggy Fisher won.";
        }
        if (edde > winner) {
            winner = edde;
            champion = "Neil Edde won.";
        }
        System.out.printf("\nThe office of the secretary received %d votes.\nJason Howard: %d\nNikki Rubino: %d\nPeggy Fisher: %d\nNeil Edde: %d\n%s\n", 250 - noVote, howard, rubino, fisher, edde, champion);
    }

    public static void treasurers() {
        int noVote = 0;
        int gassner = 0;
        int bennett = 0;
        int ritscher = 0;
        int hurley = 0;
        for (int i = 0; i < treasurer.length; i++) {
            if (treasurer[i] == 0) noVote++;
            if (treasurer[i] == 1) gassner++;
            if (treasurer[i] == 2) bennett++;
            if (treasurer[i] == 3) ritscher++;
            if (treasurer[i] == 4) hurley++;
        }
        int winner = gassner;
        String champion = "David Gassner won.";
        if (bennett > winner) {
            winner = bennett;
            champion = "Sharon Bennett won.";
        }
        if (ritscher > winner) {
            winner = ritscher;
            champion = "Walt Ritscher won.";
        }
        if (hurley > winner) {
            winner = hurley;
            champion = "Heather Hurley won.";
        }
        System.out.printf("\nThe office of the treasurer received %d votes.\nDavid Gassner: %d\nSharon Bennett: %d\nWalt Ritscher: %d\nHeather Hurley: %d\n%s\n", 250 - noVote, gassner, bennett, ritscher, hurley, champion);
    }
}