package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

/*1.Wczytywanie użytkowników z pliku do tablicy
2. Wylosowanie i uzytkowników z puli nieoznaczonej
3.



5.Jeżeli liczba uzytkownikow nieoznaczonych jest wieksza od 0 wróć do punktu 2
 */

public class Main {

    public static void main(String[] args) {
        String[] usersList = new String[14];
        String[] usersRandomed = new String[14];

        try {
            usersList = AssignUsers();
        }catch (Exception e) {
            System.out.println("Plik nie jest poprawny");
        }

    }

    public static void RandomUser(String[] userList, String[] usersRandomed){
        Random random = new Random(14);
        boolean exist = false;

        while(!exist){
        int randomNumber = random.nextInt(14);
        for ( int i = 0; i < usersRandomed.length; i++){
            if(userList[randomNumber]!=usersRandomed[i]) {
                exist = true;
                usersRandomed[usersRandomed.length]= userList[randomNumber];
            }
            }
        }

    }

    public static String[] AssignUsers() throws IOException {
        String[] usersArray = new String[14];

        RandomAccessFile file = new RandomAccessFile("src/com/company/user.txt", "r");

        FileChannel channel = file.getChannel();

        System.out.println("File size is: " + channel.size());

        ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());

        channel.read(buffer);

        buffer.flip();//Restore buffer to position 0 to read it

        System.out.println("Reading content and printing ... ");

        for (int i = 0; i < channel.size(); i++) {
            usersArray[i] = buffer.get();
        }

        channel.close();
        file.close();
        return usersArray;
    }
}
