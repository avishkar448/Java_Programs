package com.collage;
interface Camera1{
    void Photo();
    void Video();
}
interface Social_media extends Camera1{
    void Instagram();
    void Facebook();
    void Twitter();
}
class Smartphone2 implements Social_media {
    @Override
    public void Facebook() {
        System.out.println("Facebook");
    }
    public void Instagram() {
        System.out.println("Instagram");
    }
    public void Twitter() {
        System.out.println("Twitter");
    }
    public void Photo() {
        System.out.println("Photo");
    }
    public void Video() {
        System.out.println("Video");
    }
}
public class Polymorphism_interface {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        Camera1 cam=new Smartphone2();
        cam.Photo();
        cam.Video();
        System.out.println("*************************************************************");
        System.out.println("with out polymorphism");
        Social_media S=new Smartphone2();
        S.Facebook();
        S.Photo();
        S.Instagram();
        S.Twitter();
        S.Video();

    }
}
