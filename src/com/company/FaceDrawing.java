package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;
    public FaceDrawing(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }
    public void edit(String replace, int row, int column){
        for(int i=0; i<faceFeatures.length; i++){
            for(int j=0; j<faceFeatures[i].length;j++ ){
                if(faceFeatures[i][j]== faceFeatures[row][column]){
                    
                }
            }
        }
    }
}
