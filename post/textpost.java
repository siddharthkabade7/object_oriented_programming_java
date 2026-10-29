class textpost extends post{
    @Override 
    void post(){
        System.out.println("Posting a text message...");
    }
    @Override 
    void comment(){
        System.out.println("Commenting on text post...");
    }
    
}
