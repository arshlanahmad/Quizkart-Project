package com.quizkart.quizkart;

public class BeginnerQuestionLibrary {
    public static String[] mQuestion = new String[] {
            "Who is The Father Of Computer",
            "The Brain of The Computer",
            "What is The Main Part of Computer ",
            "Computer is a Machine",
            "Computer Are used in -----",
            "Machines Run On",
            "Machines Save Our -----",
            "Machines Work Very-----",
            "What do You Use to Type?",
            "Keyboard Has Many ",
            "Which Key is Use to  Give Space Between The Words ",
            "Full Form OF CPU is ",
            "Which of The Following Part of the Computer Look Like An Animal ",
            "Which part of a computer looks like a television ? ",
            "It is used to Display Data",
            "It is Used to Record  Music & Sound ",
            "It is Used to Print On Paper ",
            "VDU Stand For",
            "which of the following Can be used to Store a lot of Information",
            "WWW Stand  for ---- "
    };

    public String[][] mChoices = {
            {"JAMES Gosling","charles Babbage","Dennis Ritchie"},
            {"Monitor","Keyboard","CPU"},
            {"UPS","MotherBoard","Mouse",},
            {"Natural","Man_Made","Primary"},
            {"School","Home","All Of These"},
            {"Coal","Fuel","Electricity"},
            {"Time","Water","Blood"},
            {"Slow","Middle","Fast"},
            {"Monitor","Keyboard","Mouse"},
            {"Keys","Button","Face"},
            {"Control","Enter","Space bar"},
            {"Control Point Unit","Card Plot user","Central Processing Unit"},
            { "Mouse","KeyBoard","All Of The Above"},
            {"CPU","Pen drive","Monitor"},
            {"Printer","Monitor","WebCamera",},
            {"Speaker","Mouse","Sound Card"},
            {"Plotter","Printer","Scanner"},
            {"Visual Display Unit","Virtual Data Unit","Variable Display Unit"},
            {"CD-ROM","Keyboard","Printer"},
            {"World Wide Web","World Without Window","World Wide Warehouse"},
    };
    public String[] mCorrectanswer ={"charles Babbage","CPU","MotherBoard","Man_Made","All Of These","Electricity","Time","Fast","Keyboard","Keys","Space bar","Central Processing Unit","Mouse","Monitor","Monitor","Sound Card","Printer","Visual Display Unit","CD-ROM","World Wide Web"};


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
