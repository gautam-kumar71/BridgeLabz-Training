// 17. Online Quiz Application 🧠
// Ask 5 questions (MCQs) from a user.
// ● Use arrays and for-loop.
// ● Record score.
// ● Switch for answer checking. Apply clear indentation and structured layout.


import java.util.Scanner;

public class OnlineQuizApplication{
   static int score=0;
   static String []questions={"What is the name of the highest mountain?\n","Which city is called the pink city\n",
   "Which city is called the coal capital of India?\n","Which is the longest river?\n","Who was the first astronaut to visit the space?\n"};


   static String []options={"Mount Everest\nK2\nKangchenjunga\nMount Kilimanjaro",
   "Udaipur\nJaipur\nJodhpur\nAgra",
   "Dhanbad\nRanchi\nBokaro\nJamshedpur\n",
   "Nile River\nAmazon River\nYangtze River\nMississippi River\n",
   "Yuri Gagarin\nNeil Armstrong\nBuzz Aldrin\nAlan Shepard\n"
};

static String[]answers={"Mount Everest\n","Jaipur\n","Dhanbad\n","Nile River\n","Yuri Gagarin\n"};

public static void quizGame(Scanner sc)
{
    
    for (int i = 0; i <5; i++) {
     System.out.println(questions[i]);
     System.out.println(options[i]);
     System.out.println("\n");
     System.out.println("Enter choice 1,2,3,4");
     int choice=sc.nextInt();
     switch (i) {
     case 0:
        if(choice==1) 
            score++;
     break;
     case 1:
         if(choice==2) 
             score++;
     break;

     case 2:
         if(choice==1) 
            score++;
        break;
     case 3:
      if(choice==1) 
          score++;
      break;

    case 4:
       if(choice==1) 
        score++;
     break;
}
}
}


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    quizGame(sc);
    System.out.println("The score is : "+score);    
}
}