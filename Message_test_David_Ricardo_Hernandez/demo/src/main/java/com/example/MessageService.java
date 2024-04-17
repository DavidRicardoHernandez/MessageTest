package com.example;

import java.util.*;

public class MessageService {

    public static void main(String[] args) {

        Map<String, List<Map>> map = new HashMap<>();
        Map<String, Object> devicesMap1 = new HashMap<>();
        Map<String, Object> devicesMap2 = new HashMap<>();
        Map<String, Object> devicesMap3 = new HashMap<>();
        List<Map> devicesList = new ArrayList<>();

        List<String> listaMensaje1 = List.of("este", "", "", "mensaje", "");
        List<String> listaMensaje2 = List.of("", "es", "", "", "secreto");
        List<String> listaMensaje3 = List.of("este", "", "un", "", "");

        devicesMap1.put("device1", "1");
        devicesMap1.put("message", listaMensaje1);
        devicesMap2.put("device2", "2");
        devicesMap2.put("message", listaMensaje2);
        devicesMap3.put("device3", "3");
        devicesMap3.put("message", listaMensaje3);

        devicesList.add(devicesMap1);
        devicesList.add(devicesMap2);
        devicesList.add(devicesMap3);

        map.put("devices", devicesList);

        System.out.print(devicesList);

        System.out.println(getMessage(map).get("Message"));

    }

    public static Map<String, String> getMessage(Map<String, List<Map>> map){;
        Map<String, String> returnedMap = new HashMap<>();
        List<Map> devicesList1 = new ArrayList<>();
        List<String> listaFinal = new ArrayList<>();
        devicesList1 = map.get("devices");

        for (Map<String, List<String>> mapa : devicesList1) {
                List<String> strings = mapa.get("message");
                for(int i=0; i<strings.size(); i++){
                    String palabra = strings.get(i);
                    if(i<= listaFinal.size()-1){
                        if(palabra.equals("")){
                            continue;
                        }else{
                            if(!listaFinal.get(i).equals("")){
                                if( !listaFinal.get(i).equalsIgnoreCase(palabra)){
                                    listaFinal.set(i, "ERROR");
                                }
                            }else{
                                listaFinal.set(i, palabra);
                            }
                        }
                    }else {
                        listaFinal.add(palabra);
                    }

                }
        }

        returnedMap.put("Message", String.join(" ", listaFinal));
        return returnedMap;
    }
}
