package com.quizkart.quizkart;

class AdvanceQuestionLibrary {
    public static String[] mQuestion = new String[] {
            "Which bar is at the very top of our browser",
            "What is the full form of URL",
            "DVD storage capacity varies form ____to____",
            "A hard disk can store upto____",
            "How many types of ROM are there ?",
            "Which is record movies with high quality of video and sound",
            "Nibble = _____ bits" ,
            "Full form of IPO is _____",
            "A Combination of 8 bits makes a _____",
            "Which is an essential part of the computer?",
            "Which is used to show the date and time ?",
            "In Which Icon we can save our files",
            "Recently deleted files are stored in ____",
            "By Which icon  we can easily restore our deleted files",
            "Which icon is used to connect to the Internet?",
            "Which of the Following is not an operation",
            "Microsoft Windows is ______",
            "You can Start a program by clicking on the ______ button",
            "Who is the chairman of the Microsoft Company?",
            "What is the full form of ISP ?"
    };

    public String[][] mChoices = {
            {"Address bar","Title bar","Menu bar"},
            {"Uniform Resource Locator","Uniform Research Locator","None"},
            {"4GB to 18GB","2GB to 17GB","4GB to 17GB"},
            {"2 Gigabyte","2 Megabyte","2 Terabyte"},
            {"Three","Four","Two"},
            {"DvD","CD","USB Flash drive"},
            {"2","4","8"},
            {"Input Process Output","Information Process output","Process Input output"},
            {"byte","gigabyte","nibble"},
            {"Hard disc","DVD","Pen drive"},
            {"System Tray ","Program Tabs","None"},
            {"User Name","This PC","Recycle Bin"},
            {"Recycle bin","Taskbar","Desktop"},
            {"Network","This pc","Recycle bin"},
            {"This pc","Microsoft edge","Recycle Bin"},
            {"Linux","Oracle","Windows"},
            {"Graphic program","Operation system","word processing"},
            {"Recycle Bin","Start","System Tray"},
            {"Alexander Graham","William Henry Bill Gates","Charles babbage"},
            {"Internet service protocol","Internet service provider","None"},

    };
    public String[] mCorrectanswer ={"Address bar","Uniform Resource Locator","4GB to 18GB","2 Terabyte","Four","DvD","4","Input Process Output","byte","Hard disc","None","This PC","Recycle bin","Recycle bin","Microsoft edge","Oracle","Operation system","Start","William Henry Bill Gates","Internet service provider"};


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


