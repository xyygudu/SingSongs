package com.zsk;

import java.util.ArrayList;
import java.util.List;

public class User {
	public int songNum;//用户点歌数量
	public List<Songs> songlist;//用户点歌表
	public User() {
		songNum=0;
		songlist=new ArrayList<>();
	}
	
	/**
	 * 用户按歌名和作者点歌，并添加到列表
	 * @param songname
	 * @param author
	 */
	public void addASong(String songname, String author) {
		// TODO Auto-generated method stub
		Songs songs=new Songs(songname, author);
		songlist.add(songs);
	}
}
