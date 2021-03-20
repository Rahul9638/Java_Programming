package interfaces;

public abstract interface Youtuber extends VideoEditor{
	public static final int x = 6; // by default it is public,static and final..
	abstract void makeVideo();
	
	default void uploadVideo() {
		System.out.println("Upload the video");
	}

}
