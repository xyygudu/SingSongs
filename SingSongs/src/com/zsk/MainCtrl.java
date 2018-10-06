package com.zsk;

import java.util.List;
import java.util.Scanner;

public class MainCtrl {
	public static int userNum=0;//记录有几个人点歌

	public static void main(String[] args) {
		Host host=new Host();//创建一个主持人类，用于管理所有用户的歌曲
		System.out.print("请输入总共点歌的人数：");
		Scanner in=new Scanner(System.in);
		MainCtrl.userNum=in.nextInt();
		for(int i=1;i<=MainCtrl.userNum;i++) {
			User user=new User();
			System.out.print("请输入第"+i+"个用户要点哥的数量");
			int songNum=user.songNum=in.nextInt();
			for(int j=1;j<=songNum;j++) {
				System.out.println("输入第"+j+"首歌曲名及演奏者");
				String songname=in.next();
				String author=in.next();
				user.addASong(songname, author);//添加一首歌
			}
			for(int m=0;m<user.songlist.size();m++) {
				//将每一个用户点的每一首歌最终添加到主持人管理的列表中
				host.songOfAllUser.add(user.songlist.get(m));
			}
		}
		System.out.println("已点歌曲列表如下");
		for (int i = 0; i < host.songOfAllUser.size(); i++) {
			Songs songs=host.songOfAllUser.get(i);
			System.out.println(i+".歌曲名："+songs.getSongNane()+"\t作者:"+songs.getSongAuthor());
		}
		System.out.print("主持人点歌，输入要播放歌曲的序号");
		int songnum=in.nextInt();
		host.chooseSong(songnum);
		System.out.println("按1进入随机播放");
		if(in.nextInt()==1) {
			host.randomSong();
		}

	}

}
