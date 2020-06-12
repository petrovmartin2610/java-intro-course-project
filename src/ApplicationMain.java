import Dice.TenSideDice;
import Dice.Dice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ApplicationMain {

    /**
     * main метод, извикващ методи за принтиране на игралната дъска и генериране числа за заровете
     * @author Martin Petrov
     */
    public static void main(String[] args){
        gameBoardInitializer();
        boardMovementDice();
        tenSidedDice();
    }


    /**
     * метод, четящ данни от текстов файл gameboard_init в директорията source_text_files, parse-ващ
     * стойностите от този документ и принтиращ в конзолата игралната дъска
     * @author Martin Petrov
     */
    public static void gameBoardInitializer(){
        File fileReference = new File("source_text_files/gameboard_init");

        try {
            FileReader fileReferenceReader = new FileReader(fileReference);
            BufferedReader bufferedReader  = new BufferedReader(fileReferenceReader);

            String[][] gameBoard = new String[4][8];    //масив, запазващ игралната дъска
            String lineReference;                       //променлива, запазваща номера реда в документа, до който е стигнал BufferedReader
            String tileId;                              //стойност на квадратче от игралната дъска, в случая всички са |X|
            String tileTwoCoordinates;                  //двете ''координати'' (индекси от масива) на tileId
            int tileRow;                                //координата по редове
            int tileCol;                                //координата по колони

            while((lineReference = bufferedReader.readLine()) != null) {

                String[] coordinatesCollection  = lineReference.split(":");
                tileId                     = coordinatesCollection[0];
                tileTwoCoordinates     = coordinatesCollection[1];
                String[] tileCoordinatesCollection = tileTwoCoordinates.split(",");
                tileRow = Integer.parseInt(tileCoordinatesCollection[0]);
                tileCol = Integer.parseInt(tileCoordinatesCollection[1]);

        }
            //обхождане масива с игралната дъска и задаване ст-сти на квадратчетата на игралната дъска
            for (int i=0; i<gameBoard.length; i++){
                for (int j=0; j<gameBoard.length; j++){
                    gameBoard[i][j]="|X|";
                }
            }

            gameBoard[0][4]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[0][5]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[0][6]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[0][7]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[1][7]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[2][7]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[3][4]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[3][5]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            gameBoard[3][6]="|X|";      //след горния цикъл за задаване ст-ст, този елемент се принтираше като null, затова е hardcode-нат
            //опитах да troubleshoot-на това, но се получи, явно става нещо при parse-ването на ст-сти от документа, но не успях да го открия
            gameBoard[1][1]=" - ";
            gameBoard[1][2]=" - ";
            gameBoard[1][3]=" - ";
            gameBoard[1][4]=" - ";
            gameBoard[1][5]=" - ";
            gameBoard[1][6]=" - ";
            gameBoard[2][1]=" - ";
            gameBoard[2][2]=" - ";
            gameBoard[2][3]=" - ";
            gameBoard[2][4]=" - ";
            gameBoard[2][5]=" - ";
            gameBoard[2][6]=" - ";
            gameBoard[3][7]="|S|";
            for (String[] row : gameBoard){
                System.out.println(Arrays.toString(row));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    /**
     * метод извикващ генерирана ст-ст на двустранния зар от пакет Dice, клас Dice
     * @author Martin Petrov
     */
    public static void boardMovementDice(){
        Dice twoSideDice = new Dice();
        twoSideDice.setRandomNumber();
        System.out.println(twoSideDice.getRandomNumber());
    }

    /**
     * метод извикващ генерирана ст-ст на десетстранния зар от пакет Dice, клас TenSideDice
     * @author Martin Petrov
     */
    public static void tenSidedDice(){
        TenSideDice tenSideDice = new TenSideDice();
        tenSideDice.setRandomTenNumber();
        System.out.println(tenSideDice.getRandomNumber());
    }




}
