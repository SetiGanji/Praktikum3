package com.example.praktikum3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static ServerSocket  serverSocket;
    private static Socket clientSocket;

    private static BufferedReader Reader;
    private static BufferedWriter Writer;

    public static void main(String[] args) {
        System.out.println("Server startet...");
        try {
            serverSocket = new ServerSocket(1010);
        } catch (IOException e) {
            System.out.println("Der TCP-Port ist belegt!");
            e.printStackTrace();
        }
        try {
            clientSocket = serverSocket.accept();
            System.out.println("Client hat sich verbunden");
        } catch (IOException e) {
            System.out.println("Verbindung kann nicht angenommen werden!");
            e.printStackTrace();
        }

        try {
            Reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            System.out.println(Reader.readLine());
            Writer.write("Hallo Client");//
            Writer.flush();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}