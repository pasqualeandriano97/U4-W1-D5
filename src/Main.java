
import elementi_multimediali.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Immagine immagine = new Immagine("immagine.jpg", 10, 10);
        Video video = new Video("video.mp4", 10, "mp4", 10,5, 10);
        RegistrazioneAudio audio = new RegistrazioneAudio("audio.mp3", 10, "mp3", 5, 10);
      /* immagine.stampa();
       video.stampa();
       video.play();
       immagine.aumentaLuminosità();
       immagine.stampa();
       immagine.diminuisciLuminosità();
       immagine.stampa();
       audio.play();
*/
        ElementoMultimediale[] elementi = new ElementoMultimediale[0];
        System.out.println("Scegli tra 3 possibilità scrivendo un numero tra 1 e 3 e premi invio");

        for (int i = 0; i < 2; i++) {
            System.out.println("1. Immagine, 2. Video, 3. Registrazione Audio");
            Scanner sc = new Scanner(System.in);
            int scelta = sc.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci nome");
                    Scanner nome = new Scanner(System.in);
                    String nomeI = nome.nextLine();
                    System.out.println("Inserisci la dimensione dell'immagine");
                    Scanner dimensione = new Scanner(System.in);
                    int dimensioneI = dimensione.nextInt();
                    System.out.println("Inserisci la luminosità dell'immagine");
                    Scanner luminosità = new Scanner(System.in);
                    int luminositàI = luminosità.nextInt();
                    Immagine immagine1 = new Immagine(nomeI, dimensioneI, luminositàI);
                    elementi = addX(elementi, immagine1);
                    for (ElementoMultimediale e : elementi) {
                        System.out.println(e.toString());
                    }
                    break;
                case 2:

                    System.out.println("Inserisci nome del video");
                    Scanner nome1 = new Scanner(System.in);
                    String nomeV = nome1.nextLine();
                    System.out.println("Inserisci la dimensione del video");
                    Scanner dimensione1 = new Scanner(System.in);
                    int dimensioneV = dimensione1.nextInt();
                    System.out.println("Inserisci la luminosità del video");
                    Scanner luminosità1 = new Scanner(System.in);
                    int luminositàV = luminosità1.nextInt();
                    System.out.println("Inserisci il formato del video");
                    Scanner formato = new Scanner(System.in);
                    String formatoV = formato.nextLine();
                    System.out.println("Inserisci la durata del video");
                    Scanner durata = new Scanner(System.in);
                    int durataV = durata.nextInt();
                    System.out.println("Inserisci il volume del video");
                    Scanner volume = new Scanner(System.in);
                    int volumeV = volume.nextInt();
                    Video video1 = new Video(nomeV, dimensioneV,formatoV,durataV,volumeV, luminositàV);
                    elementi = addX(elementi, video1);
                    for (ElementoMultimediale e : elementi) {
                        System.out.println(e.toString());
                    }
                    break;
                    case 3:

                        System.out.println("Inserisci nome della registrazione audio");
                        Scanner nome2 = new Scanner(System.in);
                        String nomeR = nome2.nextLine();
                        System.out.println("Inserisci la dimensione della registrazione audio");
                        Scanner dimensione2 = new Scanner(System.in);
                        int dimensioneR = dimensione2.nextInt();
                        System.out.println("Inserisci il formato della registrazione audio");
                        Scanner formato1= new Scanner(System.in);
                        String formatoR = formato1.nextLine();
                        System.out.println("Inserisci la durata della registrazione audio");
                        Scanner durata1= new Scanner(System.in);
                        int durataR = durata1.nextInt();
                        System.out.println("Inserisci il volume della registrazione audio");
                        Scanner volume1= new Scanner(System.in);
                        int volumeR = volume1.nextInt();
                        RegistrazioneAudio registrazione1 = new RegistrazioneAudio(nomeR, dimensioneR,formatoR,durataR,volumeR);
                        elementi = addX(elementi, registrazione1);
                        for (ElementoMultimediale e : elementi) {
                            System.out.println(e.toString());
                        }
                        break;
                default:
                    System.out.println("Inserisci un numero valido");
            }

        }
        String stop="s";
        while (!stop.equals("n")){
            System.out.println("Scegli tra i 5 File Multimediali creati quale si vuole riprodurre premendo un numero tra 1 e 5 e premi invio");
            for (int i = 0; i < elementi.length; i++) {
                System.out.println(i+". "+elementi[i].toString());
            }

            String exitAndRepeat="c";


                    Scanner scelta = new Scanner(System.in);
                    int scelta1 = scelta.nextInt();
                 switch (scelta1) {
                    case 1:

                            elementi[scelta1 - 1].play();
                            System.out.println(" ");
                            if (elementi[scelta1 - 1] instanceof Immagine) {
                                Scanner scanner = new Scanner(System.in);
                                System.out.println("Inserisci L seguito da invio per aumentare la luminosità dell'immagine");
                                System.out.println("Inserisci D seguito da invio per diminuire la luminosità dell'immagine");
                                String scelta2 = scanner.nextLine();
                                switch (scelta2) {
                                    case "l":
                                        ((Immagine) elementi[scelta1 - 1]).aumentaLuminosità();

                                        break;
                                    case "d":
                                        ((Immagine) elementi[scelta1 - 1]).diminuisciLuminosità();
                                        break;
                                    default:
                                        System.out.println("Inserisci un comando valido");
                                }
                                System.out.println("Inserisci C per modificare ancora i parametrie altrimenti inserisci E per uscire");
                                Scanner scanner1 = new Scanner(System.in);
                                exitAndRepeat = scanner1.nextLine();
                                elementi[scelta1 - 1].play();
                            } else if (elementi[scelta1 - 1] instanceof Video) {
                                System.out.println("Inserisci LU seguito da invio per aumentare la luminosità del video");
                                System.out.println("Inserisci LD seguito da invio per diminuire la luminosità del video");
                                System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                                System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                                Scanner scanner = new Scanner(System.in);
                                String scelta2 = scanner.nextLine();
                                switch (scelta2) {
                                    case "lu":
                                        ((Video) elementi[scelta1 - 1]).aumentaLuminosità();
                                        break;
                                    case "ld":
                                        ((Video) elementi[scelta1 - 1]).diminuisciLuminosità();
                                        break;
                                    case "vu":
                                        ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                        break;
                                    case "vd":
                                        ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                    default:
                                        System.out.println("Inserisci un comando valido");
                                        break;
                                }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                                Scanner scanner1 = new Scanner(System.in);
                                exitAndRepeat = scanner1.nextLine();
                            } else {

                                System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                                System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                                Scanner scanner = new Scanner(System.in);
                                String scelta2 = scanner.nextLine();
                                switch (scelta2) {

                                    case "vu":
                                        ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                        break;
                                    case "vd":
                                        ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                    default:
                                        System.out.println("Inserisci un comando valido");
                                }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                                Scanner scanner1 = new Scanner(System.in);
                                exitAndRepeat = scanner1.nextLine();
                            }

                        break;
                    case 2:

                        elementi[scelta1 - 1].play();
                        System.out.println(" ");
                        if (elementi[scelta1 - 1] instanceof Immagine) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Inserisci L seguito da invio per aumentare la luminosità dell'immagine");
                            System.out.println("Inserisci D seguito da invio per diminuire la luminosità dell'immagine");
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "L":                            ((Immagine) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "D":
                                    ((Immagine) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                            elementi[scelta1 - 1].play();
                        }else if (elementi[scelta1 - 1] instanceof Video) {
                            System.out.println("Inserisci LU seguito da invio per aumentare la luminosità del video");
                            System.out.println("Inserisci LD seguito da invio per diminuire la luminosità del video");
                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "lu":
                                    ((Video) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "ld":
                                    ((Video) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                           } else {

                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {

                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();}

                        break;
                    case 3:
                        elementi[scelta1 - 1].play();
                        System.out.println(" ");
                        if (elementi[scelta1 - 1] instanceof Immagine) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Inserisci L seguito da invio per aumentare la luminosità dell'immagine");
                            System.out.println("Inserisci D seguito da invio per diminuire la luminosità dell'immagine");
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "L":                            ((Immagine) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "D":
                                    ((Immagine) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                            elementi[scelta1 - 1].play();
                        }else if (elementi[scelta1 - 1] instanceof Video) {
                            System.out.println("Inserisci LU seguito da invio per aumentare la luminosità del video");
                            System.out.println("Inserisci LD seguito da invio per diminuire la luminosità del video");
                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "lu":
                                    ((Video) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "ld":
                                    ((Video) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                        } else {

                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {

                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();}

                        break;
                    case 4:
                        elementi[scelta1 - 1].play();
                        System.out.println(" ");
                        if (elementi[scelta1 - 1] instanceof Immagine) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Inserisci L seguito da invio per aumentare la luminosità dell'immagine");
                            System.out.println("Inserisci D seguito da invio per diminuire la luminosità dell'immagine");
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "L":                            ((Immagine) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "D":
                                    ((Immagine) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                            elementi[scelta1 - 1].play();
                        }else if (elementi[scelta1 - 1] instanceof Video) {
                            System.out.println("Inserisci LU seguito da invio per aumentare la luminosità del video");
                            System.out.println("Inserisci LD seguito da invio per diminuire la luminosità del video");
                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "lu":
                                    ((Video) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "ld":
                                    ((Video) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                        } else {

                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {

                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();}

                        break;
                    case 5:
                        elementi[scelta1 - 1].play();
                        System.out.println(" ");
                        if (elementi[scelta1 - 1] instanceof Immagine) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Inserisci L seguito da invio per aumentare la luminosità dell'immagine");
                            System.out.println("Inserisci D seguito da invio per diminuire la luminosità dell'immagine");
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "L":                            ((Immagine) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "D":
                                    ((Immagine) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                            elementi[scelta1 - 1].play();
                        }else if (elementi[scelta1 - 1] instanceof Video) {
                            System.out.println("Inserisci LU seguito da invio per aumentare la luminosità del video");
                            System.out.println("Inserisci LD seguito da invio per diminuire la luminosità del video");
                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {
                                case "lu":
                                    ((Video) elementi[scelta1 - 1]).aumentaLuminosità();
                                    break;
                                case "ld":
                                    ((Video) elementi[scelta1 - 1]).diminuisciLuminosità();
                                    break;
                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();
                        } else {

                            System.out.println("Inserisci VU seguito da invio per aumentare il volume del video");
                            System.out.println("Inserisci VD seguito da invio per diminuire il volume del video");
                            Scanner scanner = new Scanner(System.in);
                            String scelta2 = scanner.nextLine();
                            switch (scelta2) {

                                case "vu":
                                    ((Video) elementi[scelta1 - 1]).aumentaVolume();
                                    break;
                                case "vd":
                                    ((Video) elementi[scelta1 - 1]).diminuisciVolume();
                                default:
                                    System.out.println("Inserisci un comando valido");
                            }  System.out.println("Inserisci C per modificare ancora i parametri altrimenti inserisci E per uscire");
                            Scanner scanner1 = new Scanner(System.in);
                            exitAndRepeat = scanner1.nextLine();}

                        break;
                    default:
                        System.out.println("Inserisci un numero valido");
                }
                         stop="s";
                        System.out.println(" ");
                        System.out.println("Vuoi riprodurre un altro file? s/n");
                        Scanner scelta2 = new Scanner(System.in);
                        stop = scelta2.nextLine();}






    }

    public static ElementoMultimediale[] addX(ElementoMultimediale myArray[], ElementoMultimediale x) {
        int i;

        // create a new array of a bigger size (+ one element)

        ElementoMultimediale newArray[] = new ElementoMultimediale[myArray.length + 1];

        // insert the elements from the old array into the new one
        for (i = 0; i < myArray.length; i++)
            newArray[i] = myArray[i];

        newArray[myArray.length] = x;
        return newArray;
    }
}