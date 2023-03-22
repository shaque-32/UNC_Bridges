// Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 12; // change the numRows dimension if you would like
    //YOUR LINE OF CODE HERE:
    private static int numCols = 12; // change the numRows dimension if you would like


    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(0, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Alien from Outerspace");
        // Set a description which will show under the title
        setDescription("This emoji just crash landed at Area 51!");
        // start method
        initialize();
        start();

    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(0, "shaque", "260127091696", numRows, numCols);
    }

    // initialize
    public void initialize() 
    {
        // Use nested loops to set the background color of your emoji
        
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:
        System.out.println("Test");
        for(int row = 0; row < getBoardHeight(); row++){
            for(int col = 0; col < getBoardWidth(); col++){
                setBGColor(row,col,NamedColor.green);
            }


        }

        // use setBGColor calls for your emoji
        //Creating eyes for Alien 
        setBGColor(3,3, NamedColor.white);
        setBGColor(4,3, NamedColor.white);
        setBGColor(3,4, NamedColor.white);
        setBGColor(4,4, NamedColor.red);

        setBGColor(3,8, NamedColor.white);
        setBGColor(3,7, NamedColor.white);
        setBGColor(4,8, NamedColor.white);
        setBGColor(4,7, NamedColor.red);

        setBGColor(6,5, NamedColor.white);
        setBGColor(5,6, NamedColor.white);
        setBGColor(5,5, NamedColor.white);
        setBGColor(6,6, NamedColor.red);


        setBGColor(1,5, NamedColor.white);
        setBGColor(2,6, NamedColor.red);
        setBGColor(2,5, NamedColor.white);
        setBGColor(1,6, NamedColor.white);

        //outlining the head of the alien
        setBGColor(0,0, NamedColor.yellow);
        setBGColor(0,1, NamedColor.yellow);
        setBGColor(0,11, NamedColor.yellow);
        setBGColor(0,10, NamedColor.yellow);
        //outlines head shape
        int x = 0;
        while(x >= 0){
            if(x>11){
                break;
            } else {            
                setBGColor(x,0, NamedColor.yellow);
                setBGColor(x,11, NamedColor.yellow);

            }
            x++;


        }

        //creating ears for the emoji
        setBGColor(6,11, NamedColor.red);
        setBGColor(6,10, NamedColor.red);
        setBGColor(5,10, NamedColor.red);
        setBGColor(7,10, NamedColor.red);

        setBGColor(6,0, NamedColor.red);
        setBGColor(6,1, NamedColor.red);
        setBGColor(5,1, NamedColor.red);
        setBGColor(7,1, NamedColor.red);

        //creating mouth of the alien

        setBGColor(9,4, NamedColor.red);
        setBGColor(9,5, NamedColor.red);
        setBGColor(9,6, NamedColor.red);
        setBGColor(9,7, NamedColor.red);


        setBGColor(10,4, NamedColor.red);
        setBGColor(10,5, NamedColor.red);
        setBGColor(10,6, NamedColor.red);
        setBGColor(10,7, NamedColor.red);
        setBGColor(10,8, NamedColor.red);
        setBGColor(10,3, NamedColor.red);



        setBGColor(11,4, NamedColor.red);
        setBGColor(10,5, NamedColor.red);
        setBGColor(10,6, NamedColor.red);
        setBGColor(10,7, NamedColor.red);





        //YOUR CODE HERE:
    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end class




