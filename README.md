
<h1 align=center>文强爱唱歌</h1>
<h2>简介</h2>
<hr/>
<p style="text-indent:2em">本程序主要功能是：允许多个用户点歌，而且每个用户可以点几首歌，最后由主持人集合所有用户点歌曲，并有权力选择性的播放某一首歌曲，或者选择随机播放,先看运行结果的效果</p>
<div align=center><img src="https://github.com/xyygudu/SingSongs/blob/master/images/V%252S5~OSUZE)0PQNRLBK93Y.png" width="500"  alt="图片加载失败"/></div>
<h2>Songs类</h2><hr/>
在该类中，定义了歌曲的属性：歌名、作者、和歌曲时间，其中歌曲时间是用随机数表示的（为了方便）当开辟类对象时，对Songs进行初始化，也可以理解为创造了一首歌曲，这个类中有两个函数，作用分别是获取歌曲名和作者
<h2>User类</h2><hr/>
该类是点歌的人，可以设置点歌的数量，最终都将存到List<Songs> songlist中，用户可通过addSong来点歌，这里点歌就是开辟一个Songs对象（点歌的同时也是创造歌曲）
<h2>Host类</h2><hr/>
在该类中有一个属性List<Songs> songOfAllUser用于将所有用户的歌曲集合，然后有randomSong方法设置随机播放列表中的歌曲，还可以通过chooseSong方法来选择列表中某一首歌来播放
<h2>MainCtrl类</h2><hr/>
这是程序的入口
、、、
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
、、、
