module no.game.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    opens no.game.tictactoe.main to javafx.fxml;
    exports no.game.tictactoe.main;
}