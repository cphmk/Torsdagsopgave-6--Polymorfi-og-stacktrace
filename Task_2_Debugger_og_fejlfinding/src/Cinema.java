import java.util.Arrays;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //Here it first need to create all the rows and seats, before we can change a specific one.

        this.seats = new String[rows][seats];

        for(int i = 0; i < this.seats.length; i++) {
            for(int n = 0; n < this.seats[i].length; n++) {
                this.seats[i][n] = "O";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return (seats.length) - 1;
    }

    public int getSeats() {
        //It needs to send back 19 not 20, because they array starts at 0, and when we try to take seat 20, it doesnt exist in the array.
        return (seats[0].length) -1;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.

    public boolean reserve(int row, int seat) {

        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result = seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}