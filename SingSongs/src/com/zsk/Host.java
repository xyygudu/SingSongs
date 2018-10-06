package com.zsk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Host {
	public List<Songs> songOfAllUser;//所有用户点歌总列表
	
	public Host() {
		songOfAllUser=new ArrayList<>();
	}
	
	//随机播放
	public void randomSong() {
		Random random=new Random();
		int a=random.nextInt(songOfAllUser.size());
		Songs songs=songOfAllUser.get(a);
		System.out.println("播放："+songs.getSongNane()+","+"作者："+songs.getSongAuthor());
	}
	

	public void chooseSong(int songnum) {
		// TODO Auto-generated method stub
		if(songnum<songOfAllUser.size()) {
			Songs songs=songOfAllUser.get(songnum);
			System.out.println("播放："+songs.getSongNane()+","+"作者："+songs.getSongAuthor());
		}else {
			System.out.println("请输入正确的歌曲序号");
		}
	}
}
