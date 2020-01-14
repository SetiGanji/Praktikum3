package com.example.praktikum3;

import android.widget.EditText;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Client {

    private static Socket Client;
    private static BufferedReader Reader;
    private static BufferedWriter Writer;



    public static void main(String[] args) {
        System.out.println("Verbindung wird aufgebaut...");
        try {
            Client = new Socket("127.0.0.1",1010);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Writer = new BufferedWriter(new OutputStreamWriter(Client.getOutputStream()));
            Reader = new BufferedReader(new InputStreamReader(Client.getInputStream()));

            Writer.write("Hallo");//PosDaten
            Writer.newLine();
            Writer.flush();

            System.out.println(Reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
