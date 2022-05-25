import java.util.Scanner;
public class Game {
    private final PlayArea board;
    private final Player pOne;
    private final Player pTwo;

    public Game(){
        board = new PlayArea();
        pOne = new Player(Space.Red, 1);
        pTwo = new Player(Space.Yellow, 2);
    }

    public void Play(){
        Scanner read = new Scanner(System.in);
        board.Area();
        while(true){
            System.out.println("P1: place your piece");
            int spot = read.nextInt();
            board.DropPiece(pOne.getSpace(), spot);
            boolean won = CheckVictory();
        }

    }
    private boolean CheckVictory(){
        Space zero = this.board.spaces[0];
        Space one = this.board.spaces[1];
        Space two = this.board.spaces[2];
        Space three = this.board.spaces[3];
        Space four = this.board.spaces[4];
        Space five = this.board.spaces[5];
        Space six = this.board.spaces[6];
        Space seven = this.board.spaces[7];
        Space eight = this.board.spaces[8];
        Space nine = this.board.spaces[9];
        Space ten = this.board.spaces[10];
        Space eleven = this.board.spaces[11];
        Space twelve = this.board.spaces[12];
        Space thirteen = this.board.spaces[13];
        Space fourteen = this.board.spaces[14];
        Space fifteen = this.board.spaces[15];
        Space sixteen = this.board.spaces[16];
        Space seventeen = this.board.spaces[17];
        Space eighteen = this.board.spaces[18];
        Space ninteen = this.board.spaces[19];
        Space twenty = this.board.spaces[20];
        Space twentyOne = this.board.spaces[21];
        Space twentyTwo = this.board.spaces[22];
        Space twentyThree = this.board.spaces[23];
        Space twentyFour = this.board.spaces[24];
        Space twentyFive = this.board.spaces[25];
        Space twentySix = this.board.spaces[26];
        Space twentySeven = this.board.spaces[27];
        Space twentyEight = this.board.spaces[28];
        Space twentyNine = this.board.spaces[29];
        Space thirty = this.board.spaces[30];
        Space thirtyOne = this.board.spaces[31];
        Space thirtyTwo = this.board.spaces[32];
        Space thirtyThree = this.board.spaces[33];
        Space thirtyFour = this.board.spaces[34];
        Space thirtyFive = this.board.spaces[35];
        Space thirtySix = this.board.spaces[36];
        Space thirtySeven = this.board.spaces[37];
        Space thirtyEight = this.board.spaces[38];
        Space thirtyNine = this.board.spaces[39];
        Space fourty = this.board.spaces[40];
        Space fourtyOne = this.board.spaces[41];

        if(zero == one && one == two && two == three && three == four && four != Space.Empty){
            return true;
        }
    }




}
