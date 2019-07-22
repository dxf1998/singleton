package com.zuoyang.singleton;

import java.io.*;

public class SingLetonSerializableSaveAndRead {
    public static void main(String[] args) {
        try {
            SingLetonSerializable singLetonSerializable = SingLetonSerializable.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("E://MyOne.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singLetonSerializable);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(singLetonSerializable.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("E://MyOne.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SingLetonSerializable singLetonSerializable = (SingLetonSerializable)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(singLetonSerializable.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
