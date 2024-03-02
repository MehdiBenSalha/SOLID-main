package com.directi.training.dip.exercise.refactored;

public class EncodingModuleClient {
    public static void main(String[] args) {

        String inputPath = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
        String outputPath = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";
        Reader file1 = new File(inputPath);
        Writer file2 = new File(outputPath);
        Reader network= new Network("www.google.com");
        Writer database = new MyDatabase();


        EncodingModule encodingFiles = new EncodingModule(file1, file2);
        EncodingModule encodingNetworkAndDatabase = new EncodingModule(network, database);

        encodingFiles.encode();
        encodingNetworkAndDatabase.encode();
        
    }
}
