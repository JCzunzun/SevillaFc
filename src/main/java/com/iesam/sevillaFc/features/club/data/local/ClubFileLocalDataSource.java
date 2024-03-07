package com.iesam.sevillaFc.features.club.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.sevillaFc.features.club.domain.Club;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ClubFileLocalDataSource {
    private String nameFile="Club.txt";
    private Gson gson= new Gson();
    private Type type= new TypeToken<Club>(){}.getType();
    public void saveClub(Club club){
        try{
            if(!Files.exists(Paths.get(nameFile))){
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter escribir= new FileWriter(nameFile,true);
            escribir.write(gson.toJson(club)+System.lineSeparator());
            escribir.close();
            System.out.println("Se guardo correctsmente el club");
        }catch (IOException e){
            System.out.println("No se logro guardar el club");
        }
    }
    public Club getClub(String id){
        try{
            List<String> clubs=Files.readAllLines(Paths.get(nameFile));
            for(String club:clubs){
                Club clubSelect=gson.fromJson(club, Club.class);
                if(clubSelect.getId().equals(id)){
                    return clubSelect;
                }
            }
        }catch (IOException e){
            System.out.println("No se pudo obtener el club");
        }
        return null;
    }
}
