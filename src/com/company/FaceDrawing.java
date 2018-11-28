package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;
    public FaceDrawing(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }
    public void fill(String str){
        for(int r=0; r<faceFeatures.length; r++){
            for(int c=0; c<faceFeatures[r].length; c++){
                faceFeatures[r][c]=str;
            }
        }
    }
    public void edit(String replace, int row, int column){
        faceFeatures[row][column]=replace;
    }
    public String toString(){
        String newString="";
        for(int r=0; r<faceFeatures.length;r++){
            for(int c=0; c<faceFeatures[r].length;c++){
               newString= newString + faceFeatures[r][c];
            }
            newString = newString + "\n";
        }
        return newString;
    }
}
