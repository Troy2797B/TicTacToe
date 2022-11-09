package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if (getWinner() == "X"){
            return true;
        } return false;
    }

    public Boolean isInFavorOfO() {
        if (getWinner() == "O"){
            return true;
        } return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        } return false;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix.length;i++){
                if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X'){
                    winner ="X";
                    break;
                }
                else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') {
                    winner = "O";
                    break;
                }
                //first column wins for both done
                else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') {
                    winner = "X";
                    break;
                }
                else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
                    winner = "O";
                    break;
                }
                //second column done
                else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
                    winner = "X";
                    break;
                }

                else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
                    winner = "O";
                    break;
                }//COLUMNS COMPLETELY DONE
                if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X'){
                    winner ="X";
                    break;
                }
                else if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
                    winner = "O";
                    break;
                }
                //first row wins for both done
                else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
                    winner = "X";
                    break;
                }
                else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') {
                    winner = "O";
                    break;
                }
                //second row done
                else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') {
                    winner = "X";
                    break;
                }

                else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
                    winner = "O";
                    break;
                }//ROWS COMPLETELY DONE
                else if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
                    winner = "X";
                    break;
                }
                else if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
                    winner = "O";
                    break;
                }
            }
        }
        return winner;
    }
}
