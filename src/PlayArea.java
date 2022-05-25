public class PlayArea {
    Space spaces[];
    String spaceTxt[];

    public PlayArea() {
        spaces = new Space[42];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = Space.Empty;
        }
        spaceTxt = new String[42];
        for (int i = 0; i < spaceTxt.length; i++) {
            spaceTxt[i] = String.valueOf(i);
        }

    }


    public void Area() {
        System.out.println(" ");
        System.out.println(" " + spaceTxt[0] + " | " + spaceTxt[1] + " | " + spaceTxt[2] + " | " + spaceTxt[3] + " | " + spaceTxt[4] + " | " + spaceTxt[5] + " | " + spaceTxt[6]);
        System.out.println(" " + spaceTxt[7] + " | " + spaceTxt[8] + " | " + spaceTxt[9] + " | " + spaceTxt[10] + " | " + spaceTxt[11] + " | " + spaceTxt[12] + " | " + spaceTxt[13]);
        System.out.println(" " + spaceTxt[14] + " | " + spaceTxt[15] + " | " + spaceTxt[16] + " | " + spaceTxt[17] + " | " + spaceTxt[18] + " | " + spaceTxt[19] + " | " + spaceTxt[20]);
        System.out.println(" " + spaceTxt[21] + " | " + spaceTxt[22] + " | " + spaceTxt[23] + " | " + spaceTxt[24] + " | " + spaceTxt[25] + " | " + spaceTxt[26] + " | " + spaceTxt[27]);
        System.out.println(" " + spaceTxt[28] + " | " + spaceTxt[29] + " | " + spaceTxt[30] + " | " + spaceTxt[31] + " | " + spaceTxt[32] + " | " + spaceTxt[33] + " | " + spaceTxt[34]);
        System.out.println(" " + spaceTxt[35] + " | " + spaceTxt[36] + " | " + spaceTxt[37] + " | " + spaceTxt[38] + " | " + spaceTxt[39] + " | " + spaceTxt[40] + " | " + spaceTxt[41]);
        System.out.println(" ");
    }

    public void DropPiece(Space playerPiece, int locationPlaced) {
        if (spaces[locationPlaced] == Space.Empty) {
            spaces[locationPlaced] = playerPiece;
            if (playerPiece == Space.Red) {
                spaceTxt[locationPlaced] = "Red";
            }
            if(playerPiece == Space.Yellow) {
                spaceTxt[locationPlaced] = "Yellow";
            }
        }

    }
}