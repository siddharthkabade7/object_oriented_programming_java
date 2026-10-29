class imagepost extends post {
    @Override 
    void post(){
        System.out.println("Uploading an image...");
    }
    @Override 
    void comment(){
        System.out.println("Commenting on image post...");
    }
    
}
