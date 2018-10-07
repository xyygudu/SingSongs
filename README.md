
<h1 align=center>文强爱唱歌</h1>
<h2>简介</h2>
<hr/>
<p style="text-indent:2em">本程序主要功能是：允许多个用户点歌，而且每个用户可以点几首歌，最后由主持人集合所有用户点歌曲，并有权力选择性的播放某一首歌曲，或者选择随机播放,先看运行结果的效果</p>
<div align=center><img src="https://github.com/xyygudu/SingSongs/blob/master/images/V%252S5~OSUZE)0PQNRLBK93Y.png" width="500"  alt="图片加载失败"/></div>
<input type="submit" value="提交"/>
<h2>Songs类</h2><hr/>
在该类中，定义了歌曲的属性：歌名、作者、和歌曲时间，其中歌曲时间是用随机数表示的（为了方便）当开辟类对象时，对Songs进行初始化，也可以理解为创造了一首歌曲，这个类中有两个函数，作用分别是获取歌曲名和作者
<h2>User类</h2><hr/>
该类是点歌的人，可以设置点歌的数量，最终都将存到List<Songs> songlist中，用户可通过addSong来点歌，这里点歌就是开辟一个Songs对象（点歌的同时也是创造歌曲）
<h2>Host类</h2><hr/>
在该类中有一个属性List<Songs> songOfAllUser用于将所有用户的歌曲集合，然后有randomSong方法设置随机播放列表中的歌曲，还可以通过chooseSong方法来选择列表中某一首歌来播放
<h2>MainCtrl类</h2><hr/>
这是程序的入口，首先开辟主持人类，用于管理，然后根据点歌人数开辟User对象，每个User点歌，并添加到songOfAllUser中，最后打印列表，选择性播放
	
