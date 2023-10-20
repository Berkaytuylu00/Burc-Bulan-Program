package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int gun, ay;
        Scanner input = new Scanner(System.in);
        System.out.print("Ay giriniz : ");
        ay = input.nextInt();

        System.out.print("Gün giriniz : ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.println("Yanlış gün girdiniz");
                }
                break;
            case 2:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 20) {
                        System.out.println("kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        System.out.println(" Balık Burcu");
                    } else {
                        System.out.println(" Koç Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        System.out.println("Koç Burcu");
                    } else {
                        System.out.println("Boğa  Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        System.out.println("İkizler Burcu");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Başak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                } else {
                    System.out.println("Yanlış Gün Girdiniz");
                }
                break;

            default:
                System.out.println("Geçersiz bir ay girdiniz");
        }
    }
}
