package com.zsk;

import java.util.Random;

public class Songs {
	private String songName;
	private String author;
	private int time;//假设歌曲时常为随机数
	
	private static Random random;
	static {
		 random=new Random();
	}
	public Songs(String songname,String aut) {
		songName=songname;
		author=aut;
		time=random.nextInt(5);//歌曲时长为0-5分钟的随机数
	}
	public String getSongNane() {
		return songName;
	}
	public String getSongAuthor() {
		return author;
	}
}
