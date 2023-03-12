public class Playground {
    char[][] matrix = new char[3][3];

    void drawPoint(int x, int y, Player c){
        if(matrix[x][y] == '0'){
            matrix[x][y] = c.symbol;
        }

    }

    void printall(){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                    System.out.print(" " + matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }
    void clear(){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                matrix[j][i] = '0';
            }
        }
    }

    boolean validInput(int x, int y) {
        if (matrix[x][y] == '0') {
            return true;
        }
        return false;
    }

    boolean checklines(){
        int i = 0;
        int j = 0;
        //Waagrecht
        for(j = 0, i = 0; j < 3;j++){
            if ((matrix[i][j] == matrix[i + 1][j] && matrix[i + 1][j] == matrix[i + 2][j]) && matrix[i][j] != '0') {
                return true;
            }
        }

        //Senkrecht
        for(i = 0, j = 0; i < 3;i++){
            if((matrix[i][j] == matrix[i][j+1] && matrix[i][j+1] == matrix[i][j+2]) && matrix[i][j] != '0') {
                return true;
            }
        }

        i = 0;
        j = 0;
        if((matrix[i][j] == matrix[i+1][j+1] && matrix[i+1][j+1] == matrix[i+2][j+2]) && matrix[i][j] != '0') {
            return true;
        }
        j = 2;
        if((matrix[i][j] == matrix[i+1][j-1] && matrix[i+1][j-1] == matrix[i+2][j-2]) && matrix[i][j] != '0') {
            return true;
        }

        return false;
    }

    void won() {
        if (checklines()) {
            System.out.println("Game Ends");
            clear();
        }
    }
}
