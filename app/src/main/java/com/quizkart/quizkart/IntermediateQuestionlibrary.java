package com.quizkart.quizkart;

class  IntermediateQuestionLibrary {
    public static String[] mQuestion = new String[] {
            "In the Virtual World , WWW stands For",
            "How much is a Byte equal to ?",
            "The First Computer programmer Was______",
            "The Background picture of the desktop is callled is ____",
            " A Computer should be Protected from _____",
            "Computer Saves _____",
            "CD Stands From_____",
            "CD Pen drive , Hard disk , SD Card are",
            "The Small picture on desktop are called",
            "GUI stand for",
            "CAD stands for",
            "Which Keys re Used to put full stop and comma ?",
            "C.U means ",
            "The parts of the computer that you can touch are called",
            "1 Kilobyte (KB)=_____",
            "1 Terabytes (TB)=_____",
            "The full Form of ROM is _____",
            "DVD stand for _____",
            "Which memory stores the data permanently?",
            "What is Full from of http:?"

    };

    public String[][] mChoices = {
            {"World Without Windows","World Wide Web","World Wide Warehouse"},
            {"8 bits","16 bits","32bits","64 bits"},
            {"Charles Babbage","Lady Ada Lovelace","Bill Gate"},
            {"Thumbnail","Wallpaper","Screensaver"},
            {"Dust","Water","Both [A]&[B]"},
            {"Time","Light","Speed"},
            {"Compact Disk","Common Drive","Control Disk"},
            {"Storage Device","Games Pad","Instrument"},
            {"Monitor","icon","Taskbar"},
            {"Graphics uniform Interaction","Graphical user interface","None Of the above"},
            {"Computer art design","Computer-aided design","car art design"},
            {"Alphabet key","Punctuation keys","Number key"},
            {"Central unit","Control unit","Center United"},
            {"Software","Hardware","The Operating System"},
            {"8 bits", "1024 bytes","4bits"},
            {"1024 MB","1024 GB","1024 KB"},
            {"Read one Memory","read only memory","Random only memory"},
            {"Digital versatile Disc", "Digital versatile Device","Digital versatile Drive"},
            {"RAM","ROM","Both[A]&[B]"},
            {"hyper transfer text protocol","hyper text transfer protocol","None"},

    };
    public String[] mCorrectanswer ={"World Wide Web","8 bits","Lady Ada Lovelace","Wallpaper","Both [A]&[B]","Time","Compact Disk","Storage Device","icon","Graphical user interface","Computer-aided design","Punctuation keys","Control unit","Hardware","1024 bytes","1024 GB","read only memory","Digital versatile Disc","ROM","hyper text transfer protocol"};


    public String getQuestion(int a){
        return mQuestion[a];
    }

    public String getChoice1(int a){
        return mChoices[a][0];
    }
    public String getChoice2(int a){
        return mChoices[a][1];
    }
    public String getChoice3(int a){
        return mChoices[a][2];
    }
    public  String getCorrectAnswer(int a){
        return mCorrectanswer[a];

    }


}
