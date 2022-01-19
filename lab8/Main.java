import Instruments.Flet;
import Instruments.Fortepian;
import Instruments.Instrument;
import Instruments.Skrzypce;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Fortepian("Andrzej", LocalDate.now()));
        orkiestra.add(new Flet("Andrzej", LocalDate.now()));
        orkiestra.add(new Skrzypce("Andrzej", LocalDate.now()));
        orkiestra.add(new Skrzypce("Paweł", LocalDate.now()));
        orkiestra.add(new Skrzypce("Seba", LocalDate.now()));


        for(int i = 0; i <= orkiestra.size()-1; i++){
            orkiestra.get(i).dzwiek();

        }

    }
}