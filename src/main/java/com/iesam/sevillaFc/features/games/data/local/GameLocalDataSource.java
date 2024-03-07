package com.iesam.sevillaFc.features.games.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.sevillaFc.features.games.domain.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GameLocalDataSource {
    private String nameFile="Games.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<Game>(){}.getType();
    public void saveGame(Game game){
        try {
            if(!Files.exists(Paths.get(nameFile))){
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter escribir= new FileWriter(nameFile, true);
            escribir.write(gson.toJson(game)+System.lineSeparator());
            escribir.close();
        }catch (IOException e){
            System.out.println("No se guardo el elemento");
        }
    }
    public Game getGame(String id){
        try{
            List<String> juegos= Files.readAllLines(Paths.get(nameFile));
            for (String juego:juegos){
                Game game=gson.fromJson(juego,Game.class);
                if(game.getId().equals(id)){
                    return game;
                }

            }
        }catch (IOException e){
            System.out.println("No se pudo obtener el juego");
        }
        return null;
    }
}
