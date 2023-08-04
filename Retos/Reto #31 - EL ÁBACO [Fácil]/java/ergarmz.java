package org.edg;

public class Abaco {

    public static void main(String[] args) {

        String [] test = {"O---OOOOOOOO",
                  "OOO---OOOOOO",
                   "---OOOOOOOOO",
                   "OO---OOOOOOO",
                   "OOOOOOO---OO",
                   "OOOOOOOOO---",
                   "---OOOOOOOOO"};

        System.out.println(converAbaco(test));

    }

    public static String converAbaco(String[] abaco) {
        String convertValue = "";
        if(abaco.length == 7){
            for(String line : abaco){
                if(line.length() == 12){
                    var splitLine = line.split("---");
                    convertValue += splitLine[0].length();
                }
                else{
                    convertValue = "invaled entry";
                    break;
                }
            }
        }
        else{
            convertValue = "invaled entry";
        }
        return convertValue;
    }
}
