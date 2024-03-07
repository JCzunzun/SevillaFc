package com.iesam.sevillaFc.features.contratedstaff.data.local;

import com.iesam.sevillaFc.features.contratedstaff.domain.player.Players;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class StaffLocalDataSource {
    private String nameFile="Players.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<Players>(){}.getType();
    public void savePlayer(Players players){
        try{
            if(!Files.exists(Paths.get(nameFile))){
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter escribir= new FileWriter(nameFile,true);
            escribir.write(gson.toJson(players)+System.lineSeparator());
            escribir.close();
            System.out.println("Datos guardados correctamente");
        }catch (IOException e) {
            System.out.println("Error al guardar los datos");
        }
    }
    public Players getPlayer(String id){
        try{
            List<String> jugadores= Files.readAllLines(Paths.get(nameFile));
            for(String jugador:jugadores){
                Players player = gson.fromJson(jugador, Players.class);
                if(player.getId().equals(id)){
                    return player;
                }
            }
        }catch (IOException e){
            System.out.println("No se pudo obtener al jugador deseado");

        }
        return null;
    }
    public ArrayList<Players> getPlayers(){
        ArrayList<Players> players= new ArrayList<>();
        try{
            List<String> jugadores = Files.readAllLines(Paths.get(nameFile));
            for(String jugador:jugadores){
                Players player= gson.fromJson(jugador,Players.class);
                players.add(player);
            }
        }catch (IOException e){
            System.out.println("Hubo un error obteniendo los jugaodres");
        }
        return players;
    }
}
